fun wordsCount(words: List<String>) = words.filter { symbol -> symbol.any { it.isLetter() } }.size

fun numericsCount(words: List<String>) = words.filter { symbol -> symbol.all { it.isDigit() } }.size

fun lettersOnly(string: String) = string.filter { it.isLetter() }

fun replaceSpaces(string: String) = string.replace("\\s+".toRegex(), " ")

fun deleteLowercaseWords(words: List<String>) =
    words.filter { it.first().isUpperCase() }.joinToString(" ")


fun main() {
    println("Enter string: ")
    val string = readLine().toString()
    val words = string.split("\\s+".toRegex())
    println(wordsCount(words))
    println(numericsCount(words))
    println(lettersOnly(string))
    println(replaceSpaces(string))
    println(deleteLowercaseWords(words))
}