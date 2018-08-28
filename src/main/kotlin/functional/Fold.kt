package functional

val items = listOf(1, 2, 3, 4, 5)

val repeatFun: String.(Int) -> String = {times -> this.repeat(times)}

fun runStrTrans(f: (String, Int) -> String) = f("hello", 3)

val stringPlus: String.(String) -> String = String::plus

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

    val repeatStr = repeatFun("hi", 10)
    val repStr2 = "hi ".repeatFun(15)

    println(repeatStr)
    println(repStr2)

    println(runStrTrans(repeatFun))

    println(stringPlus("H", "iIII"))
    println(stringPlus.invoke("HIII" , "2222"))
    println("Hello".stringPlus("  world"))
}
