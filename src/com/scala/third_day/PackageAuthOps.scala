package com.scala.third_day

/**
 * Created by wxmimperio on 2016/3/14.
 */

package spark {//子包spark
  package navigation {//子包navigation
    //这里的private表示Navigator类的可见度扩展到spark下，可以超越navigation包
    //即Navigator这个类对spark这个包下的所有类和对象可见
    private [spark] class Navigator {
      //protected声明，不仅当前类可以用，它写的子类也可以用，并且navigation这个包中的所有代码都可以访问
      protected [navigation] def uerStarChart(){}
      class LegOfJourney {
        private [Navigator] val distance = 100
      }
      //this表示，只能有当前对象访问，属于当前对象私有
      private [this] var speed = 200
    }
  }

  package launch {
    import navigation._
    object Vehicle {
      //这里可以直接new出private的Navigator
      //用private的作用域可以扩展到外围包中
      private [launch] val guide = new Navigator
    }
  }
}

//伴生类和伴生对象的权限设定
//伴生对象可伴生类之间可以互相访问
class PackageOps_Auth {
  //可以直接导入伴生对象的私有成员使用
  import PackageOps_Auth.power
  private def canMakeItTrue = power > 10001
}

object PackageOps_Auth {
  private def power = 1000

  def makeItTrue(p: PackageOps_Auth) : Boolean = {
    //可以直接调用伴生类中的私有方法
    val result = p.canMakeItTrue
    result
  }
}

object PackageAuthOps {
  def main(args: Array[String]) {

  }
}
