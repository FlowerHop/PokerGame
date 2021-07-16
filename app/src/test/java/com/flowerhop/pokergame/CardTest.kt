package com.flowerhop.pokergame

import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalArgumentException

class CardTest {
    @Test
    fun verifyDiamondAce() {
        // Arrange
        val card = Card.create(1, Suit.Diamond)
        val expected = "Ace of Diamond"
        // Act
        val result: String = card.toString()
        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun verifyHeartTwo() {
        // Arrange
        val card = Card.create(2, Suit.Heart)
        val expected = "Two of Heart"
        // Act
        val result: String = card.toString()
        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun `25 Spade should not be created`() {
        // Arrange
        var hasException: Boolean = false
        // Act
        try {
            Card.create(25, Suit.Spade)
        } catch (e: IllegalArgumentException) {
            hasException = true
        }
        // Assert
        assertTrue(hasException)
    }

    @Test
    fun `14 Heart should not be created`() {
        assertThrows(IllegalArgumentException::class.java) {
            Card.create(14, Suit.Heart)
        }
    }
}