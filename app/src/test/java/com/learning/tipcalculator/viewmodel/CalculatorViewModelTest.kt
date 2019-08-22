package com.learning.tipcalculator.viewmodel

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculatorViewModelTest {
    lateinit var calculatorViewModel: CalculatorViewModel

    @Before
    fun setUp() {
        calculatorViewModel = CalculatorViewModel()
    }

    @Test
    fun testTipCalculator() {
        calculatorViewModel.inputCheckAmount = "10.00"
        calculatorViewModel.inputTipPct = "15"

        calculatorViewModel.tipCalculator()
        Assert.assertEquals("10.00", calculatorViewModel.tipCalculator.checkAmount)
        Assert.assertEquals("15", calculatorViewModel.tipCalculator.tipPct)
        Assert.assertEquals("1.50", calculatorViewModel.tipCalculator.tipAmount)
        Assert.assertEquals("11.50", calculatorViewModel.tipCalculator.grandTotal)
    }
}