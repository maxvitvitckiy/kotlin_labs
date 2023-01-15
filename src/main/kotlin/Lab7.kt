class Lab7 {
    fun task1(n: Int) {
        println("$n fibonacci numbers:")
        fibonacci(n)
    }
    private fun fibonacci(n: Int): Array<Int> {
        if (n <= 0) {
            println("0 - 0")
            return arrayOf(1, 0)
        }
        val previous: Array<Int> = fibonacci(n - 1)
        val result = previous.last() + previous.first()
        println("$n - $result")
        return arrayOf(previous.last(), result)
    }

    fun task2(n: Int) {
        println("factorial of $n = ${factorial(n)}")
    }

    private fun factorial(n: Int): Int {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1)
    }

    fun task3(n: Int) {
        println("$n has ${count(n)} digits")
    }

    private fun count(n: Int): Int {
        if (n < 10) {
            return 1
        }
        return count(n / 10) + 1
    }
}

fun main() {
    val lab7 = Lab7()

    print("Enter n: ")
    var n = readLine()!!.toInt()
    lab7.task1(n)
    print("Enter n: ")
    n = readLine()!!.toInt()
    lab7.task2(n)
    print("Enter n: ")
    n = readLine()!!.toInt()
    lab7.task3(n)
}
