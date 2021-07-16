package com.flowerhop.pokergame

class Card private constructor(val number: Int, val suit: Suit) {
    companion object {
        fun create(number: Int, suit: Suit): Card {
            return Card(number, suit)
        }
    }

    override fun toString(): String {
        val numberString = getNumberString()
        return "$numberString of $suit"
    }

    private fun getNumberString(): String {
        return when (number) {
            1 -> "Ace"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            5 -> "Five"
            6 -> "Six"
            7 -> "Seven"
            8 -> "Eight"
            9 -> "Nine"
            10 -> "Ten"
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            else -> TODO()
        }
    }
}

enum class Suit {
    Spade, Heart, Diamond, Club
}
