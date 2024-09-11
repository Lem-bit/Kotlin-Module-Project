class Notes(private val ownerName: String): MenuData {


    private val notes = mutableListOf<Note>()

    override fun getStartDialog(): String {
        return ownerName + ": Список заметок"
    }

    override fun getMenuNewElementDialog(): String {
        return "Создать заметку"
    }

    override fun getMenuElements(): List<MenuElement> {
        return notes
    }

    override fun doSelectByIndex(index: Int) {
        println("***************************************")
        println("Заметка: " + notes[index].getName() )
        println("Описание: " + notes[index].about )
        println("***************************************")
    }

    override fun doNewElement() {
        val noteName  = tryReadLine("Введите название заметки", "Название заметки не может быть пустым")
        val noteAbout = tryReadLine("Введите описание заметки", "Описание заметки не может быть пустым")
        notes.add(Note(noteName, noteAbout))
    }
}