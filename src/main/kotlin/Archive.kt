class Archive(private val name: String): MenuElement {

    private val notes = Notes(name)

    fun getNotes(): Notes {
        return notes
    }

    override fun getName(): String {
        return this.name
    }
}