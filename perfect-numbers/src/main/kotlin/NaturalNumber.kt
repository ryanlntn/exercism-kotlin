import kotlin.math.ceil
import kotlin.math.sqrt

enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun getFactors(naturalNumber: Int): Set<Int> {
    val factors = mutableSetOf(1)
    val upperBound: Int = ceil(sqrt(naturalNumber.toDouble())).toInt()

    for (i in 2..upperBound) {
        if (naturalNumber % i == 0) {
            factors.add(i)
            factors.add(naturalNumber / i)
        }
    }

    return factors.minus(naturalNumber)
}

fun classify(naturalNumber: Int): Classification {
    require(naturalNumber > 0) {
        "$naturalNumber is not a natural number."
    }

    val aliquotSum: Int = getFactors(naturalNumber).sum()
    val difference: Int = aliquotSum - naturalNumber

    return when {
        difference > 0 -> Classification.ABUNDANT
        difference < 0 -> Classification.DEFICIENT
        else           -> Classification.PERFECT
    }
}
