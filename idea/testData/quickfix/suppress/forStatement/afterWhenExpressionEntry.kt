// "Suppress 'UNNECESSARY_NOT_NULL_ASSERTION' for statement " "true"

fun foo(a: Any) {
    [suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
    when (a) {
        ""<caret>!! -> {}
    }
}