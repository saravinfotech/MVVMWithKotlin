package com.learning.tipcalculator.model

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ResturantCalculatorTest {
    lateinit var calculator: ResturantCalculator

    @Before
    fun setUp() {
        calculator = ResturantCalculator()
    }

    @Test
    fun testCalculateTip() {
        val checkInput = 10.00
        val tipPctInput = 25
        val expectedTipResult = TipCalculation(
            checkAmount = checkInput,
            tipPct = tipPctInput,
            tipAmount = 2.5,
            grandTotal = 12.5
        )

        Assert.assertEquals(expectedTipResult, calculator.calculatTip(checkInput, tipPctInput))
    }
}