package com.design_shinbi.blackjack.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.design_shinbi.blackjack.Card;

class CardTest {

	@Test
	void test() {
		List<Card> cards = Card.getAllCards();
		for(Card card : cards) {
			System.out.println(card); //	card.toString
		}
		fail("まだ実装されていません");
	}

}
