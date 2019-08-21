package com.learning.tipcalculator.model

import java.math.RoundingMode

class ResturantCalculator {


    fun calculatTip(checkAmount: Double, tipPct: Int): TipCalculation {
        val tipAmount = (checkAmount * (tipPct.toDouble() / 100.00))
            .toBigDecimal()
            .setScale(2, RoundingMode.HALF_UP)
            .toDouble()
        val grandTotal = checkAmount + tipAmount;
        return TipCalculation(
            checkAmount,
            tipPct,
            tipAmount,
            grandTotal
        )
    }
}