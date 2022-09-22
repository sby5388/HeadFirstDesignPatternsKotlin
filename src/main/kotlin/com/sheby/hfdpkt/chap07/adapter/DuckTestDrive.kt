package com.sheby.hfdpkt.chap07.adapter

private fun Duck.test() {
    this.apply {
        quack()
        fly()
    }
}

fun main() {
    val duck = MallardDuck()
    val turkey = WildTurkey()
    val turkeyAdapter: Duck = TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\nThe Duck says...")
    duck.test()

    println("\nThe TurkeyAdapter says...")
    turkeyAdapter.test()


}