package test

trait A<T> {
    fun foo(): T
}

abstract class B : A<Int> {
    override abstract fun foo(): Int
}
