class Archives : MenuData {

    private val archives = mutableListOf<Archive>()

    override fun getStartDialog(): String {
        return "Список архивов:"
    }

    override fun getMenuNewElementDialog(): String {
        return "Добавить архив"
    }

    override fun getMenuElements(): List<MenuElement> {
        return archives
    }

    override fun doSelectByIndex(index: Int) {

        println("Выбран архив: " + archives[index].getName())
        val menu = Menu(archives[index].getNotes())
        while (true) {
            menu.print()
            if (!menu.doAction())
                break
        }
    }

    override fun doNewElement() {
        val archName = tryReadLine("Введите название архива", "Название архива не может быть пустым")
        archives.add(Archive(archName))
    }

}