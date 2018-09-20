import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(birthDateTime: LocalDateTime) {
    constructor(birthdate: LocalDate) : this(birthdate.atStartOfDay())
    val date: LocalDateTime = birthDateTime.plusSeconds(1e9.toLong())
}