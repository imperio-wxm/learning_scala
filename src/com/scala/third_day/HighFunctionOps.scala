package com.scala.third_day

import scala.math._

/**
 * Created by wxmimperio on 2016/3/15.
 */
object HighFunctionOps {
  def main(args: Array[String]) {
    (1 to 9).map("*" * _).foreach(println _)
    (1 to 9).filter(_ % 2 == 0).foreach(print)
    println
    //阶乘
    print((1 to 9).reduceLeft(_ * _))
    println
    "This is a test project".split(" ").
      sortWith(_.length < _.length).foreach(println)

    val fun = ceil _
    val num = 3.14
    fun(num)
    Array(3.14, 1.56, 1.0).map(fun).foreach(println)

    //匿名函数
    //map是对每一个元素进行所传入的函数计算
    val triple = (x: Double) => 3 * x
    Array(3.14, 1.56, 1.0).map((x: Double) => 3 * x).foreach(println)
    Array(3.14, 1.56, 1.0).map { (x: Double) => 3 * x }.foreach(println)
    Array(3.14, 1.56, 1.0).map(triple).foreach(println)

    //标准高阶函数
    //函数的传参类型是一个函数
    def high_order_functions(f: (Double) => Double) = f(0.25)
    println(high_order_functions(ceil _))
    println(high_order_functions(sqrt _))

    //mulBy接收一个匿名函数
    //返回值是(x: Double)的匿名函数，所以20传给的x
    def mulBy(factor: Double) = (x: Double) => factor * x
    val tupleTest = mulBy(5)
    println(tupleTest(20))

    //匿名函数的简化，scala可以自己推断类型
    println(high_order_functions((x: Double) => 3 * x))
    println(high_order_functions((x) => 3 * x))
    println(high_order_functions(x => 3 * x))
    println(high_order_functions(3 * _))
  }
}
