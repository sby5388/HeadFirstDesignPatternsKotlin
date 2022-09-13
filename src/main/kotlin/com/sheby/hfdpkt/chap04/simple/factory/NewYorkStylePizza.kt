package com.sheby.hfdpkt.chap04.simple.factory

class NewYorkStyleCheesePizza : Pizza(
    "NewYork Style Sauce and Cheese Pizza",
    //薄皮面团
    "Thin Crust Dough",
    //大蒜番茄酱
    "Marinara Sauce"
) {
    init {
        //意大利高级干酪
        toppings.add("Grated Reggiano Cheese")
    }

}

class NewYorkStyleVeggiePizza : Pizza(
    name = "NY Style Veggie Pizza",
    dough = "Thin Crust Dough",
    sauce = "Marinara Sauce",
) {
    init {
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Garlic")
        toppings.add("Onion")
        toppings.add("Mushrooms")
        toppings.add("Red Pepper")
    }

}

class NewYorkStyleClamPizza : Pizza(
    name = "NY Style Clam Pizza",
    dough = "Thin Crust Dough",
    sauce = "Marinara Sauce",
) {
    init {
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Fresh Clams from Long Island Sound")
    }

}

class NewYorkStylePepperoniPizza : Pizza(
    name = "NY Style Pepperoni Pizza",
    dough = "Thin Crust Dough",
    sauce = "Marinara Sauce",
) {

    init {
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Sliced Pepperoni")
        toppings.add("Garlic")
        toppings.add("Onion")
        toppings.add("Mushrooms")
        toppings.add("Red Pepper")
    }

}