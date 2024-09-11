import java.util.Scanner

var scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    val menu = Menu(Archives())

    while (true) {
       menu.print()
       if (!menu.doAction())
           break
    }
}
