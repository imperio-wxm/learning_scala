package com.scala.fourth_day

import scala.collection.mutable
import scala.collection.mutable.TreeSet
import scala.collection.immutable.TreeMap

/**
 * Created by wxmimperio on 2016/3/16.
 * 可变mutable，在原有基础上操作
 * 不可变immutable，会生成新的
 */

object SetMapOps {
  def main(args: Array[String]) {
    //set内的重复不能重复
    val data = mutable.Set.empty[Int]
    data ++= List(1, 2, 3)
    data += 4
    println(data)
    //清空集合
    data.clear
    println(data)

    //map操作
    val map = mutable.Map.empty[String, String]
    map("Spark") = "Scala"
    map("Hadoop") = "Java"
    println(map)
    println(map("Spark"))

    //TreeSet、TreeMap是有顺序的
    val treeSet = TreeSet(8, 9, 4, 0, 1, 45)
    println(treeSet)
    val treeSetForChar = TreeSet("Spark", "Hadoop", "Java", "Scala")
    println(treeSetForChar)

    val treeMap = TreeMap("Scala" -> "Spark", "Java" -> "Hadoop")
    println(treeMap)
    println(treeMap("Java"))
  }
}
