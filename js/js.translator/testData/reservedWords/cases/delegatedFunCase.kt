package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

trait Trait {
    fun case()
}

class TraitImpl : Trait {
    override fun case() { case() }
}

class TestDelegate : Trait by TraitImpl() {
    fun test() {
        testNotRenamed("case", { ::case })
    }
}

fun box(): String {
    TestDelegate().test()

    return "OK"
}