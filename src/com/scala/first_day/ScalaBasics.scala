package com.scala.first_day

/**
 * Created by on 2016/3/10.
 */

object ScalaBasics {
	def printLine() {
		//var声明常量，不可以改变
		var line = ""
		do {
			//从终端读取一行内容
			/**
			 * readLine函数实现，调用Console.readLine()从终端读取一行数据
			 * def readLine(): String = Console.readLine()
			 */
			line = readLine()
			println("Read:" + line)
		}while(line != "")
	}
	def main(args: Array[String]) {
		//函数调用可以不加括号
		printLine()
	}
}
