// "Create annotation 'bar'" "true"
// ERROR: Unresolved reference: foo

[foo(1, "2", bar("3"))] fun test() {

}

annotation class bar(val value: String)
