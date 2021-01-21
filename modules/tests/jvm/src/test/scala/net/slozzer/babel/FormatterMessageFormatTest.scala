package net.slozzer.babel

import mf._
import munit.FunSuite

final class FormatterMessageFormatTest extends FunSuite {
  test("arguments") {
    assertEquals(obtained = Quantities.one("{0} / {1} = {2}")(Seq(10, 5, "2")), expected = "10 / 5 = 2")
  }
}
