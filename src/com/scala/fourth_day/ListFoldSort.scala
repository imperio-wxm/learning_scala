package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 */
object ListFoldSort {
  def main(args: Array[String]) {
    //foldLeft的求和
    /**
     * 源码
     * def foldLeft[B](z: B)(op: (B, A) => B): B = {
     * var result = z
     * this.seq foreach (x => result = op(result, x))
     * result
     * }
     *
     * 1.初始化 0 为 z:B 的值，result=0
     * 2.foreach每个元素，对元素进行op操作，op操作是(_+_)
     * 3.将op结果返回给reslut
     */
    println((1 to 100).foldLeft(0)(_ + _))

    /**
     * 源码
     * def /:[B](z: B)(op: (B, A) => B): B = foldLeft(z)(op)
     */
    println((1 /: (1 to 10))(_ * _))

    println((1 to 5).foldRight(100)(_ - _))
    println(((1 to 5) :\ 100)(_ - _))

    //排序操作，复杂度是n(n),线性
    println(List(1, 54, 5, 9, 5, 10).sortWith(_ < _))
    println(List(1, 54, 5, 9, 5, 10).sortWith(_ > _))
  }
}
