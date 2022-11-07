package com.example.bread.entity

class Ingredient(name:String, price:Double) {
    private var name = name
    private var price = price

    // Getters
    fun getName():String {
        return name
    }
    fun getPrice():Double {
        return price
    }

    // Setters
    fun setName(n:String) {
        name = n
    }
    fun setPrice(p:Double) {
        price = p
    }
}