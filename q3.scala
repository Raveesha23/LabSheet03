object ArithmeticMean{
    def mean(num1: Int, num2: Int): Double = {
        val sum = num1 + num2

        val avg = sum / 2.0
         BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
        return avg
    }

    def main(args: Array[String]): Unit = {
        val num1 = 5
        val num2 = 10
        val result = mean(num1, num2)
        println(f"Arithmetic mean of $num1 and $num2 is: $result%.2f")
    }
}