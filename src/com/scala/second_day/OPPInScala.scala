package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

class Teacher {
  //定义一个String类型的name变量，_起到占位符作用，表示什么也没有，也可以用“”
  var name: String = _
  private val age = 0
  //声明对象私有属性，只有当前对象自己的方法可以调用
  private[this] val gender = "male"

  //重载构造函数
  def this(name: String) {
    //当重载构造函数的时候必须加上this，表示调用类定义时的主构造函数
    this
    this.name = name
  }

  //只有通过自己内部的方法才能访问private[this]修饰的属性，如gender
  def sayHello(): Unit = {
    println("name=" + this.name + " age=" + this.age + " gender=" + this.gender)
  }
}

//含有参数的类，参数会被默认初始化
//设定private参数后，实例化的对象必须使用重载后的构造函数
//这样可以让类的主构造函数不让别人去调用
class Teacher1 private(name: String, age: Int) {
  private[this] var gender: String = _

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

  def sayGoodBye(): Unit = {
    println("name=" + this.name + " age=" + this.age + " gender=" + this.gender)
  }
}

object OPPInScala {
  def main(args: Array[String]) {
    val teacher = new Teacher()
    teacher.name = "wxmimperio"
    teacher.sayHello

    //在此必须使用重载的含有三个参数的构造函数
    val teacher1 = new Teacher1("Tom", 20, "female")
    teacher1.sayGoodBye()
  }
}
