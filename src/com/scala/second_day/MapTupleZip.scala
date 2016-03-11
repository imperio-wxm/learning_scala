package com.scala.second_day

import scala.collection.mutable.Map

/**
 * Created by wxmimperio on 2016/3/11.
 */

object MapTupleZip {
  def main(args: Array[String]) {
    //不可变map
    val bookPrice = Map("Java" -> 10, "Scala" -> 20, "Python" -> 30)
    for ((k, v) <- bookPrice) println(k, v * 0.1)

    //可变map
    val bookPrice1 = Map("Java" -> 10, "Scala" -> 20, "Python" -> 30)
    val getScalaPrize = bookPrice1.getOrElse("Scala", 0) //如果找到了key值，则获取相应的value，没有找到key值，value=0
    println(getScalaPrize)
    bookPrice1 += ("PHP" -> 50) //添加key-value
    bookPrice1 -= ("Java") //删除某索引的key-value
    println(bookPrice1)
  }
}
