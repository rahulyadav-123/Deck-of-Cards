package com.Deckofcards;

public class Deckofcards {
	public static void main(String[] args) {
		
     DistributeCards dc = new DistributeCards();	//	class object
		
		//	allots cards for each player
		for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
			dc.DistributeCards(playerNumber);
			System.out.println("Player "  + playerNumber + "'s cards:");
			//prints cards of respective player
			dc.showCards(playerNumber);
		}
	}
}


