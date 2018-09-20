package Pangram

fun isPangram(input: String): Boolean {
    val regex = "[^a-z]".toRegex()
    val sanitized = input.toLowerCase().replace(regex, "")
    var sorted = CharArray(26)

    for (character in sanitized) {
        sorted[character.toInt() - 97] = character
    }

    return sorted.joinToString("") == "abcdefghijklmnopqrstuvwxyz"
}
