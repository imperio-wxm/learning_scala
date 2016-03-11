package com.scala.second_day

/**
 * Created by wxmimperio on 2016/3/11.
 */

//内部类从属于外部类的对象本身，而不是属于外部类，这点与java不同
class Outer(val name: String) {
  //外部类起了别名为outer
  outer =>

  class Inner(val name: String) {
    //以内部的一个对象作为参数
    def foo(b: Inner) = println("outerName:" + outer.name + " innerName:" + b.name)
  }

}

object OOPInnerObj {
  def main(args: Array[String]) {
    val outer1 = new Outer("spark")
    val outer2 = new Outer("hadoop")

    //内部类从属与外部类的对象，所以从对象中new
    val inner1 = new outer1.Inner("scala")
    val inner2 = new outer2.Inner("java")

    //调用方法时传入内部类对象本身
    inner1.foo(inner1)
    inner2.foo(inner2)
  }
}
