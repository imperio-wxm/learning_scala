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

    //对List进行分区，偶数基数分两区
    println(List(1, 2, 3, 4, 5, 6).partition(_ % 2 == 0))
    //find 找出List中第一个满足条件的元素
    println(List(1, 2, 3, 4, 5, 6).find(_ % 2 == 0))
    //获取所有满足条件的元素
    println(List(1, 2, 3, 4, 5, 6).takeWhile(_ <= 4))
    //删除所有满足条件的元素
    println(List(1, 2, 3, 4, 5, 6).dropWhile(_ <= 1))
    //span 将符合条件分成一部分，不符合条件的另一部分
    println(List(1, 2, 3, 4, 5, 6).span(_ <= 4))

    //exists 只要一个满足就返回true
    //forall 全部满足才返回true
    /**
     * 矩阵
     * 1.List(1, 0, 0)不满足forall，返回false
     * 2.List(0, 0, 0)满足forall，返回true
     * 3.List(0, 1, 0)不满足forall，返回false
     * 4.List(false,true,false) 满足exists，返回true
     */
    def hastotallyZeroRow(m: List[List[Int]]) = m exists (row => row forall (_ == 0))
    val m = List(List(1, 0, 0), List(0, 0, 0), List(0, 1, 0))
    println(hastotallyZeroRow(m))
  }
}
