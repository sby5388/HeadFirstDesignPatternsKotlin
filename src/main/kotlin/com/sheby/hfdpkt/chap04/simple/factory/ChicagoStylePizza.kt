package com.sheby.hfdpkt.chap04.simple.factory

class ChicagoStyleCheesePizza : Pizza(
    name = "Chicago Style Deep Dish Cheese Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
) {
    init {
        toppings.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}

class ChicagoStyleVeggiePizza : Pizza(
    name = "Chicago Deep Dish Veggie Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
) {
    init {
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
    }


    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}

class ChicagoStyleClamPizza : Pizza(
    name = "Chicago Style Clam Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
) {
    init {
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }

}

class ChicagoStylePepperoniPizza : Pizza(
    name = "Chicago Style Pepperoni Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
) {
    init {
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
        toppings.add("Sliced Pepperoni")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}