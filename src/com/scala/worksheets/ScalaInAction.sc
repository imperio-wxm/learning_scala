package com.scala.worksheets

/**
 * Created by wxmimperio on 2016/3/10.
 */

object ScalaInAction {
  val array1 = new Array[Int](10)
  val array2 = new Array[String](2)
  //scala根据传入的参数类型，进行推导
  val array3 = Array("Hello", "Scala")
  array3(1) = "Java"
}