import java.io.File

class Dz14 {
    var encryptStep = 3
    fun task1() {
        print("File name: ")
        val fileName = readLine().toString()
        val file = File("files/$fileName")
        if (!file.exists()) {
            println("File was not found")
            return
        }

        print("Substring to replace: ")
        val substring = readLine().toString()

        print("String to write: ")
        val newString = readLine().toString()

        var fileText = file.readText()
        fileText = fileText.replace(substring, newString)
        file.writeText(fileText)
    }

    fun task2() {
        print("File name: ")
        val fileName: String = readLine().toString()
        var file = File("files/$fileName")
        if (!file.exists()) {
            println("File was not found")
            return
        }
        val text = file.readText()

        file = File("files/$fileName.bak")
        file.writeText(text)
    }

    fun task3() {
        print("File name: ")
        val fileName: String = readLine().toString()
        val file = File("files/$fileName")
        if (!file.exists()) {
            println("File was not found")
            return
        }

        val oddFile = File("files/${fileName}_odds")
        val evenFile = File("files/${fileName}_odds")

        var counter = 1;
        file.forEachLine {
            if (counter % 2 == 1) {
                oddFile.appendText("$it\n")
            } else {
                evenFile.appendText("$it\n")
            }
            counter++
        }
    }

    fun task4() {
        print("File name: ")
        val fileName = readLine().toString()
        val file = File("files/$fileName")
        if (!file.exists()) {
            println("File was not found")
            return
        }
        file.writeText(encrypt(file))
    }

    fun task5() {
        print("File name: ")
        val fileName = readLine().toString()
        val file = File("files/$fileName")
        if (!file.exists()) {
            println("File was not found")
            return
        }

        file.writeText(decrypt(file))
    }

    private fun encrypt(file: File): String {
        var result: String = ""
        file.readText().forEach {
            result += Char(it.code + encryptStep)
        }
        return result
    }

    private fun decrypt(file: File): String {
        var result: String = ""
        file.readText().forEach {
            result += Char(it.code - encryptStep)
        }
        return result
    }
}

fun main() {
    val dz14 = Dz14()
    println("Enter task number: ")
    var taskNumber = readLine()!!.toInt()

    when (taskNumber) {
        1 -> dz14.task1()
        2 -> dz14.task2()
        3 -> dz14.task3()
        4 -> dz14.task4()
        5 -> dz14.task5()
    }
}