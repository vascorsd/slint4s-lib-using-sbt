import typings.slintUi.mod as slint

@main
def main: Unit = {
  println(" ^^ slint4s ^^")

  // prove case class is seen and available
  val p1 = Person("jo")

  println("hi")
  println(p1.name)

  // check which target was used
  println(Platform.v)

  val ui = slint.loadFile("about.slint")
}
