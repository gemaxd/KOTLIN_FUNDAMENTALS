package functions.extensions

fun Char.isUpperCase(): Boolean = this in 'A'..'Z'

fun Char.isLowerCase(): Boolean = this in 'a'..'z'

fun Char.isDigit(): Boolean = this in '0'..'9'

fun Char.isWhiteSpace(): Boolean = this == ' ' || this == '\t' || this == '\n'

fun Char.toAscii(): Int = this.toInt()