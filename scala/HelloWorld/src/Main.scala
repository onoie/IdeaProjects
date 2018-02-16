import scala.compat.Platform.EOL

object HelloWorld {
  def main(args: Array[String]){
    println("Hello,World!")
    if(args.size == 0) {
      val strs = Array("Hello"+EOL+"NewWorld")
      puts(strs)
      var capital = Map("US" -> "Washington")
      capital += ("Japan" -> "Tokyo")
      println(capital("Japan")) //Tokyo
    } else {
      printf("Invalid args.")
    }
  }
  var str = "string"
  def getStr: String = str
  def setStr(str: String):Unit ={
    this.str=str
  }
  val f: Function1[Int, String] = new Function1[Int, String] {
    def apply(arg: Int): String = arg.toString
  }
  f.apply(10)
  def concatAsString(a: Int, b: Int): String = {
    val a_ = a.toString
    val b_ = b.toString
    a_.+(b_)
  }
  def puts(strs: Array[String]):Unit = {
    for(str <- strs) {
      printf("%s ", str)
    }
  }
  def oneline(str: String):Unit = {
    printf("%s ",str.replaceAll("(\r\n)|\r|\n", ""))
  }
  def pre(str: String): Unit ={
    printf("%s ",str.replaceAll("(\r\n)|\r|\n", EOL))//sys.props("line.separator")
  }
}
