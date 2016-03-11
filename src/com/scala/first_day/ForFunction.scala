package com.scala.first_day

import scala.io.Source

/**
 * Created by wxmimperio on 2016/3/10.
 * for、fun的进阶用法
 */

object ForFunction {
  def main(args: Array[String]) {

    for (i <- 1 to 3; j <- 1 to 3) print((10 * j + i) + " ")
    println
    //可以加个判断条件表达式，也就是过滤
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * j + i) + " ")
    println

    //函数有值，函数式
    //scala可以根据右侧表达式推断出返回值
    def addA(x: Int) = x + 100
    //匿名函数，函数可以作为函数的参数去传递
    val add = (x: Int) => x + 100
    println(addA(50))
    println(add(10))

    //递归函数必须声明返回值类型
    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
    print("Fac is:" + fac(10))
    println

    //函数默认值
    def combine(content: String, left: String = "[", right: String = "]") = left + content + right
    //如果传入参数，会将默认值覆盖
    println(combine("Spark use scala", "overpass "))

    //函数传入可变参数
    def connected(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }
    println("sum:" + connected(1, 2, 3, 4, 5))

    //lazy参数：只有在被第一次使用的时候才会实例化
    //以下并不会保存，因为没有调用
    lazy val file = Source.fromFile("not found")
  }
}
