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

        val baseTC = TipCalculation(checkAmount = 10.00)

        val testVals = listOf(
            baseTC.copy(tipPct = 25, tipAmount = 2.5, grandTotal = 12.50),
            baseTC.copy(tipPct = 15, tipAmount = 1.5, grandTotal = 11.50),
            baseTC.copy(tipPct = 18, tipAmount = 1.8, grandTotal = 11.80)
        )


        testVals.forEach {
            it
            Assert.assertEquals(it, calculator.calculatTip(it.checkAmount, it.tipPct));
        }
    }
}