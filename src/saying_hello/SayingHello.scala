package saying_hello

import scala.io.StdIn

object SayingHello {

  def stripWhiteSpace(s:String) = s.replaceAll("\\s+", "")

  def main(args: Array[String])
  {
    println("What is your name?")
    val line = StdIn.readLine()
    val name = stripWhiteSpace(line)
    println(s"Hello, $name, nice to meet you!")
  }
}
