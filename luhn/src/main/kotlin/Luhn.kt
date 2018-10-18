package Luhn

private fun String.clean(): String = this.replace(" ", "")
private fun Char.parseInt(): Int = this.toString().toInt()
private val Int.isOdd: Boolean get() = this and 1 != 0
private fun Int.isDivisibleBy(n: Int): Boolean = this % n == 0

fun isValid(n: String): Boolean {
  val cleaned = n.clean()
  return if (!"[\\d]{2,}".toRegex().matches(cleaned)) {
    false
  } else {
    cleaned
    .map(Char::parseInt)
    .reversed()
    .foldIndexed(0, {
      index, total, next -> if (index.isOdd) {
        total + (next * 2).let { if (it > 9) (it - 9) else it }
      } else {
        total + next
      }
    })
    .isDivisibleBy(10)
  }
}