package com.example.smartexpense

class Calculator {

    // Add two doubles and return the result
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    // Subtract two doubles and return the result
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    // Divide two doubles and return the result
    fun divide(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else {
            throw IllegalArgumentException("Cannot divide by zero")
        }
    }

    // Multiply two doubles and return the result
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    // Square a number and return the result
    fun square(a: Double): Double {
        return a * a
    }
}
