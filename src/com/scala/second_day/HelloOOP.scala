package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */
//类的默认级别是public
class Person {
  private var age = 0

  def increment() {
    age += 1
  }

  def current = age
}

//scala中默认属性是private级别的
//系统会自动生成setter和getter方法
class Student {
  var age = 0

  /**
   * 这样限定了，只能是对象自己的方法才能访问自己的私有属性
   * 虽然同是一个类生成的对象，其他对象不能进行访问
   * 这个私有属性属于当前对象私有
   * 这就是对象私有属性，通过这个可以实现同一个类的实例对象之间的隔离
   */
  private[this] var privateAge = 20

  //私有属性，只有自己能够访问
  def ageLevel(other: Student): Unit = {
    //传入一个对象，并访问这个对象的私有属性
    if (other.age < age) {
      println("level one")
    } else if (other.age >= age) {
      println("levle two")
    }
  }
}

object HelloOOP {
  def main(args: Array[String]) {
    val person = new Person()
    for (elm <- 0 to 9) person.increment()
    println(person.current)

    val student = new Student()
    //此处的age是scala默认生成的age方法提供的，而不是age属性本身
    student.age = 10 //这里给age赋值，实际上是调用了 age_ 这个函数
    println(student.age)

    val student2 = new Student()
    student2.age = 50
    student.ageLevel(student2)
  }
}
