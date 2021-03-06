package com.simplex9.splendor

import scala.reflect.ClassTag

/**
  * Created by hongbo on 6/17/17.
  */
object Util {
  def updateArray[T : ClassTag](arr : Array[T], index: Int, elem: T) : Array[T] = {
    val newArray = new Array[T](arr.length)
    for (i <- arr.indices) {
      newArray(i) = if (i == index) elem else arr(i)
    }
    newArray
  }

  def updateArray[T : ClassTag](arr : Array[T], index: Int, func : T => T) : Array[T] = {
    val newArray = new Array[T](arr.length)
    for (i <- arr.indices) {
      newArray(i) = if (i == index) func(arr(i)) else arr(i)
    }
    newArray
  }

  def deleteFromArray[T : ClassTag](arr: Array[T], index: Int) : Array[T] = {
    val newArray = new Array[T](arr.length - 1)
    for (i <- 0 until index) newArray(i) = arr(i)
    for (i <- index + 1 until arr.length) newArray(i - 1) = arr(i)
    newArray
  }

  def deleteLastFromArray[T : ClassTag](arr: Array[T]) : Array[T] = {
    deleteFromArray(arr, arr.length -1)
  }

  val colorInitial= Array("W","B", "G", "R", "O")
  def colorArrayToString(arr : Array[Short]): String = {
    val buffer = new StringBuilder
    for (i <- arr.indices) {
      if (arr(i) != 0) {
        buffer.append(colorInitial(i))
        buffer.append(arr(i))
      }
    }
    if (buffer.nonEmpty) buffer.toString() else "-"
  }
}
