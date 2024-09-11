
fun tryReadLine(query: String, queryError: String): String {
    var line = ""
    println(query)
    while (line.isBlank()) {
        line = scanner.nextLine().trim()

        if (line.isBlank())
            println(queryError)
    }
    return line
}