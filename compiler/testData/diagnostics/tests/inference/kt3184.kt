//KT-3184 Type inference seems partially broken
package a

import java.util.HashMap

private fun <T> test(value: T, extf: String.(value: T)->Unit) {
    "".extf(value)
}

fun main(args: Array<String>) {
    test(1, {value -> println(value)})
}

fun tests() {
    val dict = HashMap<String, (String) -> Unit>()
    dict["0"] = { str -> println(str) }
    dict["1"] = { println(it) }

    dict.set("1", { println(it) })
    dict["1"] = { r -> println(r) }
}

// from standard library
fun <K, V> MutableMap<K, V>.set(key : K, value : V) : V<!BASE_WITH_NULLABLE_UPPER_BOUND!>?<!> = this.put(key, value)

fun println(message : Any?) = System.out.println(message)