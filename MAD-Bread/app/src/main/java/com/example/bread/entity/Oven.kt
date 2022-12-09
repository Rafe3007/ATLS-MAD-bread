package com.example.bread.entity

class Oven {
    private var capacity = 1    // number of breads allowed in oven
    private var temp = 350

    // Getters
    fun getCapacity():Int {
        return capacity
    }
    fun getTemp():Int {
        return temp
    }

    // Setters
    fun setCapacity(cap:Int) {
        capacity = cap
    }
    fun setTemp(t:Int) {
        temp = t
    }
}