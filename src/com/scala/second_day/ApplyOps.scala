package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

class ApplyTest {
  def apply = println("This is a class of Applytest")

  def applyTry(): Unit = {
    println("This is applyTry")
  }
}

//返回一个ApplyTest的实例对象
object ApplyTest {
  //重写apply
  def apply() = {
    println("This is a object of ApplyTest")
    //创建一个ApplyTest类的实例对象
    new ApplyTest()
  }
}

object ApplyOps {
  def main(args: Array[String]) {
    val array = Array(1, 2, 3, 4, 5, 6)
    //不用new关键字其实是调用了伴生对象object
    val applyTest = ApplyTest()
    //由于伴生对象返回的是一个ApplyTest类的实例对象，所以直接可以调用类中的方法
    applyTest.applyTry()
  }
}
