package com.scala.third_day

/**
 * Created by wxmimperio on 2016/3/15.
 *
 * 柯里化，即将接收多个参数的函数转变成接收单一参数的函数
 * 这个单一参数一般是多个参数中的第一个参数
 * 会返回一个函数，这个函数接收剩余的参数
 *
 * 柯里化可以进行参数的推导
 *
 */

object Curring {
  def main(args: Array[String]) {
    def muliple(x: Int, y: Int) = x * y
    //这里的2会传给x，x返回一个{（y: Int）=> 2 * y}的函数
    //4传给y，计算2 * 4 的结果返回
    def mulipleOne(x: Int) = (y: Int) => x * y
    println(mulipleOne(2)(4))

    //等同于
    def mulipleTwo(x: Int)(y: Int) = x * y
    println(mulipleOne(2)(4))

    val a = Array("WXM", "IMPERIO")
    val b = Array("wxm", "imperio")
    println(a.corresponds(b)(_.equalsIgnoreCase(_)))
  }
}
