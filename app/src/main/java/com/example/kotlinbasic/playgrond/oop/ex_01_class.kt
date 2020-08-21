package com.example.kotlinbasic.playgrond.oop

fun main(){
    val obj1 = PrimaryClass( "aa",123)
    println("obj.name: ${obj1.name}")
    val obj1111 = PrimaryClass("aa",123)
    println("xxxx : ${obj1==obj1111}")
    obj1.display()
    println()
    val obj2 = Secondray()
    println("obj2.name: ${obj2.name}")
    obj2.display()
    println()
    val obj3 = Secondray("aa",30)
    println("obj3.name: ${obj3.name}")
    obj3.display()
    println()
    val obj4 = PSClass(80,30)
    println("obj4.score: ${obj4.name},${obj4.score}")
    obj4.display()
    println()
    val obj5 = PSClass(80,)
    println("obj5.score: ${obj4.name},${obj4.score}")
    obj5.display()
    println()
    //
    val obj6 = DataClass("aa",123)
    val obj7 = DataClass("aa",123)
    val obj8 = DataClass("aa",123)
    println("xxxx: ${obj6.toString()}")
    println("xxxx: ${obj6==obj7}")
    println("xxxx: ${obj8.toString()}")

    val (name,age)=Dataclass("aa",123)
    println("name: $name,age:$age")

}

class PrimaryClass (val name: String,val age: Int){
    init{
        println("primary init")
    }
    //init{
    // printLn("primary init2")
    // }
    init{
        println("init age $age")
    }
    fun display(){
        val result = "name $name, age: $age"
        println("Primary: $result")
    }
}
//class primaryClass
class Secondray{
    var name: String =""
    var age: Int = 0
    // val name: String
    // val age: Int
    constructor(){
        this.name = ""
        this.age = 0
    }
    constructor(name: String){
        this.name = name
        this.age = 0
    }
    constructor(age: Int){
        this.name = ""
        this.age = age
    }
    //overload
    constructor(name: String,age: Int){
        this.name = name
        this.age = age
    }
    init{
        println("Secondray init")
    }
    //  init{
    //  println("Secondray init2")
    //  }
    init {
        println("Secondray age: $age")
    }
    fun display(){

    }
    class PSClass(val )
    }
    data class Data(var name: String,var age: Int){
        constructor(age: Int):this(name = "xx",age = age){

        }
    }
}
