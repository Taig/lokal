package io.taig.lokal

import cats.implicits._
import org.scalatest.funsuite.AnyFunSuite

final class TranslationTest extends AnyFunSuite {
  val english: Translation[String] =
    Translation(Locale(Language("en")), "Hello")
  val germany: Translation[String] =
    Translation(Locale(Language("de")), "Hallo")
  val austria: Translation[String] =
    Translation(Locale(Language("de"), Country("AT")), "Grüß Gott")
  val spain: Translation[String] =
    Translation(Locale(Language("es"), Country("ES")), "Hola")
  val translations: Translation[String] = english & germany & austria & spain

  test("translate picks the exact match") {
    assert(
      translations
        .translate(Locale(Language("de"), Country("AT"))) eqv Some("Grüß Gott")
    )
  }

  test("translate falls back to the language if country is not available") {
    assert(
      translations
        .translate(Locale(Language("de"), Country("DE"))) eqv Some("Hallo")
    )
  }

  test("translate falls back to a different country if all else fails") {
    assert(
      translations
        .translate(Locale(Language("es"), Country("AR"))) eqv Some("Hola")
    )
  }

  test("translate returns None if no matching language is available") {
    assert(translations.translate(Locale(Language("fr"))) eqv None)
  }
}
