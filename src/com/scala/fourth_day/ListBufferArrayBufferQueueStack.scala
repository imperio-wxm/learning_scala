package com.scala.fourth_day

import scala.collection.immutable.Queue
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Stack

/**
 * Created by wxmimperio on 2016/3/16.
 */
object ListBufferArrayBufferQueueStack {
  def main(args: Array[String]) {
    val listBuffer = new ListBuffer[Int]
    listBuffer += 1
    listBuffer += 2
    println(listBuffer)

    val arrayBuilder = new ArrayBuffer[Int]()
    arrayBuilder += 1
    arrayBuilder += 2
    println(arrayBuilder)

    //队列操作
    val empty = Queue[Int]()
    val queue1 = empty.enqueue(1)
    val queue2 = queue1.enqueue(List(2, 3, 4, 5))
    println(queue2)
    val (element, left) = queue2.dequeue
    println(element + " " + left)

    import scala.collection.mutable.Queue
    val queue = Queue[String]()
    queue += "a"
    queue ++= List("b", "c", "d")
    println(queue)
    println(queue.dequeue)
    println(queue)

    //栈的操作
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.top)
    println(stack)
    //pop会将栈顶元素弹出并输出
    println(stack.pop)
    println(stack)
  }
}
