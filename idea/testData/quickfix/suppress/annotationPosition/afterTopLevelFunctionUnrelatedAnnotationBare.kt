// "Suppress 'REDUNDANT_NULLABLE' for fun foo" "true"

[suppress("REDUNDANT_NULLABLE")]
ann fun foo(): String?<caret>? = null

annotation class ann