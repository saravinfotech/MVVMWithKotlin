package com.learning.tipcalculator.model

class ResturantCalculator {


    fun calculatTip(checkAmount: Double, tipPct: Int): TipCalculation {
        val tipAmount = checkAmount * (tipPct.toDouble() / 100.00)
        val grandTotal = checkAmount + tipAmount;
        return TipCalculation(
            checkAmount,
            tipPct,
            tipAmount,
            grandTotal
        )
    }
}