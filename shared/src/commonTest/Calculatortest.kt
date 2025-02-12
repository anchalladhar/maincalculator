package com.example.smartexpense

import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testAdd() {
        val result = calculator.add(2.0, 3.0)
        assertEquals(5.0, result)
    }

    @Test
    fun testSubtract() {
        val result = calculator.subtract(5.0, 3.0)
        assertEquals(2.0, result)
    }

    @Test
    fun testDivide() {
        val result = calculator.divide(6.0, 2.0)
        assertEquals(3.0, result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testDivideByZero() {
        calculator.divide(6.0, 0.0)
    }

    @Test
    fun testMultiply() {
        val result = calculator.multiply(2.0, 3.0)
        assertEquals(6.0, result)
    }

    @Test
    fun testSquare() {
        val result = calculator.square(3.0)
        assertEquals(9.0, result)
    }
}
