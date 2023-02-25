open class Computer(val name: String, val chastota: Double, val operativka: Int) {
    fun calculateQ(): Double {
        return (0.1 * chastota) + operativka
    }
    fun printDetails(){
        println("$name - $chastota - частота Мгц, $operativka - оперативная память (В мб)")
    }
}