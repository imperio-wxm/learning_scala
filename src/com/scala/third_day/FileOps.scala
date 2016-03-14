package com.scala.third_day

import scala.io.Source
import java.io.PrintWriter
import java.io.FileWriter
import java.io.File

/**
 * Created by wxmimperio on 2016/3/14.
 * 在scala中可以使用所有java的输入输出流
 */

object FileOps {
  def getPath(): String = {
    val path = (new File("")).getAbsolutePath.concat("\\src\\doc\\words.txt")
    path
  }

  def getLocalFile(): Unit = {
    val path = getPath()
    /**
     * 源码，底层调用java的File，返回一个BufferedSource的迭代器
     * def fromFile(name: String)(implicit codec: Codec): BufferedSource = fromFile(new JFile(name))(codec)
     */
    val files = Source.fromFile(path)
    for (file <- files.getLines) {
      println(file)
    }
    files.close
  }

  def getURL(): Unit = {
    val URL = "http://www.baidu.com/"
    /**
     * 源码
     * def fromURL(s: String)(implicit codec: Codec): BufferedSource = fromURL(new URL(s))(codec)
     */
    val webFile = Source.fromURL(URL)
    webFile.foreach(print)
    webFile.close
  }

  def writeIntoFile(): Unit = {
    val path = getPath()
    //true表示向后追加
    val fWriter = new FileWriter(new File(path), true)
    val pWriter = new PrintWriter(fWriter)
    for (i <- 1 to 10) pWriter.print(i)
    pWriter.close
  }

  def consoleInput(): Unit = {
    println("Please entry something.")
    /**
     * 源码
     * def readLine(): String = in.readLine()
     */
    val line = Console.readLine()
    println("This is your words: " + line)
  }

  def main(args: Array[String]) {
    //读取本地文件
    getLocalFile
    //读取web
    getURL
    //写入本地文件
    writeIntoFile
    //从控制台输入
    consoleInput
  }
}
