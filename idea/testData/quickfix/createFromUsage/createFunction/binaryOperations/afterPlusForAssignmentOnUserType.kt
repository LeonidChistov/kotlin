// "Create function 'plus'" "true"

class A<T>(val n: T) {
    fun plus(t: T): A<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun test() {
    var a = A(1)
    a = a + 2
}