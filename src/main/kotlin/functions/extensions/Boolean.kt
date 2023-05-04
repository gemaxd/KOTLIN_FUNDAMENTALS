package functions.extensions

fun Boolean.toggle(): Boolean = !this

fun Boolean.toStringTrueFalse(): String = if (this) "True" else "False"

fun Boolean.toStringYesNoUpperCase(): String = if (this) "YES" else "NO"

fun Boolean.toStringYesNoLowerCase(): String = if (this) "yes" else "no"