package Acronym

fun generate(phrase: String): String =
    phrase.
    split(Regex("[ -]")).
    map { w -> w[0] }.
    joinToString("").
    toUpperCase()