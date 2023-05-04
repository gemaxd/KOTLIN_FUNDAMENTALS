package functions.extensions

fun Short.isPositive(): Boolean = this > 0

fun Short.isNegative(): Boolean = this < 0

fun Short.isEven(): Boolean = this % 2 == 0

fun Short.isOdd(): Boolean = this % 2 != 0

fun Short.isInRange(start: Short, end: Short): Boolean = this in start..end