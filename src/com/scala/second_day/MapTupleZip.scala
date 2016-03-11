package com.scala.second_day

import scala.collection.mutable.Map
import scala.collection.immutable.SortedMap

/**
 * Created by wxmimperio on 2016/3/11.
 */

object MapTupleZip {
  def main(args: Array[String]) {
    //不可变map
    val bookPrice = Map("Java" -> 10, "Scala" -> 20, "Python" -> 30)
    for ((k, v) <- bookPrice) yield println(k, v * 0.1)

    //可变map
    val bookPrice1 = Map("Java" -> 10, "Scala" -> 20, "Python" -> 30)
    val getScalaPrize = bookPrice1.getOrElse("Scala", 0) //如果找到了key值，则获取相应的value，没有找到key值，value=0
    println(getScalaPrize)
    bookPrice1 += ("PHP" -> 50) //添加key-value
    bookPrice1 -= ("Java") //删除某索引的key-value
    println(bookPrice1)

    //map按照key值进行排序
    val sortMap = SortedMap("c" -> 3, "b" -> 2, "a" -> 1)
    for ((k, v) <- sortMap) yield println(k, v)

    //tuple的索引从 1 开始
    val tuple1 = (1, 23, 4, "a", "b", "c", "d")
    val firstElm = tuple1._1
    println(firstElm)
    val (first, second, third, fourth, fifth, sixth, seventh) = tuple1
    println(second)
    val (a, b, c, _, _, _, _) = tuple1 //_只起到占位符的作用，但是必须要加上；即只取得tuple前三个元素
    println(c)

    val upperTuple = ("Hello Spark").partition(_.isUpper) //将大写字母合并成一个元素，与剩下的元素组成一个元组
    println(upperTuple)

    //Zip操作，将两组array进行合并
    val zipTuple1 = Array(1, 2, 3, 4, 5)
    val zipTuple2 = Array(6, 7, 8, 9, 10)
    val finalZip = zipTuple1.zip(zipTuple2)
    for ((x, y) <- finalZip) print(x + y + " ")
  }
}
