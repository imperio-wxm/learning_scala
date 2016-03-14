package com.scala.third_day

/**
 * Created by wxmimperio on 2016/3/14.
 * 正则表达式的使用
 */
object RegExpressOps {
  def main(args: Array[String]) {
    //转换成正则表达式
    val regex = """([0-9]+) ([a-z]+)""".r
    val numPattern = "[0-9]+".r  //数字匹配
    val numberPattern = """\s+[0-9]+\s+""".r

    //findAllInf方法匹配
    /**
     * 源码
     * def findAllIn(source: CharSequence) = new Regex.MatchIterator(source, this, groupNames)
     */
    for (matchString <- numPattern.findAllIn("12356 fsdfads, 56984d spark ")) {
      println(matchString)
    }

    //找出首个数字
    /**
     * 源码
     * def findFirstIn(source: CharSequence): Option[String] = {
     *   val m = pattern.matcher(source)
     *   if (m.find) Some(m.group) else None
     * }
     */
    println(numPattern.findFirstIn("95ss fdfasd, 8564 dsfasd"))

    //字母和数字同时匹配
    val regex(num, word) = "99 spark"
    println(num, word)

    //模式匹配
    val line = "8564 spark"
    line match {
      //必须同时匹配都可以
      case regex(num, word) => println(num + "\t" + word)
      case _ => println("finish")
    }
  }
}
