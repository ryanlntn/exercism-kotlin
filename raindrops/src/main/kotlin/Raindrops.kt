package Raindrops

fun convert(x: Int): String {
    fun isFactor(y: Int): Boolean = x % y == 0
    val isFactor3 = if (isFactor(3)) "Pling" else ""
    val isFactor5 = if (isFactor(5)) "Plang" else ""
    val isFactor7 = if (isFactor(7)) "Plong" else ""
    val s = "$isFactor3$isFactor5$isFactor7"
    return if (s.length > 0) s else x.toString()
}