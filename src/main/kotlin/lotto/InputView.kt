
package lotto

import camp.nextstep.edu.missionutils.Console

object InputView {
    fun readPurchaseAmount(): Int {
        println("Please enter the purchase amount.")
        while (true) {
            try {
                val line = Console.readLine().trim()
                val amount = line.toInt()
                Purchase(amount)
                return amount
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    fun readWinningNumbers(): List<Int> {
        println("Please enter last week's winning numbers (comma-separated).")
        while (true) {
            try {
                val raw = Console.readLine()
                return LottoInput.parseWinningNumbers(raw)
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    fun readBonusNumber(winning: List<Int>): Int {
        println("Please enter the bonus number.")
        while (true) {
            try {
                val raw = Console.readLine()
                return LottoInput.parseBonusNumber(raw, winning)
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }
}
