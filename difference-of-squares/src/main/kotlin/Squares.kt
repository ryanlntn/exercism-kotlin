private fun Int.square() = this * this

class Squares(n: Int) {
  val sum = (1..n).sum()
  val squares = (1..n).map(Int::square)
  fun squareOfSum() = sum.square()
  fun sumOfSquares() = squares.sum()
  fun difference() = squareOfSum() - sumOfSquares()
}