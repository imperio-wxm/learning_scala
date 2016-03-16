package com.scala.fourth_day

/**
 * Created by wxmimperio on 2016/3/16.
 * class的嵌套匹配
 */

abstract class Item

case class Book(description: String, price: Double) extends Item

//这里定义的Item*可以继续嵌套Book、Bundle的class，即可以持续嵌套下去，类似于json
case class Bundle(description: String, price: Double, items: Item*) extends Item

object PatternMatchClass {

  def caseclass_nested(person: Item) = person match {
    //第一个占位符表示Bundle的description
    //第二个占位符表示Bundle的price
    //第三个Book表示Bundle中嵌套的Book，Book中第二个占位符表示Book的price
    //第四个占位符表示剩余的所有参数
    case Bundle(_, _, Book(descr, _), _*) => println("The first description is: " + descr)
    //可以通过@符号引用当前匹配的对象，即将匹配的对象内容赋值给一个常量
    case Bundle(_, _, art@Book(_, _), rest@_*) => println(art.description + " " + art.price)
    case _ => println("Ops")
  }

  def main(args: Array[String]): Unit = {
    //嵌套顺序=>caseclass_nested(Bundle(description,price,Book(description,price),Bundle(description,price,Book(description,price))))
    caseclass_nested(
      Bundle("spark!!!", 20.23, Book("spark book", 50.23),
        Bundle("Hadoop", 10.23, Book("Hadoop-hdfs", 80.3)
        )
      ))
  }
}
