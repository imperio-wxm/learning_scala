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
		val array3 = Array("Hello","Scala")
		array3(1) = "Java"

		//变长数组
		val bufferArray = ArrayBuffer[Int]()
		bufferArray += 1
		bufferArray += (2,3,4)
		//可以用 ++=操作符追加任何集合
		bufferArray ++= Array(5,6,7,8)

		//从后开始切除元素
		bufferArray.trimEnd(1)
		//在第5个位置插入11
		bufferArray.insert(5,11)
		//删除索引为5的内容
		bufferArray.remove(6)
		bufferArray.toArray
		println(bufferArray)
	}
}
