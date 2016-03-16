package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 */
object ListFirstOrderOps {
  def main(args: Array[String]) {

    //List的连接
    //:::表示列表与列表间的连接
    println(List(1, 2, 3, 4) ::: List(4, 5, 6, 7, 8) ::: List(9, 10))
    println(List(1, 2, 3, 4) ::: (List(4, 5, 6, 7, 8) ::: List(9, 10)))
    println(List(1, 2, 3, 4).length)

    val bigDate = List("hadoop", "spark", "kafka")
    //init，除了最后一个元素的其他元素
    println(bigDate.init)
    //last，最后一个元素
    println(bigDate.last)
    //reverse，翻转
    println(bigDate.reverse)
    //翻转产生一个新的List
    println(bigDate)
    //take 拿出前n个
    println(bigDate take 2)
    //drop 删除前n个
    println(bigDate drop 2)
    //将List以n为分割
    println(bigDate splitAt 2)
    //apply 访问位置为n的元素
    println(bigDate apply 2)
    //直接访问位置为n的元素，其实调用的apply方法
    println(bigDate(2))

    val data = List('a', 'b', 'c', 'd', 'e', 'f')
    //indices 取出所有元素的索引
    println(data.indices)
    //索引与元素值做zip（拉链）操作
    println(data.indices zip data)
    //与上相同
    println(data.zipWithIndex)
    println(data.toString)
    //mkString 将List按照一定方式重新组织
    println(data.mkString("[", ",", "]"))
    println(data.mkString("   "))
    println(data.mkString)

    //将List放入缓存数组
    val buffer = new StringBuilder
    data addString(buffer, "(", ".", ")")
    println(buffer)

    //List和Array相互转换
    val array = data.toArray
    println(array.toList)

    //List复制进入Array
    val new_Array = new Array[Char](10)
    //这里的1表示Array空出n个元素
    data.copyToArray(new_Array, 1)
    new_Array.foreach(print)
    println

    //List迭代器
    val iterator = data.toIterator
    while (iterator.hasNext) println(iterator.next)
  }
}
