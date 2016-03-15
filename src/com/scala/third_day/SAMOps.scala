package com.scala.third_day

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, JFrame}

/**
 * Created by wxmimperio on 2016/3/15.
 */

//SAM => (Single Abstract Method)
object SAMOps {

  def editionJava = {
    //模仿java
    var data = 0
    val jButton = new JButton("Counter")
    jButton.addActionListener(
      new ActionListener {
        override def actionPerformed(e: ActionEvent): Unit = {
          data += 1
          println(data)
        }
      }
    )
    jButton
  }

  def editionScala = {
    var data = 0
    val sButton = new JButton("Counter")

    //先做一个隐式转换
    //会重写actionPerformed方法
    //action(event)表示重写的action具体实现
    implicit def convertedAction(action: (ActionEvent) => Unit) = new ActionListener {
      override def actionPerformed(event: ActionEvent): Unit = {
        action(event)
      }
    }
    sButton.addActionListener((event: ActionEvent) => {
      data += 1
      println(data)
    })
    sButton
  }

  def main(args: Array[String]) {
    val jFrame = new JFrame("Test SAM")

    val jButton = editionJava
    val sButton = editionScala

    //jFrame.setContentPane(jButton)
    jFrame.setContentPane(sButton)
    jFrame.pack()
    jFrame.setVisible(true)
  }
}
