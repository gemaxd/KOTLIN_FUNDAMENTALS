package functions.extensions

import kotlin.math.pow
import kotlin.math.roundToInt

fun Float.round(decimals: Int): Float {
    val factor = 10.0.pow(decimals)
    return (this * factor).roundToInt() / factor.toFloat()
}

fun Float.isInteger(): Boolean = this % 1 == 0.0F

fun Float.toInt(): Int = this.toInt()

fun Float.format(digits: Int): String = "%.${digits}f".format(this)

