package com.sheby.hfdpkt.chap03.decorate

/**
 * 关于咖啡的一些描述
 */
//https://m.gafei.com/views-127418
fun main() {
    val espresso: Beverage = Espresso()
    println("${espresso.description} $${espresso.cost()}")

    //装饰者来了
    var darkRoast: Beverage = DarkRoast()
    darkRoast = Mocha(darkRoast)
    darkRoast = Mocha(darkRoast)
    darkRoast = Whip(darkRoast)

    println("${darkRoast.description} $${darkRoast.cost()}")

    var houseBlend: Beverage = HouseBlend()
    houseBlend = Soy(houseBlend)
    houseBlend = Mocha(houseBlend)
    houseBlend = Whip(houseBlend)

    println("${houseBlend.description} $${houseBlend.cost()}")


}