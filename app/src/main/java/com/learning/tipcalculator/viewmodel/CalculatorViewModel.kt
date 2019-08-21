package com.learning.tipcalculator.viewmodel

import com.learning.tipcalculator.model.ResturantCalculator
import com.learning.tipcalculator.model.TipCalculation

class CalculatorViewModel(var resturantCalculator: ResturantCalculator = ResturantCalculator()) {

    var inputCheckAmount = ""

    var inputTipPct = ""

    var tipCalculator = TipCalculation()

    fun tipCalculator() {
        var checkAmount = inputCheckAmount.toDoubleOrNull()
        var tipPct = inputTipPct.toIntOrNull()

        if (checkAmount != null && tipPct != null) {
            tipCalculator = resturantCalculator.calculatTip(checkAmount, tipPct)
        }
    }
}