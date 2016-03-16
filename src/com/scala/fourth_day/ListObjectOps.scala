package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 */
object ListObjectOps {
  def main(args: Array[String]) {
    //直接调用List的伴生对象
    println(List.apply(1, 2, 3, 4, 5, 6))
    //make(n, x) 返回一个x重复n此的List
    println(List.make(3, 5))
    //不包含最后一个元素，是一个[)
    println(List.range(1, 5))
    //最后一个参数步长
    println(List.range(9, 1, -2))

    //zip和unzip
    val zipped = "abcde".toList.zip(List(1, 2, 3, 4, 5))
    println(zipped)
    println(zipped.unzip)

    //集合的拼接
    println(List(List('a', 'b'), List('c', 'd'), List('e', 'f')).flatten)
    println(List('a', 'b') ::: List('c', 'd') ::: List('e', 'f'))
    println(List.concat(List('a', 'b'), List('c', 'd'), List('e', 'f')))

    //对两个map进行操作，已经弃用
    //List对应位置的元素进行函数的操作
    println(List.map2(List(10, 5), List(4, 6))(_ * _))
  }
}
