package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 */
object MergedSort {
  //T是个泛型
  //科里化，接收两个函数
  def mergedSort[T](less: (T, T) => Boolean)(input: List[T]): List[T] = {
    /**
     * @param xList 要合并的列表一
     * @param yList 要合并的列表二
     * @return 合并后列表
     */
    def merge(xList: List[T], yList: List[T]): List[T] = (xList, yList) match {
      case (Nil, _) => yList
      case (_, Nil) => xList
      case (x :: xtail, y :: ytail) =>
        if (less(x, y)) x :: merge(xtail, yList) else y :: merge(xList, ytail)
    }
    val n = input.length / 2
    if (n == 0) input
    else {
      val (x, y) = input splitAt n
      merge(mergedSort(less)(x), mergedSort(less)(y))
    }
  }

  def main(args: Array[String]) {
    println(mergedSort((x: Int, y: Int) => x < y)(List(5, 8, 9, 1, 0)))
    val reversed_mergedsort = mergedSort((x: Int, y: Int) => x > y) _
      println(reversed_mergedsort(List(5, 8, 9, 1, 0)))
  }
}
