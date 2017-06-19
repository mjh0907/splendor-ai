package com.simplex9.splendor

/**
  * Created by hongbo on 6/10/17.
  */
object Param {
  val WINNING_POINTS : Byte = 15
  val NOBLE_POINT : Byte = 3
  val NUM_COIN = Array[Byte](0,0,4,5,7)
  val NUM_GOLD : Byte = 5
  val NUM_CARD_LEVEL = 3
  val NUM_CARD_EACH_LEVEL = 4
  val MAX_COIN = 10
  val MAX_RESERVE = 3

  val INF = 1000000

  val WINNING_SCORE = 10000
  val POINT_VALUE = 100
  val COIN_VALUE = 20
  val GOLD_VALUE = 40
  val CARD_VALUE = 40

  val TOP_CARDS_FOR_COIN_ESTIMATE = 3
  val TOP_CARDS_FOR_RESERVE = 5

  val OPPONENT_VALUE_RATE = 0.8
  val VALUE_RATE = Array(.9, .8, .5, .2, .1)
  val RESERVE_VALUE_RATE = Array(.95, .85, .7, .5, .2, .1)
}
