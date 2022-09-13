package com.sheby.hfdpkt.chap04.simple.factory

class NewYorkPizzaStore : PizzaStore() {

    override fun createPizza(type: String): Pizza {
        return when (type) {
            TYPE_CHEESE -> NewYorkStyleCheesePizza()
            TYPE_VEGGIE -> NewYorkStyleVeggiePizza()
            TYPE_CLAM -> NewYorkStyleClamPizza()
            TYPE_PEPPERONI -> NewYorkStylePepperoniPizza()
            else -> throw java.lang.RuntimeException("没有相应的pizza")
        }
    }
}