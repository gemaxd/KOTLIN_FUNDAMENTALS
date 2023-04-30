package patterns.singleton

class TheSingleton private constructor() {
    companion object {
        private var instance: TheSingleton? = null
        fun getInstance(): TheSingleton {
            if (instance == null) {
                println("A new singleton instance have been created!")
                instance = TheSingleton()
            }else{
                println("Returning the instance previously created!")
            }
            return instance!!
        }
    }

    fun doSomething() {
        println("Singleton instance is doing something!")
    }
}