package com.design_shinbi.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Attender3 {
	protected List<Card> cards;
	protected String name;

	public Attender3(String name) {
		this.name = name;
		initialize();
	}

	public void initialize() {
		this.cards = new ArrayList<Card>();
	}

	public void start(Stock stock) {
		this.cards.clear();
		for (int i = 0; i < 2; i++) {
			Card card = stock.pickCard();
			this.cards.add(card);
		}
	}

	public String getName() {
		return name;
	}

	public void hit(Stock stock) {
		Card card = stock.pickCard();
		this.cards.add(card);
	}

	public static int calculateStrengthFromList(List<Card> list) {
		int strength = 0;
		//Aを1として初期強さ計算
		int firstStrength = 0;
		boolean hasAce = false;
		for (Card card : list) {
			int number = card.getNumber();
			//10以上は10に

			if (number == 1) {
				hasAce = true;
			} else if (number >= 10) {
				number = 10;
			}
			firstStrength += number;

		}

		if (firstStrength <= 11 && hasAce) {
			strength = firstStrength + 10;
		} else if (firstStrength <= 21 && (!hasAce || firstStrength >= 12)) {
			strength = firstStrength;
		} else if (firstStrength >= 22) {
			strength = 0;
		}

		return strength;
	}
}
