package com.design_shinbi.blackjack.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.design_shinbi.blackjack.Card;
import com.design_shinbi.blackjack.Stock;

class StockTest {

	@Test
	void testStock() {
		Stock stock = new Stock();
		while(stock.getNumberOfCards() > 0) {
			Card card = stock.pickCard();
			System.out.println(card);
		}
		fail("まだ実装されていません");
	}

}
