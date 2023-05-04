package functions.local

fun myMainFunction(numero: Int): Int {
    fun duplication(valor: Int): Int {
        return valor * 2
    }

    return duplication(numero)
}