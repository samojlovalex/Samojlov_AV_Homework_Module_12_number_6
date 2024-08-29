import kotlinx.coroutines.delay

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
suspend fun main() {

    coffeeMachine()

}

suspend fun selectMenu(menu: Coffee) {
    when (menu) {
        is Coffee.Americano -> {
            val americanoPrint = "Ваш кофе готов: ${menu.name}, сахар:${menu.sugar} ед., объем:${menu.volume} мл\n"
            printResult(americanoPrint)
        }

        is Coffee.Cappuccino -> {
            val cappuccinoPrint =
                "Ваш кофе готов: ${menu.name}, сахар:${menu.sugar} ед., объем:${menu.volume} мл, взбитое молоко:${menu.milk} мл\n"
            printResult(cappuccinoPrint)
        }

        is Coffee.Latte -> {
            val lattePrint = "Ваш кофе готов: ${menu.name}, сахар:${menu.sugar} ед., объем:${menu.volume} мл\n"
            printResult(lattePrint)
        }
    }
    println("Приятного аппетита!")
}

suspend fun coffeeMachine() {

    val correctChoice = CorrectChoice()

    println("Кофе – машина")
    println(
        "Выберете напиток:\n" +
                "1. Американо\n" +
                "2. Капучино\n" +
                "3. Латте"
    )

    var drink = readln()
    drink = correctChoice.drinkInCorrectChoice(drink)

    println(
        "Выберете количества сахара:\n" +
                "В допустимом диапазоне: [0...5] ед."
    )
    val sugar = readln()
    val sugarIn = correctChoice.sugarToIntCorrectChoice(sugar)

    println(
        "Выберете объем кофе:\n" +
                "В допустимом диапазоне: [200...500] мл"
    )
    val volume = readln()
    val volumeIn = correctChoice.volumeToIntCorrectChoice(volume)

    var milkIn = 0
    if (drink == "2") {
        println(
            "Выберете объем молока:\n" +
                    "В диапазоне [100...300] мл"
        )
        val milk = readln()
        milkIn = correctChoice.milkToIntCorrectChoice(milk)
    }

    val americano = Coffee.Americano(sugarIn, volumeIn)
    val cappuccino = Coffee.Cappuccino(sugarIn, volumeIn, milk = milkIn)
    val latte = Coffee.Latte(sugarIn, volumeIn)

    val list = listOf(americano, cappuccino, latte)

    getLine("-")

    preparation()

    selectMenu(list[drink.toInt() - 1])
}

suspend fun preparation() {
    println("\nИдёт приготовление вашего напитка\n")
    for (i in 0..100) {
        if (i % 10 == 0) {
            delay(500L)
            print(" $i % ")
        }
    }
    println("")
}

suspend fun printResult(result: String) {
    println("")
    result.forEach { i ->
        delay(50L)
        print(i)
    }
}