package com.scala.second_day

import scala.collection.mutable.ArrayBuffer

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
		println(Array(1, 2, 3, 4, 5, 6).sum)

		//取最大
		println(ArrayBuffer(1,2,3,4,56).max)
	}
}
