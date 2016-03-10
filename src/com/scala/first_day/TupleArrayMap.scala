package com.scala.first_day

/**
 * Created by wxmimperio on 2016/3/10.
 */

object TupleArrayMap {

	//think in java
	def tupleFun(): Unit = {
		val tupleList = (1,2,"a","b")
		for(i <- tupleList.productIterator) {
			println(i.toString)
		}
	}
	//think in scala
	def tupleFun2(): Unit = {
		val tupleList = (1,2,"a","b")
		tupleList.productIterator.foreach {i => println(i)}
	}

	def main(args: Array[String]) {
		tupleFun
		tupleFun2
	}
}
