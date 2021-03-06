// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList
import java.lang as j

fun box(): String {
    val list1 = ArrayList<Double>()
    for (i in 0.0..5.0 step j.Double.POSITIVE_INFINITY) {
        list1.add(i)
        if (list1.size() > 23) break
    }
    if (list1 != listOf<Double>(0.0)) {
        return "Wrong elements for 0.0..5.0 step j.Double.POSITIVE_INFINITY: $list1"
    }

    val list2 = ArrayList<Float>()
    for (i in 0.0.toFloat()..5.0.toFloat() step j.Float.POSITIVE_INFINITY) {
        list2.add(i)
        if (list2.size() > 23) break
    }
    if (list2 != listOf<Float>(0.0.toFloat())) {
        return "Wrong elements for 0.0.toFloat()..5.0.toFloat() step j.Float.POSITIVE_INFINITY: $list2"
    }

    val list3 = ArrayList<Double>()
    for (i in 5.0 downTo 0.0 step j.Double.POSITIVE_INFINITY) {
        list3.add(i)
        if (list3.size() > 23) break
    }
    if (list3 != listOf<Double>(5.0)) {
        return "Wrong elements for 5.0 downTo 0.0 step j.Double.POSITIVE_INFINITY: $list3"
    }

    val list4 = ArrayList<Float>()
    for (i in 5.0.toFloat() downTo 0.0.toFloat() step j.Float.POSITIVE_INFINITY) {
        list4.add(i)
        if (list4.size() > 23) break
    }
    if (list4 != listOf<Float>(5.0.toFloat())) {
        return "Wrong elements for 5.0.toFloat() downTo 0.0.toFloat() step j.Float.POSITIVE_INFINITY: $list4"
    }

    return "OK"
}
