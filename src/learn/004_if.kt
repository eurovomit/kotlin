package learn


val isTrue = true


val if0 = if (isTrue) "yes" else "no"

val if1 = 3
val if2 = true

fun if3() {
    if (if1 == 3 && !if2) {
        println("Yes")
    } else if (if1 == 2 || if2) {
        println("No")
    } else {
        println("Yes")
    }
}


val if4 = if (if1 == 3) true else false

val if5 = if (if1 == 2) {41 + 6} else {55- 3}

val if6 = if (if1 in 1..4) true else false
