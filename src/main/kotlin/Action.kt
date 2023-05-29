abstract class Action {
    var menuNumb: Int = 0
    var choice: Int = 0
    var noteText: MutableMap<Int, Note> = HashMap()

    abstract fun command()

    fun commandReader(): Int {
        while (true) {
            val comChoice = readlnOrNull()?.toIntOrNull()
            if (comChoice != null) {
                return comChoice
            } else {
                println("Введите один из пунктов меню в виде числа")
            }
        }
    }
    abstract fun printing()
}