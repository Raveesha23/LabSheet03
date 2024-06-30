object EvenSum{
    def sumOfEven(numbers: List[Int]): Int = {
        if(numbers.isEmpty){
            0
        }else{
            val head = if(numbers.head % 2 == 0){numbers.head} else{0}
            head + sumOfEven(numbers.tail)
        }
    }

    def main(args: Array[String]): Unit = {
        val input = List(1, 2, 3, 4, 5, 6)
        val sum = sumOfEven(input)
        println(s"The sum of all the evn numbers in the list is: $sum")
    }
}