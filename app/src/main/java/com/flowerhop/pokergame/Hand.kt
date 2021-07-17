package com.flowerhop.pokergame

class Hand(val cardList: List<Card>) {
    fun getCategory(): RankingCategory {
        val suits: Map<Suit, List<Card>> = cardList.groupBy { it.suit }
        val numbers = cardList.groupBy { it.number }

        return if (numbers.size == 2) {
            if (numbers.any { (_, list) -> list.size == 4 })
                return RankingCategory.FourOfAKind
            else
                return RankingCategory.FullHouse
        }
        else if (suits.size == 1) return RankingCategory.Flush
        else return RankingCategory.HighCard
    }
}

enum class RankingCategory {
    Flush, FullHouse, FourOfAKind, HighCard
}
