package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

trait Trait {
    fun foo(const: String)
}

class TraitImpl : Trait {
    override fun foo(const: String) {
    assertEquals("123", const)
    testRenamed("const", { const })
}
}

class TestDelegate : Trait by TraitImpl() {
    fun test() {
        foo("123")
    }
}

fun box(): String {
    TestDelegate().test()

    return "OK"
}