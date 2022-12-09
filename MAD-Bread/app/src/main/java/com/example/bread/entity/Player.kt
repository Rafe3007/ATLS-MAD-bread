package com.example.bread.entity

class Player(name:String) {
    // No private var because it's a Singleton
    //      Meaning no getters/setters
    var name:String = name
    var level:Int = 1
    var money:Double = 0.0
}