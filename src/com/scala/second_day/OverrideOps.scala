package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

class Person1(val name: String, var age: Int) {
  val gender = ""
  val school = "BJU"

  def sleep = "8 hours"

  //重写toString方法
  override def toString(): String = {
    println("Person's toString()")
    "This is a person"
  }

  println("Person's name: " + name)
  println("Person's age: " + age)
}

//会将传入的参数name，age同样赋值给父类Person
//子类在继承父类的时候要满足父类的构造函数
class Student1(name: String, age: Int, val grade: Float) extends Person1(name, age) {
  println("I am a student")
  override val gender = "male"
  override val school = "spark"

  override def toString(): String = {
    //其中name为传入值
    //age为传入值
    //gender重写父类Person
    //school重写父类Person
    //grade为传入值
    //super关键字为sleep调用父类内容的方法
    println("My name is " + name + " and I sleep " + super.sleep + " everyday")
    println("My gender is " + gender + " My school is " + school + " and I am " + age + " years old")
    println("My grade is " + grade)
    "Student's toString()"
  }
}

//子类继承父类时，先根据传参构造父类，再构造子类
object OverrideOps {
  def main(args: Array[String]) {
    val student1 = new Student1("wxmimperio", 20, 90.5f)
    student1.toString()
  }
}
