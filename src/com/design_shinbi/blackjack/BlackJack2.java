package com.design_shinbi.blackjack;

import java.util.Scanner;

public class BlackJack2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		start(scanner);
		scanner.close();
	}
	
	public static void start(Scanner scanner) {
		Player player = new Player(scanner);
		Dealer dealer = new Dealer();
		Stock stock = new Stock();
		
		player.start(stock);
		dealer.start(stock);
		dealer.display();
		player.play(stock);
		dealer.play(stock);
		showResult(player,dealer);
		
		
	}

	public static void showResult(Attender player,Attender dealer) {
		int dealerStrength = 0;
		int playerStrength = 0;
		dealer.display();
		player.display();
		dealerStrength = dealer.calculateStrength();
		playerStrength = player.calculateStrength();
		if(dealerStrength == playerStrength)
			System.out.println("引き分け");
		else if (dealerStrength >= playerStrength) {
			System.out.println("負け");
		} else {
			System.out.println("勝ち");
		}
		System.out.println("続けますか？");
		
	}

}
