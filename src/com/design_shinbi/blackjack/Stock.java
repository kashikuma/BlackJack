package com.design_shinbi.blackjack;

import java.util.Collections;
import java.util.List;

/**
 * 山札管理クラス
 */
public class Stock {
	private List<Card> cards;
	
	/**
	 * コンストラクター
	 */
	public Stock() {
		initialize();
	}
	
	/**
	 * 山札のカード52枚を取得し、シャッフル
	 */
	public void initialize() {
		List<Card> list = Card.getAllCards();
		Collections.shuffle(list);
		this.cards = list;
	}
	
	/**
	 * 山札の枚数を返す。
	 * @return 山札の枚数
	 */
	public int getNumberOfCards() {
		return this.cards.size();
	}
	
	/**
	 * 配列一番上のカードオブジェクトを
	 * カードクラスのcardに代入し
	 * 一番上のカードオブジェクトを削除し
	 * cardオブジェクトを返す。
	 * @return 先頭のカード
	 * 
	 */
	public Card pickCard() {
		Card card = this.cards.get(0);
		this.cards.remove(0);
		return card;
	}
}
