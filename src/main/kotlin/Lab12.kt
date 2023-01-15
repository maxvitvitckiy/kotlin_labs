enum class Weekd(val day: Int) {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7),
}

class Lab12 () {
    fun task1() {
        print("Enter symbol: ")
        val char: Char = readLine()!![0]
        print("Is digit: ")
        println(char.isDigit())
        print("Is lowercase latin: ")
        println(char in 'a'..'z')
        print("Is latin: ")
        println(char in 'a'..'z' || char in 'A'..'Z')
    }

    fun task2() {
        print("Enter day of the week: ")
        val dayNumber: Int = readLine()!!.toInt()

        val day = findDay(dayNumber)
        if (day != null) {
            println("$dayNumber is ${day.name}")
        } else {
            println("Incorrect input")
        }
    }

    fun task3() {
        print("Enter day of the week: ")
        var dayNumber: Int = readLine()!!.toInt()

        val nextDay = (dayNumber + 1) % 8
        val day = findDay(nextDay)

        println("Tomorrow is ${day?.name}")
    }

    fun task4() {
        print("First number: ")
        val a: Double = readLine()!!.toDouble()

        print("Second number: ")
        val b: Double = readLine()!!.toDouble()

        print("Operation: ")
        val c: Char = readLine()!![0]

        println(when (c) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> a / b
            else -> {
                println("Incorrect operation")
            }
        })
    }

    fun task5() {
        print("Enter N: ")
        val n: Int = readLine()!!.toInt()
        if (n <= 3) {
            println("N must be greater than 3")
            return
        }
        var result = Int.MAX_VALUE

        var resultA = 0
        var resultB = 0
        (0..100).forEach { a ->
            (0..100).forEach { b ->
                if (5 * a - 2 * b == n && a + b < result) {
                    result = a + b
                    resultA = a
                    resultB = b
                }
            }
        }
        if (resultA == 0 && resultB == 0) {
            print("No result found")
        } else {
            print("A = $resultA, B = $resultB")
        }
    }

    private fun findDay(n: Int): Weekd? {
        for (day in Weekd.values()) {
            if (n == day.day) {
                return day
            }
        }
        return null
    }
}

fun main() {
    val lab12 = Lab12()

    print("Task: ")
    val taskNumber = readLine()!!.toInt()

    when (taskNumber) {
        1-> {lab12.task1()}
        2-> {lab12.task2()}
        3-> {lab12.task3()}
        4-> {lab12.task4()}
        5-> {lab12.task5()}
    }
}