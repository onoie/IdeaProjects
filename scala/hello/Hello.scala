object Main{
  def main (args: Array[String]){
    println(Hello(args))
  }
  def Hello (args: Array[String]) = {
    args.headOption match {
      case Some(name) => "Hello," + name + "!"
      case None => "HelloWorld!"
    }
  }
}
