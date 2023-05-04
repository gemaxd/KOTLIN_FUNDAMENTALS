package types.string

fun stringLength(text: String): Int {
    return text.length
}

fun stringConcatenate(firstString: String, secondString: String): String {
    return firstString + secondString
}

fun substringCount(texto: String, subtexto: String): Int {
    return texto.count {
        it.toString() == subtexto
    }
}