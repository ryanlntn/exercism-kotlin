class Year(year: Int) {
    val year = year
    val isLeap: Boolean
        get() = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))
}