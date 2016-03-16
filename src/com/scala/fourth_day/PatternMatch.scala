package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 * 模式匹配
 */

object PatternMatch {
  def main(args: Array[String]) {
    //类似于java的switch
    //没有break，并且case后可以跟函数
    val data = 2
    data match {
      case 1 => println("First")
      case 2 => println("Second")
      case _ => println("Not Known Number")
    }

    //case中的值可以是一个变量，但是经过match匹配后变量变成常量
    val result = data match {
      case i if i == 1 => "The first"
      case number if number == 2 => "The second"
      case _ => "Not Known Number"
    }
    println(result)

    //循环遍历其中的每一个字符
    //由于ch可以接收到匹配的值，所以case中可以使用
    "spark !".foreach {
      c => println(
        c match {
          case ' ' => "space"
          case ch => "Char: " + ch
        }
      )
    }
  }
}
