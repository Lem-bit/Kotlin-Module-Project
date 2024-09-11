class Note(private val name: String, val about: String): MenuElement {

    override fun getName(): String {
        return name
    }
}