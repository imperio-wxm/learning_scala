package com.scala.third_day

/**
 * Created by wxmimperio on 2016/3/14.
 */
object PartialAppliedFunction {
  def main(args: Array[String]) {
    val data = List(1, 2, 3, 4, 5, 6, 7)
    //以下两种等价（偏函数）
    data.foreach(print _)
    data.foreach(x => print(" " + x.toString))

    println

    def sum(a: Int, b: Int, c: Int) = a + b + c
    println(sum(1, 2, 3))

    //偏函数，实际上是调用了函数的apply方法
    //会根据sum产生一个类的实例，从而生成apply方法，参数个数和类型为sum所指定
    val fp_a = sum _
    println(fp_a(1, 2, 3))
    //apply会接收偏函数定义的参数，传递给sum
    println(fp_a.apply(1, 2, 3))
    //传递部分值，必须指定类型
    val fp_b = sum(1, _: Int, 3)
    println(fp_b(2))
    println(fp_b.apply(2))

    data.foreach(print _)
    data.foreach(print)
  }
}
