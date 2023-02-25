open class Mobil(val name: String, val price: Double, val ploshad: Int) {
    fun calculateQ(): Double {
        return 100 * ploshad / price
    }
    fun printDetails(){
        println("$name - $price - стоимость 1 минуты, $ploshad - Плошадь покрытия")
    }
}