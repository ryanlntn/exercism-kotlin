import kotlin.math.pow
import kotlin.math.round

class SpaceAge(ageInSeconds: Number) {
    val ageInSeconds: Double = ageInSeconds.toDouble()
    val earthOrbitalPeriod: Double = 31557600.0

    fun roundTo(n: Double, places: Int): Double {
        val factor = 10.toDouble().pow(places)
        return round(n * factor) / factor
    }
    fun ageOn(planet: String): Double {
        val orbitalPeriod = when (planet) {
            "mercury" -> 0.2408467
            "venus"   -> 0.61519726
            "mars"    -> 1.8808158
            "jupiter" -> 11.862615
            "saturn"  -> 29.447498
            "uranus"  -> 84.016846
            "neptune" -> 164.79132
            else      -> 1.0
        }
        val adjustedAge =
            ageInSeconds / earthOrbitalPeriod / orbitalPeriod

        return roundTo(adjustedAge, 2)
    }

    fun onEarth(): Double = ageOn("earth")
    fun onMercury(): Double = ageOn("mercury")
    fun onVenus(): Double = ageOn("venus")
    fun onMars(): Double = ageOn("mars")
    fun onJupiter(): Double = ageOn("jupiter")
    fun onSaturn(): Double = ageOn("saturn")
    fun onUranus(): Double = ageOn("uranus")
    fun onNeptune(): Double = ageOn("neptune")
}