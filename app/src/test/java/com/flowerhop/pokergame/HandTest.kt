package com.flowerhop.pokergame

import org.junit.Assert.*
import org.junit.Test

class HandTest {
    @Test
    fun `C1 C3 C9 C10 C13 should be a flush`() {
        // Arrange
        val cardList = listOf<Card>(
            Card.create(1, Suit.Club),
            Card.create(3, Suit.Club),
            Card.create(9, Suit.Club),
            Card.create(10, Suit.Club),
            Card.create(13, Suit.Club),
        )
        val expected = RankingCategory.Flush

        // Act
        val hand = Hand(cardList)
        val result = hand.getCategory()

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun `C1 C3 C9 C10 D13 should not be a flush`() {
        // Arrange
        val cardList = listOf<Card>(
            Card.create(1, Suit.Club),
            Card.create(3, Suit.Club),
            Card.create(9, Suit.Club),
            Card.create(10, Suit.Club),
            Card.create(13, Suit.Diamond),
        )
        val expected = RankingCategory.HighCard

        // Act
        val hand = Hand(cardList)
        val result = hand.getCategory()

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun `C11 S11 D11 H3 C3 should be a full house`() {
        // Arrange
        val cardList = listOf<Card>(
            Card.create(11, Suit.Club),
            Card.create(11, Suit.Spade),
            Card.create(11, Suit.Diamond),
            Card.create(3, Suit.Heart),
            Card.create(3, Suit.Club),
        )

        val expected = RankingCategory.FullHouse

        // Act
        val hand = Hand(cardList)
        val result = hand.getCategory()

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun `S4 D4 H4 C4 C3 should be a four of a kind`() {
        // Arrange
        val cardList = listOf<Card>(
            Card.create(4, Suit.Spade),
            Card.create(4, Suit.Diamond),
            Card.create(4, Suit.Heart),
            Card.create(4, Suit.Club),
            Card.create(3, Suit.Club),
        )

        val expected = RankingCategory.FourOfAKind

        // Act
        val hand = Hand(cardList)
        val result = hand.getCategory()

        // Assert
        assertEquals(expected, result)
    }
}