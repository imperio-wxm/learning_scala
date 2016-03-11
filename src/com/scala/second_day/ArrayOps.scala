package com.scala.second_day

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting.quickSort

/**
 * Created by wxmimperio on 2016/3/10.
 */

object ArrayOps {
  def main(args: Array[String]) {

    val array1 = new Array[Int](10)
    val array2 = new Array[String](2)
    //scala会根据传入的值进行参数类型推导
    val array3 = Array("Hello", "Scala")
    array3(1) = "Java"

    //变长数组
    val bufferArray = ArrayBuffer[Int]()
    bufferArray += 1
    bufferArray +=(2, 3, 4)
    //可以用 ++=操作符追加任何集合
    bufferArray ++= Array(5, 6, 7, 8)

    //从后开始切除元素
    bufferArray.trimEnd(1)
    //在第5个位置插入11
    bufferArray.insert(5, 11)
    //删除索引为5的内容
    bufferArray.remove(6)
    bufferArray.toArray
    println(bufferArray)

    //将数组中的每个元素*2
    val array4 = Array(1, 2, 3, 4)
    val array4_reduce = for (i <- array4) yield i * 3
    for (elm <- array4_reduce if elm % 2 == 0) print(elm + " ")
    println
    //filter、map操作
    array4_reduce.filter(_ % 2 == 0).map(_ * 3)
    for (elm <- array4_reduce) print(elm + " ")
    println
    array4_reduce.filter(elm => elm % 2 == 0).map(elm => elm * 3)
    for (elm <- array4_reduce) print(elm + " ")

    //求和
    val sum = Array(1, 2, 3, 4, 5, 6).sum
    println(sum)

    //取最大
    println(ArrayBuffer(1, 2, 3, 4, 56).max)

    //排序(默认升序)
    println(ArrayBuffer(5, 8, 1, 2, 3, 9, 7, 10, 55, 0).sorted)

    //使用类库快速排序
    val array5 = Array(10, 5, 3, 6, 9, 7, 10, 50)
    quickSort(array5)
    for (elm <- array5) print(elm + " ")
    println

    //连接
    val array6 = Array(1, 2, 3, 4, 5, 6)
    val str_array = array6.mkString(" and ")
    println(str_array)

    //多维数组
    //ofDim[Double](3,4)类型为Double，3行4列
    val maxtrix = Array.ofDim[Double](3,4)
    maxtrix(2)(1) = 50 //给第2行第1列的元素赋值
    for (elms <- maxtrix) for (elm <- elms) print(elm + " ")
    println

    val array7 = new Array[Array[Int]](10)
    for (elm <- 0 until array7.length) array7(elm) = new Array[Int](elm + 1)
    for (elms <- array7) print(elms.length + " ")
  }
}