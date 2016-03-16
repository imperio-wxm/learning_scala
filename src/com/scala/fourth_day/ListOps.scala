package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 */
object ListOps {
  def main(args: Array[String]) {
    //List可以自动推导元素类型，但是元素之间的类型一定要一致
    val bigDate = List("spark", "hadoop")
    val dataInt = List(1, 2, 3, 4, 5)
    //使用::和Nil方式定义，从右，向左结合
    val bigDate_Core = "Hadoop" :: ("Spark" :: Nil)
    val data_Int = 1 :: 2 :: 3 :: 4 :: Nil

    println(dataInt.isEmpty)
    println(dataInt.head)
    //取第二个元素，即除了第一个元素以外的头元素
    println(dataInt.tail.head)

    //List可以直接赋值
    val List(x, y) = bigDate
    println(x + " " + y)
    //匹配前两个，剩下的组成一个List放入rest
    val a :: b :: rest = dataInt
    println(a + " " + b + " " + rest)

    //模式匹配加List排序算法
    val shuffledData = List(10,5,0,1,2,89,4,6,200)
    println(sortList(shuffledData))
  }

  def sortList(list: List[Int]): List[Int] = list match {
    //匹配为空
    case List() => List()
    //使用一个递归
    case head :: tail => compute(head, sortList(tail))
  }

  def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match {
    //如果剩下的为空，则表示只有一个元素
    case List() => List(data)
    //递归计算
    //如果当前数据比head要小，则插入到head前面；否则进行递归，重复前面的操作，直到有满足if插入
    case head :: tail => if (data <= head) data :: dataSet else head :: compute(data, tail)
  }
}
