package com.scala.first_day

/**
 * Created by wxmimperio on 2016/3/10.
 */

object TupleArrayMap {

	//think in java
	def tupleFun(): Unit = {
		val tupleList = (1,2,"a","b")
		for(i <- tupleList.productIterator) {
			print(i.toString)
		}
		println()
	}
	//think in scala
	def tupleFun2(): Unit = {
		val tupleList = (1,2,"a","b")
		tupleList.productIterator.foreach {i => print(i)}
		//获取第几个元素
		println()
		println(tupleList._1)
		println(tupleList._3)
	}

	def arrayFun(): Unit = {
		val arratList = Array(1,2,3,"a","b")
		for(i <- arratList) {
			print(i)
		}
		for(i <- 0 until arratList.length) {
			print(arratList(i))
		}
		println()
	}

	def mapFun(): Unit = {
		val ages = Map("Tom"->10, "Jack"->20)

		for((k,v) <- ages) {
			println(k, v)
		}
		//_是占位符，不是具体名称，只是为这个变量占位，让程序正常执行下去
		for((_,v) <- ages) {
			println(v)
		}
	}

	def main(args: Array[String]) {
		tupleFun
		tupleFun2
		arrayFun
		mapFun
	}
}
