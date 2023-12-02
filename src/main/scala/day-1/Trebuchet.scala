import scala.io.Source

object Trebuchet {

    val numbers: Seq[Int] = Seq(0,1,2,3,4,5,6,7,8,9)
    var filename = "src/main/scala/day-1/resources/input"
    
    def main(string: String = null): Int = {
        if(!string.isEmpty()) { filename = string }
        var concatenated: Seq[Int] = Seq()
        for (line <- Source.fromFile(filename).getLines()) {
            val result = find_ints(line)
            concatenated = concatenated :+ result
        }
        print_result(concatenated)
    }
    
    def find_ints(string: String): Int = {
        val digitIndices = numbers.flatMap { digit =>
            string.zipWithIndex.collect {
                case (char, index) if char.isDigit && char.asDigit == digit => index
            }
        }
        val firstDigit = string.charAt(digitIndices.min).toString
        val lastDigit = string.charAt(digitIndices.max).toString
        (firstDigit + lastDigit).toInt
    }

    def print_result(ints: Seq[Int]): Int = {
        print(ints.sum)
        ints.sum
    }
}