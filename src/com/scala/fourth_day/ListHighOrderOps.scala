package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 */
object ListHighOrderOps {
  def main(args: Array[String]) {
    //map 中传入的是一个函数，会对List中的每个元素进行这个函数操作，返回一个List
    println(List(1, 2, 3, 4, 5, 6) map (_ + 1))
    println(List(1, 2, 3, 4, 5, 6) map (item => item + 1))

    val data = List("Scala", "Hadoop", "Spark")
    println(data map (_.length))
    println(data map (_.toList.reverse.mkString))
    //返回每个字符的List
    println(data.map(_.toList))
    //首先将List中的数据进行map操作，操作函数是toList
    //然后对List集合进行合并
    println(data.flatMap(_.toList))

    /**
     * 1.range生成(1,2,3,4)
     * 2.flatMap(1,2,3,4) => range(1,1) range(1,2) range(1,3) range(1,4)
     * 3.range(1,1)=>0;range(1,2)=>(2,1);range(1,3)=>(3,1),(3,2);range(1,4)=>(4,1),(4,2),(4,3)
     * 4.return List((2,1),(3,1),(3,2),(4,1),(4,2),(4,3))
     */
    println(List.range(1, 5).flatMap(i => List.range(1, i).map(j => (i, j))))

    //求和计算
    var sum = 0
    List(1, 2, 3, 4, 5, 6).foreach(sum += _)
    println("sum: " + sum)

    //过滤
    println(List(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(_ % 2 == 0))
    println(List("Spark", "Hadoop", "Scala").filter(_.length > 5))
  }
}
