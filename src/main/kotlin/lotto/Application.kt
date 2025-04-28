
package lotto

fun main() {

    val amount = InputView.readPurchaseAmount()
    val purchase = Purchase(amount)
    val count = purchase.ticketCount()


    OutputView.printPurchase(count)
    val tickets = LottoGenerator().generate(count)
    OutputView.printTickets(tickets)


    val winning = InputView.readWinningNumbers()
    val bonus = InputView.readBonusNumber(winning)


    val evaluator = LottoResultEvaluator()
    val results = tickets.map { evaluator.evaluate(it, winning, bonus) }


    val stats = LottoStatistics(results, amount)
    OutputView.printStatistics(stats)
}
