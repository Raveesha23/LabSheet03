object StringFilter {
  def longStrings(list: List[String]): List[String] = {
    if (list.isEmpty) {
        Nil
    } else if (list.head.length > 5) {
        list.head :: longStrings(list.tail)
    } else {
        longStrings(list.tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val input = List("Hello", "Programming", "World", "University")
    val filtered = longStrings(input)
    println(s"Strings with length greater than 5: $filtered")
  }
}
