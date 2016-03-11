package com.scala.first_day

import java.io.File
import scala.io.Source

/**
 * Created by wxmimperio on 2016/3/10.
 */

object FileOps {
  def getPath(): String = {
    val path = (new File("")).getAbsolutePath.concat("\\src\\doc\\words.txt")
    path
  }

  def main(args: Array[String]) {
    val filePath = getPath()
    //获取文件
    try {
      val file = Source.fromFile(filePath)
      for (line <- file.getLines()) {
        println(line)
      }
      file.close()
    } catch {
      case e: Exception => println(e.getMessage)
    }
  }
}
