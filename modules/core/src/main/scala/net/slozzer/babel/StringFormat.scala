package net.slozzer.babel

import scala.collection.mutable

abstract class StringFormat1 {
  def apply(v1: String): String

  final override def toString: String = apply(StringFormat.marker(1))
}

object StringFormat1 {
  implicit val encoder: Encoder[StringFormat1] = Encoder[String].contramap(_.toString)

  implicit val decoder: Decoder[StringFormat1] = StringFormat.decoder(1) { (head, segments) => v1 =>
    StringFormat.build(head, segments, Vector(v1))
  }
}

abstract class StringFormat2 {
  def apply(v1: String, v2: String): String

  final override def toString: String = apply(StringFormat.marker(1), StringFormat.marker(2))
}

object StringFormat2 {
  implicit val encoder: Encoder[StringFormat2] = Encoder[String].contramap(_.toString)

  implicit val decoder: Decoder[StringFormat2] = StringFormat.decoder(2) { (head, segments) => (v1, v2) =>
    StringFormat.build(head, segments, Vector(v1, v2))
  }
}

final case class StringFormat(head: String, segments: List[(Int, String)])

object StringFormat {
  def empty(head: String): StringFormat = StringFormat(head, Nil)

  def of(head: String, segments: (Int, String)*): StringFormat = StringFormat(head, segments.toList)

  def marker(value: Int): String = "$" + value

  private val Regex = "\\$(\\d+)".r

  def parse(value: String): StringFormat = {
    val matches = Regex.findAllMatchIn(value).toVector

    if (matches.isEmpty) StringFormat.empty(value)
    else {
      val result = mutable.ListBuffer.empty[(Int, String)]

      matches.indices.foreach { index =>
        val matsch = matches(index)
        val identifier = matsch.group(1).toInt
        val next = matches.lift(index + 1)
        result.addOne(identifier -> value.substring(matsch.end, next.map(_.start).getOrElse(value.length)))
      }

      StringFormat(value.substring(0, matches.head.start), result.toList)
    }
  }

  private[babel] def decoder[A](n: Int)(f: (String, Map[Int, String]) => A): Decoder[A] = Decoder[String].emap {
    (value, path) =>
      val format = parse(value)
      val indices = format.segments.map { case (index, _) => index }
      val duplicates = indices.diff(indices.distinct).distinct

      if (indices.length > 1) {
        val message = s"StringFormat$n may not have more than $n placeholders, found ${format.segments.length}"
        Left(Decoder.Error(message, path, cause = None))
      } else if (indices.exists(_ > n)) {
        val offenders = indices.filter(_ > n).mkString(", ")
        val message = s"StringFormat$n may not have placeholder indices higher than $n, found $offenders"
        Left(Decoder.Error(message, path, cause = None))
      } else if (duplicates.nonEmpty) {
        val offenders = duplicates.mkString(", ")
        val message = s"StringFormat$n may not have duplicate indices, found duplicates for $offenders"
        Left(Decoder.Error(message, path, cause = None))
      } else Right(f(format.head, format.segments.toMap))
  }

  private[babel] def build(head: String, segments: Map[Int, String], values: Vector[String]): String = {
    val builder = new StringBuilder(head)

    segments.foreach { case (index, segment) =>
      builder.append(values(index - 1)).append(segment)
    }

    builder.result()
  }
}