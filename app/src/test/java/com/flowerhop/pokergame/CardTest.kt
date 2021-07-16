package com.flowerhop.pokergame

import org.junit.Assert.*
import org.junit.Test

class CardTest {
    @Test
    fun verifyDiamondAce() {
        // Arrange
        val card = Card(1, Suit.Diamond)
        val expected = "Ace of Diamond"
        // Act
        val result: String = card.toString()
        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun verifyHeartTwo() {
        // Arrange
        val card = Card(2, Suit.Heart)
        val expected = "Two of Heart"
        // Act
        val result: String = card.toString()
        // Assert
        assertEquals(expected, result)
    }
}