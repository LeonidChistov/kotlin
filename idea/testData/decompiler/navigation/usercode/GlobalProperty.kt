import testData.libraries.*

fun foo() {
    println(testData.libraries.globalVal)
    println(globalValWithGetter)
}

// main.kt
//public val <1>globalVal : Pair<Int, String> = Pair(239, "239")
//
//public val <2>globalValWithGetter : Long