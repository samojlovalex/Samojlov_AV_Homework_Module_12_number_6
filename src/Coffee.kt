sealed class Coffee  {
    abstract val name: String
    abstract val sugar: Int
    abstract val volume: Int

    class Americano(override val sugar: Int, override val volume: Int, override val name: String = "Американо") : Coffee()
    class Cappuccino(override val sugar: Int, override val volume: Int, override val name: String = "Капучино", val milk: Int) : Coffee()
    class Latte(override val sugar: Int, override val volume: Int, override val name: String = "Латте") : Coffee()


}