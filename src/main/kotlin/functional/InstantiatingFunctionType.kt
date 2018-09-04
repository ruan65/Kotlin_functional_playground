package functional

fun strModifier(input: String, modFun: (String) -> String) : String {

    return modFun(input)
}

fun main(args: Array<String>) {

    println(strModifier("hello0", fun(s: String): String {return s.toUpperCase()}))
    println(strModifier("hello1", String::toUpperCase))
    println(strModifier("hello2", {a -> a.toUpperCase() }))
    println(strModifier("hello3", {it.toUpperCase() }))
    println(strModifier("hello4") {it.toUpperCase() })
}