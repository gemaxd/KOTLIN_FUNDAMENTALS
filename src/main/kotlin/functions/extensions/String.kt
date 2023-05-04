package functions.extensions

import java.util.*

fun String.isPhoneNumber(): Boolean {
    val phoneRegex = Regex("""^\+(?:[0-9] ?){6,14}[0-9]$""")
    return phoneRegex.matches(this)
}

fun String.isEmail(): Boolean {
    val emailRegex = Regex("""^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z]{2,}$""", RegexOption.IGNORE_CASE)
    return emailRegex.matches(this)
}

fun String.toCamelCase(): String {
    return this.split(" ").joinToString("")
    { it ->
        it.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
        }
    }
}

fun String.isNumeric(): Boolean {
    return this.matches(Regex("\\d+"))
}

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}