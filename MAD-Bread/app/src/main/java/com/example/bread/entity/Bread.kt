package com.example.bread.entity

class Bread(name: String) {
    private var name:String = name
    private var desc:String  = ""
    private var difficulty:Int = 0
    private var ingredients:Array<Ingredient> = arrayOf<Ingredient>()

    // Getters
    fun getName():String {
        return name
    }
    fun getDesc():String {
        return desc
    }
    fun getDiff():Int {
        return difficulty
    }
    fun getIngredients():Array<Ingredient> {
        return ingredients
    }

    // Setters
    fun setName(n:String) {
        name = n
    }
    fun setDesc(d:String) {
        desc = d
    }
    fun setDiff(d:Int) {
        difficulty = d
    }
}