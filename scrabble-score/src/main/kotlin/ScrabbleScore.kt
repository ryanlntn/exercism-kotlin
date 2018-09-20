package ScrabbleScore

fun scoreCharacter(character: Char): Int =
    when (character.toUpperCase()) {
        'D', 'G'                -> 2
        'B', 'C', 'M', 'P'      -> 3
        'F', 'H', 'V', 'W', 'Y' -> 4
        'K'                     -> 5
        'J', 'X'                -> 8
        'Q', 'Z'                -> 10
        else                    -> 1
    }

fun scoreWord(word: String): Int =
    word.map{ scoreCharacter(it) }.sum()