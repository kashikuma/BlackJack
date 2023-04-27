package com.design_shinbi.blackjack;

/**
 * キー名と文字表記するマークを列挙
 * @author kashi
 *
 */
public enum Suit {
	SPADE("スペード"),
	HEART("ハート"),
	DIAMOND("ダイヤ"),
	CLUB("クラブ");
	
	private String name;
	
	private Suit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
