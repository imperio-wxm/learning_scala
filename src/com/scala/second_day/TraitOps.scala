package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

//scala和java一样，只能继承一个类，但可以实现多个接口
trait Logger {
  //def log(msg: String)
  //在接口中可以有方法的实现
  def log(msg: String){}
}

//实现接口
//如果需要实现多个接口，extends后用with 接口名
class ConcreteLogger extends Logger {
  //重写接口中的抽象方法
  override def log(msg: String) = {
    println("Log:" + msg)
  }
  //调用重写好的抽象方法
  def creteLog(): Unit = {
    log("Let's log")
  }
}

//一个接口继承自另一个接口
//重写继承接口的方法
trait TraitLogger extends Logger {
  override def log(msg : String)= {
    println("This is TraitLogger " + msg)
  }
}

object TraitOps {
  def main(args: Array[String]) {
    val concreteLog = new ConcreteLogger() with TraitLogger
    concreteLog.creteLog()
  }
}
