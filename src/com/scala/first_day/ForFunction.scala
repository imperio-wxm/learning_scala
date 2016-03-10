package com.scala.first_day

/**
 * Created by wxmimperio on 2016/3/10.
 * for、fun的进阶用法
 */

object ForFunction {
	def main(args: Array[String]) {

		for(i <- 1 to 3; j <- 1 to 3) print((10*j+i) + " ")
		println
		//可以加个判断条件表达式，也就是过滤
		for(i <- 1 to 3; j <- 1 to 3 if i != j) print((10*j+i) + " ")
		println

		//函数有值，函数式
		//scala可以根据右侧表达式推断出返回值
		def addA(x: Int) = x+100
		//匿名函数，函数可以作为函数的参数去传递
		val add = (x: Int) => x+100
		println(addA(50))
		println(add(10))
	}
}
