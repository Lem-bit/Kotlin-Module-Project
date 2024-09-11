
interface MenuElement {
    //Получить элемент меню
    fun getName(): String
}

interface MenuData {
    //Что вывести перед выводом меню
    fun getStartDialog(): String
    //Меню добавления нового элемента
    fun getMenuNewElementDialog(): String
    //Список элементов меню (нумерованный с 1)
    fun getMenuElements(): List<MenuElement>
    //Действие при выборе добавления нового элемента
    fun doNewElement()
    //Выбор элемента из списка
    fun doSelectByIndex(index: Int): Unit
}

class Menu(val obj: MenuData) {

    fun print() {
        println(obj.getStartDialog())

        println("0. " + obj.getMenuNewElementDialog())
        obj.getMenuElements().forEachIndexed{index, menuElement ->
            println((index + 1).toString() + ". ${menuElement.getName()}")
        }
        println((obj.getMenuElements().size + 1).toString() + ". Выход")
    }

    fun doAction(): Boolean {
        val index = scanner.nextLine().trim().toIntOrNull()
        when (index) {
            0 -> obj.doNewElement()
            in 1..obj.getMenuElements().size -> obj.doSelectByIndex(index!! - 1)
            obj.getMenuElements().size + 1 -> { return false }
            else ->
                println("Неверно указан номер меню")
        }

        return true
    }
}