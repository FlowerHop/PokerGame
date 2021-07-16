package com.flowerhop.pokergame

class Hand(val cardList: List<Card>) {
    fun getCategory(): String {
        val suits: Map<Suit, List<Card>> = cardList.groupBy { it.suit }
        val numbers = cardList.groupBy { it.number }

        return if (numbers.size == 2) {
            if (numbers.any { (_, list) -> list.size == 4 })
                return "Four of a Kind"
            else
                return "Full House"
        }
        else if (suits.size == 1) return "Flush"
        else if (suits.size == 2) {
            return "High Card"
        } else TODO()
    }
}
