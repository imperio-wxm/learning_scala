package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

//定义一个抽象方法，里面没有具体的实现
abstract class SuperTeacher(val name: String) {
  //不初始化属性字段即为抽象
  //如果是非抽象类中的属性字段，必须赋值进行初始化，只有var类型才可以使用_占位符
  var id: Int
  var age: Int

  //不实现函数体，即为抽象函数
  def teach
}

//继承自抽象类的时候要重写抽象类的 所有的 属性和方法
class MathTeacher(name: String) extends SuperTeacher(name) {
  override var id = name.hashCode
  override var age = 25

  override def teach(): Unit = {
    println("I am a math teacher")
  }
}

object AbstractClassOps {
  def main(args: Array[String]) {
    val mathTeacher = new MathTeacher("wxmimperio")
    mathTeacher.teach()
    println(mathTeacher.age)
    println(mathTeacher.id)
  }
}
