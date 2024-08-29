class CorrectChoice {

    fun drinkInCorrectChoice(choice: String): String {
        var choiceTwo = choice
        var correctTwo = choiceTwo == "1" || choiceTwo == "2" || choiceTwo == "3"
        while (!correctTwo) {
            println(
                "\nОШИБКА! Введено недопустимое значение." +
                        "\nВведите значение из предложенного списка"
            )

            choiceTwo = readln()
            correctTwo = choiceTwo == "1" || choiceTwo == "2" || choiceTwo == "3"
        }
        return choiceTwo
    }

    fun sugarToIntCorrectChoice(choice: String): Int {
        var choiceTwo = choice
        var correctOut = false
        while (!correctOut) {
            var correctInt = choiceTwo.toIntOrNull() != null
            while (!correctInt) {
                println(
                    "\nОШИБКА! Введено недопустимое значение." +
                            "\nВведите целое число в диапазоне [0...5] ед."
                )
                choiceTwo = readln()
                correctInt = choiceTwo.toIntOrNull() != null
            }
            val correctNumber = choiceTwo.toInt() in 0..5
            if (!correctNumber) println(
                "\nОШИБКА! Введено недопустимое значение." +
                        "\nВведите целое число в диапазоне [0...5] ед."
            )
            correctOut = correctNumber
            if (!correctOut) {
                choiceTwo = readln()
            }
        }
        return choiceTwo.toInt()
    }

    fun volumeToIntCorrectChoice(choice: String): Int {
        var choiceTwo = choice
        var correctOut = false
        while (!correctOut) {
            var correctInt = choiceTwo.toIntOrNull() != null
            while (!correctInt) {
                println(
                    "\nОШИБКА! Введено недопустимое значение." +
                            "\nВведите целое число в диапазоне [200...500] мл"
                )
                choiceTwo = readln()
                correctInt = choiceTwo.toIntOrNull() != null
            }
            val correctNumber = choiceTwo.toInt() in 200..500
            if (!correctNumber) println(
                "\nОШИБКА! Введено недопустимое значение." +
                        "\nВведите целое число в диапазоне [200...500] мл"
            )
            correctOut = correctNumber
            if (!correctOut) {
                choiceTwo = readln()
            }
        }
        return choiceTwo.toInt()
    }

    fun milkToIntCorrectChoice(choice: String): Int {
        var choiceTwo = choice
        var correctOut = false
        while (!correctOut) {
            var correctInt = choiceTwo.toIntOrNull() != null
            while (!correctInt) {
                println(
                    "\nОШИБКА! Введено недопустимое значение." +
                            "\nВведите целое число в диапазоне [100...300] мл"
                )
                choiceTwo = readln()
                correctInt = choiceTwo.toIntOrNull() != null
            }
            val correctNumber = choiceTwo.toInt() in 100..300
            if (!correctNumber) println(
                "\nОШИБКА! Введено недопустимое значение." +
                        "\nВведите целое число в диапазоне [100...300] мл"
            )
            correctOut = correctNumber
            if (!correctOut) {
                choiceTwo = readln()
            }
        }
        return choiceTwo.toInt()
    }
}