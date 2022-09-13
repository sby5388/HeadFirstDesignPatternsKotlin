package com.sheby.hfdpkt.chap04.simple.factory

class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(type: String): Pizza {
        return when (type) {
            TYPE_CHEESE -> ChicagoStyleCheesePizza()
            TYPE_VEGGIE -> ChicagoStyleVeggiePizza()
            TYPE_CLAM -> ChicagoStyleClamPizza()
            TYPE_PEPPERONI -> ChicagoStylePepperoniPizza()
            else -> throw java.lang.RuntimeException("没有相应的pizza")
        }
    }
}