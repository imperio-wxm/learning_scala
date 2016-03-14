package com.scala.third_day


/**
 * Created by wxmimperio on 2016/3/14.
 */

//scala包的隐式引用， _相当于java的*
import java.lang._  //java.lang中的所有内容
import scala._      //scala中的所有内容
import Predef._     //Predef对象中的所有内容
//避免冲突，引用时可以用别名
import java.util.{HashMap=>JavaHashMap}
//不想引用某个方法，屏蔽用_占位符
import scala.{StringBuilder=>_}

/*
//包对象
//在包中可以定义包对象，包中所有的内容都可以访问包对象中的成员和方法
package com.scala.spark
package object person {
    val defaultName = "scala"
}

package person {
  class person {
    //访问包对象中的defaultName
    var name = defaultName
  }
}
*/

object PackageOps {
  def main(args: Array[String]) {

  }
}

//定义一个spark的包，里面有子包navigation
//链式结构
package spark.navigation {

  abstract class Navigator {
    def act
  }

  //navigation下还有一个子包，包的嵌套结构
  package tests {
    //spark.navigation.tests包
    class NavigatorSuite
  }
  package Impls {
    class Action extends Navigator {
      def act = {
        println("This is NavigatorSuite, extends from Navigator")
      }
    }
  }
}

package hadoop {
  package navigation {
    class Navigator
  }

  package launch {
  import com.scala.third_day.hadoop.navigation.Navigator
    class Booster {
      val nav = new Navigator
    }
  }
}

