package com.scala.hello

/**
 * Created by wxmimperio on 2016/3/10.
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
		printLine()
	}
}
