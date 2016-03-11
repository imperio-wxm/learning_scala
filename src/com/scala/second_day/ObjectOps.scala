package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

//以object修饰的内容都是静态的
//类似于java中的静态代码块static
//class University是同名对象的伴生类
object University {
  private var studentNo = 0
  //如果这里addStuNo这个方法是private修饰，其伴生类仍然可以访问
  def addStuNo = {
    studentNo += 1
    //这里作为一个返回值
    studentNo
  }
}

//object University是同名类的伴生对象
//这个类可以访问伴生对象的所有成员
class University {
  //访问伴生对象的属性
  val id = University.studentNo
  private val number = 0

  def aClass(number: Int) {
    this.number + number
  }
}

object ObjectOps {
  def main(args: Array[String]) {
    //object中的内容只有被第一次使用的时候才会执行
    //而java中是加载时就执行
    println(University.addStuNo)
    println(University.addStuNo)
  }
}
