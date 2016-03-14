package com.scala.third_day

import java.io.File
import scala.io.Source

/**
 * Created by wxmimperio on 2016/3/14.
 */

object FunctionOps {
  def main(args: Array[String]) {
    processDate(50)

    //函数可以直接赋值给一个变量
    var inctease = (x: Int) => x + 1
    inctease(10)
    inctease = (x: Int) => x + 999
    println(inctease(1))

    val someNumber = List(1, 2, 3, 4, 0, 4, 5, 89)
    someNumber.foreach((x: Int) => print(x.toString + " "))
    //函数简化过程
    println(someNumber.filter((x: Int) => x > 5))
    println(someNumber.filter((x) => x > 5))
    println(someNumber.filter(x => x > 5))
    println(someNumber.filter(_ > 5))
    val f = (_: Int) + (_: Int)
    println(f(5, 10))
  }

  def getPath(): String = {
    val path = (new File("")).getAbsolutePath.concat("\\src\\doc\\words.txt")
    path
  }

  //本地函数
  def processDate(width: Int): Unit = {
    //processLines是processDate的私有函数，外部不可以访问
    def processLine(line: String): Unit = {
      //当文件某行内容大于width，打印
      if (line.length > width) {
        println(line)
      }
    }
    val path = getPath()
    val source = Source.fromFile(path)
    for (line <- source.getLines) processLine(line)
  }
}
