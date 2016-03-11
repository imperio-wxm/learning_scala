package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

//scala和java一样，只能继承一个类，但可以实现多个接口
trait Logger {
  //def log(msg: String)
  //在接口中可以有方法的实现
  def log(msg: String) {}
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
  override def log(msg: String) = {
    println("This is TraitLogger " + msg)
  }
}

class Human {
  println("This is human")
}

trait TTeacher extends Human {
  println("This is TTeacher")

  //抽象方法
  def teach
}

trait PianoPlayer extends Human {
  println("This is PianoPlayer")

  //具体方法
  def playPiano: Unit = {
    println("PianoPlayer play piano")
  }
}

/**
 * 实现多重继承
 * 类和结构的构造顺序是从左往右：Human—>PianoPlayer—>TTeacher
 * 终端最后将打印
 * This is human
 * This is PianoPlayer
 * This is TTeacher
 */
//继承一个类，实现两个接口
class PianoTeacher extends Human with PianoPlayer with TTeacher {
  //实现抽象方法
  override def teach {
    println("I teach student")
  }
}

//AOP面向切面编程
trait Action {
  def doAction
}

trait TBeforeAfter extends Action {
  //重写必须是抽象方法
  abstract override def doAction: Unit = {
    println("Before")
    //这里的调用其实已经不是一个抽象方法了
    //而是被Work重写过的具体方法
    super.doAction
    println("After")
  }
}

class Work extends Action {
  override def doAction (): Unit = {
    println("Working....")
  }
}

object TraitOps {
  def main(args: Array[String]) {
    val concreteLog = new ConcreteLogger() with TraitLogger
    concreteLog.creteLog()

    println
    val pianoTeacher = new PianoTeacher()
    //实现接口的抽象方法
    pianoTeacher.teach
    //继承接口的具体方法
    pianoTeacher.playPiano

    println
    val work = new Work with TBeforeAfter
    work.doAction
  }
}