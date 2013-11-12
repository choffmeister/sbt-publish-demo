package de.choffmeister.app

import de.choffmeister.testlib._

object Main extends App {
  val greeter = new Greeter()
  val greeting = greeter.greet()

  println(greeting)
}
