import java.lang.Double.max
import kotlin.math.pow
import kotlin.math.sqrt

class Lab6() {
    fun task1()
    {
        print("Enter a b c d x:\n")
        val (a, b, c, d, x) = readLine()!!.split(' ').map(String::toDouble)

        println("\nу=МАХ(a, b, c, d): ${task1Subtask1(a, b, c, d)}")
        println("y=x^4: ${task1Subtask2(x)}")
        println("y=a*(x^2) + bx + c: ${task1Subtask3(a, b, c, x)}")
    }


    private fun task1Subtask1(a: Double, b: Double, c: Double, d: Double): Double {
        return max(a, max(b, max(c, d)))
    }

    private fun task1Subtask2(x: Double): Double {
        return x.pow(4)
    }

    private fun task1Subtask3(a: Double, b: Double, c: Double, x: Double): Double {
        return a * x.pow(2) + b*x + c
    }

    fun task2() {
        print("Enter a b c y:\n")
        val (a, b, c, y) = readLine()!!.split(' ').map(String::toDouble)


        println("y=x^4: x = ${task2Subtask1(y)}")
        println("y=a*(x^2) + bx + c: ${task2Subtask2(a, b, c, y)}")
        println("у=ax + c: x = ${task2Subtask3(a, c, y)}")
    }

    private fun task2Subtask1(y: Double): Double {
        return sqrt(sqrt(y))
    }

    private fun task2Subtask2(a: Double, b: Double, c: Double, y: Double): String {
        if (a == 0.0) {
            if (b == 0.0) {
                return "incorrect input"
            }
            return ((y - c) / b).toString()
        }
        val c1 = c - y
        val d = b * b - 4.0 * a * c1

        if (d > 0) {
            val x1 = (-b + sqrt(d)) / (2 * a)
            val x2 = (-b - sqrt(d)) / (2 * a)
            return "x1 = $x1 x2 = $x2"
        } else if (d == 0.0) {
            val x = -b / (2 * a)
            return "x = $x.toString()"
        }
        return "no roots in real numbers"
    }

    private fun task2Subtask3(a: Double, c: Double, y: Double): Double {
        return (y - c)/a
    }
}

fun main() {
    val lab6 = Lab6()
    lab6.task1()
    lab6.task2()
}