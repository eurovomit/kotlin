package learn


val wh1 = 3
val wh2 = 4
val wh3 = when (wh1) {
    0 -> "null"
    1 -> "one"
    in 2..4 -> if (wh1 == 2) "two" else "three"
    else -> "other"
}


val wh4 = when (val wh5 = wh1 * 3) {
    0 -> "null"
    1 -> "one"
    in 2..9 -> if (wh1 == 2) "two" else "three"
    else -> "other"
}


val wh5 = when {
    wh1 > wh2 -> {"a"}
    else -> "other"
}

