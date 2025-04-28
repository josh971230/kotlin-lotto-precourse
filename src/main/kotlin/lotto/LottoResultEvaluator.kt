
package lotto

class LottoResultEvaluator {
    fun evaluate(ticket: Lotto, winning: List<Int>, bonus: Int): LottoRank {
        val matches  = ticket.countMatches(winning)
        val bonusHit = ticket.hasNumber(bonus)
        return LottoRank.of(matches, bonusHit)
    }
}
