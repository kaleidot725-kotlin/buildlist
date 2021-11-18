import java.util.*

fun main() {
    val listA : List<String> = buildList {
        add("1")
        add("2")
        add("3")
    }
    println(listA)

    val listB : List<String> = buildList(capacity = 3) {
        add("1")
        add("2")
        add("3")
    }
    println(listB)

    val listC : List<String> = buildList(capacity = 3) {
        add("1")
        add("2")
        add("3")
    }
    println(listC)
}