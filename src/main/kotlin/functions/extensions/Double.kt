package functions.extensions

import java.text.NumberFormat
import java.util.*
import kotlin.math.pow
import kotlin.math.roundToInt

fun Double.toCurrency(currencySymbol: String = "$"): String {
    val formatter = NumberFormat.getCurrencyInstance()
    formatter.currency = Currency.getInstance(currencySymbol)
    return formatter.format(this)
}

fun Double.isNegative(): Boolean = this < 0

fun Double.roundTo(numDecimalPlaces: Int): Double {
    require(numDecimalPlaces >= 0) { "Número de casas decimais deve ser maior ou igual a zero" }
    val factor = 10.0.pow(numDecimalPlaces)
    return (this * factor).roundToInt() / factor
}

fun Double.isInRange(minValue: Double, maxValue: Double): Boolean =
    this in minValue..maxValue

fun Double.toRadians(): Double = Math.toRadians(this)