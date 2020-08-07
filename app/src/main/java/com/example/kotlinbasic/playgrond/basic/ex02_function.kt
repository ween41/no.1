package com.example.kotlinbasic.playgrond.basic

fun main(){
    normalFuntion()
    argumentFunction(1150,1112)
    println(returnFunctionl())
    println(returnFunction2())
    println(returnFunction3(1150,1112))
    optionalFunction(1150)
    optionalFunction(1150,1112)
    optionalFunction(x2 = 1150,x1 = 1112)


    //Lambda Expression
    val lambdal1 : (Int, Int)->Int={x1, x2 -> x1+x2} //-> = retutn
    println(lambdal1(1150,1112))
    val lambdal1 ={x1:Int,x2:Int -> x1+x2}
    println(lambdal2(1150,1112))

    //with out lambda
    fun xxx(x1:Int, x2:Int):Int {
        return x1 + x2
    }
}
fun normalFuntion() {
    println("normalFunction")
}
fun argumentFunction(x1 :Int,x2 :Int){
    print("sum: $x1 + $x2")
    print("sum: ${x1 + x2}")
}
fun returnFunctionl():String{
    return "iBlurBlur"
}
fun returnFunction2() = "iBlurBlur"

fun returnFunction3(x1: Int,x2: Int ) = x1+x2

fun optionalFunction(x1: Int,x2: Int = 0){
    println("sun: ${x1 + x2}")
}
