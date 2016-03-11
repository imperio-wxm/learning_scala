package com.scala.first_day

/**
 * Created by wxmimperio on 2016/3/10.
 */

//静态方法
object HelloWorld {
  //Array数组,[数组元素类型]
  //Unit空值,即无返回值,可以去掉
  def main(args: Array[String]): Unit = {
    println("Hello World")
    //运行时向main函数传值
    for (arg <- args) {
      println(arg)
    }
  }
}
