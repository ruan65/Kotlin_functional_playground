package functional

val items = listOf(1, 2, 3, 4, 5)

fun main(args: Array<String>) {

    println(items)

    val folded = items.fold(0) { acc, i ->
        println("acc = $acc, i = $i")

        val result = acc + i
        result

    }


    println(folded)

    val joinedToString = items.fold("") { acc, i -> if (acc.isEmpty())"$i" else "$acc $i" }

    println(joinedToString)

    val product = items.fold(1, Int::times)

    println(product)

}
