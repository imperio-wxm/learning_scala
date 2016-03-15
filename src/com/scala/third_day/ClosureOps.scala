package com.scala.third_day

/**
 * Created by wxmimperio on 2016/3/15.
 */
object ClosureOps {
  def main(args: Array[String]) {
    val data = List(1, 2, 3, 4, 5, 6)
    var sum = 0
    data.foreach(sum += _)

    //将x做一个x+more的映射
    //调用add(1)时，1传给了more
    //由于a是add(1)的返回值，也就是(x:Int)
    //所以a(10)中，10传给了x
    def add(more: Int) = (x: Int) => x + more
    val a = add(1)
    println(a(10))
  }
}
