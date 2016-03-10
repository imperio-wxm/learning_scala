package com.scala.first_day

import java.io.File

/**
 * Created by wxmimperio on 2016/3/10.
 */

/**
 * scala所有都是静态方法
 * 如果不用def函数包装，代码就变成静态代码块直接会运行
 */
object ScalaBasics {
	def printLine() {
		//var声明常量，不可以改变,类似于java中的final
		var line = ""
		do {
			//从终端读取一行内容
			/**
			 * readLine函数实现，调用Console.readLine()从终端读取一行数据
			 * def readLine(): String = Console.readLine()
			 */
			line = readLine()
			println("Read:" + line)
		} while (line != "")
	}

	//返回值Long类型
	def looper(x: Long, y: Long): Long = {
		//val声明一个变量
		var a = x
		var b = y
		while (a != 0) {
			val temp = a
			a = b % a
			b = temp
		}
		//返回值b
		b
	}

	//获取项目路径并依次打印
	def filePath() {
		val files = (new File(".")).listFiles()

		for(file <- files) {
			println(file)
		}
	}

	def main(args: Array[String]) {
		//无参数，函数调用可以不加括号
		//printLine()
		println(looper(100, 210))
		filePath

	}
}
