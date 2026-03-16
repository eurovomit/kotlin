package learn


private fun testFun0(one: Int, two: Int): Int {
    val result = one * two
    return result
}

//аргументы по умолчанию
private fun testFun1(one: Int = 2, two: Int = 4): Int {
    val result = one * two
    return result
}

//запись функции с одним выражением можно сократить
private fun testFun2(one: Int = 2, two: Int = 4): Int = one * two
private fun testFun3(one: Int = 2, two: Int = 4) = one * two

//если функция ничего не возвращает, она имеет тип Unit, этот тип сделан для работы с обобщениями
private fun testFun4() = println("test")
private fun testFun5(): Unit = println("test")

//прегрузка функций, одно и то же имя, но разная реализация из-за разных аргументов
private fun testFun6(one: Int): Int = one
private fun testFun6(one: Int, two: Int) = println("первый аргумент $one, сумма ${one + two}")

