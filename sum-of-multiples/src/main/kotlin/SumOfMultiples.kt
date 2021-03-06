package SumOfMultiples

fun sum(set: Set<Int>, n: Int): Int {
    val multiples: Set<Int> = mutableSetOf("wat")

    for (y in 1..(n - 1)) {
        for (x in set) {
            if (y % x == 0) {
                multiples.add(y)
            }
        }
    }

    return multiples.sum()
}