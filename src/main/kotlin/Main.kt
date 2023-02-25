fun main(args: Array<String>) {
    println("Вариант 1")
    val computer = Computer("AMD RYZEN 9 3700X", 4.1, 24000)
    val computer2 = Computer("AMD FX-8350", 8.7, 8132)
    computer.printDetails()
    computer2.printDetails()
    val Q = computer.calculateQ()
    println("значение Q для компьютера ${computer.name}: $Q")

    println("Вариант 2")
    val mobil = Mobil("MTS RUS", 100.99, 700)
    val mobil2 = Mobil("MEGAFON", 99.99, 500)
    mobil.printDetails()
    mobil2.printDetails()
    val R = mobil.calculateQ()
    println("Значение Q для мобильного оператора ${mobil.name}: $R")

    }





