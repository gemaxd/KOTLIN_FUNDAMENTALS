package functions.extensions

fun Int.isPrime(): Boolean {
    if (this <= 1) {
        return false
    }
    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

fun Int.toRomanNumeral(): String {
    val numerals = mapOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )
    var number = this
    var numeral = ""
    for (num in numerals.keys) {
        while (number >= num) {
            numeral += numerals[num]
            number -= num
        }
    }
    return numeral
}

fun Int.toOrdinalString(): String {
    val suffixes = listOf("th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th")
    return when {
        this in 11..13 -> "$this${suffixes[0]}"
        else -> "$this${suffixes[this % 10]}"
    }
}

fun Int.toBinaryString(): String = Integer.toBinaryString(this)

fun Int.isEven(): Boolean = this % 2 == 0

fun Int.isOdd(): Boolean = this % 2 == 1