package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 * Type、Array、Tuple、List的模式匹配
 */
object PatternMatchExample {
  def main(args: Array[String]) {
    //类型匹配
    def match_type(t: Any) = t match {
      case p: Int => println("This is Integer")
      case p: String => println("This is String")
      case m: Map[_, _] => m.foreach(println)
      case _ => println("Unknown type!!")
    }

    match_type(2)
    match_type("spark")
    match_type(0.2356)
    match_type(Map("spark" -> "scala"))

    //Array的匹配
    def match_array(arr: Any) = arr match {
      //匹配第一个0元素
      case Array(0) => println("Array:" + 0)
      //匹配传入两个参数的情况
      case Array(x, y) => println("Array:" + x + " " + y)
      //匹配以0开头的
      case Array(0, _*) => println("Array:" + "0...")
      case _ => println("Somethis else")
    }

    match_array(Array(0))
    match_array(Array(1, 2))
    match_array(Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    match_array(Array(1))

    //List的匹配
    def match_list(lst: Any) = lst match {
      //匹配list为空的情况，Nil表示空
      case 0 :: Nil => println("List: " + 0)
      case x :: y :: Nil => println("List: " + x + " " + y)
      //tail表示剩下的所有元素
      case 0 :: tail => println(0); tail.foreach(println)
      case _ => println("something else")
    }

    match_list(List(0))
    match_list(List(0, 1))
    match_list(List(0, 1, 2, 3))
    match_list(List(2, 3, 4))

    //tuple匹配
    def match_tuple(tuple: Any) = tuple match {
      //匹配元组第二位任意
      case (0, _) => println("Tuple: " + 0)
      //匹配元组第一位任意
      case (x, 0) => println("Tuple: " + 0 + x)
      case _ => println("something else")
    }

    match_tuple((0, "Scala"))
    match_tuple((2, 0))
    match_tuple((1, 2, 3, 4, 5, 6))
  }
}
