package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 * class、object的模式匹配
 */

//定义抽象类
abstract class Person

//参数都是val类型，不可修改，适合于消息传递的模式匹配
case class Student(age: Int) extends Person

case class Worker(age: Int, salary: Double) extends Person

case object Shared extends Person

object CaseClassObject {
  def main(args: Array[String]) {

    //模式匹配抽象类Person
    def caseOps(person: Person) = person match {
      case Student(age) => println("Student's age is " + age)
      //第一个参数占位
      case Worker(_, salary) => println("Worder's salary is " + salary)
      case Shared => println("No property")
    }

    //由于Student和Worker都继承自Person，所以可以直接传递
    //实际上是要嗲用apply方法，scala做了优化
    caseOps(Student(20))
    caseOps(Worker(30, 200.236))
    caseOps(Shared)

    val worker = Worker(20, 56.32)
    val worker1 = worker.copy(salary = 100.12)
    val worker2 = worker.copy(age = 25)
    caseOps(worker1)
    caseOps(worker2)
  }
}
