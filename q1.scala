object StringReversal{
    def reverseString(s: String): String = {
        if(s.isEmpty) {
            s
        }else{
            reverseString(s.tail) + s.head
        }
    }

    def main(args: Array[String]): Unit = {
        val input = "hello"
        val reversed = reverseString(input)
        println(s"The reverse of '$input' is: '$reversed'")
    }
}