package com.game_package;

public class SnakeNLadder {
	public static final int player_count=2;
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		System.out.println("Welcome to game");
		int positionA=97,dicenew, cntA=0, positionB=95, cntB=0;
		while(positionA <= 100 && positionB<=100) {
		//A moves
		int valDice=(int)(Math.floor(Math.random()*10)%6)+1;
		cntA++;
		System.out.println("playerA rolled no. "+valDice);
		
		int option=(int)(Math.floor(Math.random()*10)%3);
		if(option == noPlay)
			System.out.println("PlayerA stays at "+positionA);
		else if(option == ladder) {
			dicenew=(int)(Math.floor(Math.random()*10)%6)+1;
			cntA+=1;
			positionA=positionA+valDice+dicenew;
			if(positionA > 100) {
				positionA=positionA-(valDice+dicenew);
				System.out.println("PlayerA rolled more than expected so stays at "+positionA);
			}
			else
			System.out.println("PlayerA moves ahead at "+positionA);
		}
		else {
			positionA-=valDice;
			if(positionA < 0)
				positionA = 0;
			System.out.println("PlayerA moves back at "+positionA);
		}
		//B moves
		if(positionA == 100)
			break;
		valDice=(int)(Math.floor(Math.random()*10)%6)+1;
		cntB++;
		System.out.println("playerB rolled no. "+valDice);
		
		option=(int)(Math.floor(Math.random()*10)%3);
		if(option == noPlay)
			System.out.println("PlayerB stays at "+positionA);
		else if(option == ladder) {
			dicenew=(int)(Math.floor(Math.random()*10)%6)+1;
			cntB+=1;
			positionB=positionB+valDice+dicenew;
			if(positionB > 100) {
				positionB=positionB-(valDice+dicenew);
				System.out.println("PlayerB rolled more than expected so stays at "+positionB);
			}
			else
			System.out.println("PlayerB moves ahead at "+positionB);
		}
		else {
			positionB-=valDice;
			if(positionB < 0)
				positionB = 0;
			System.out.println("PlayerB moves back at "+positionB);
		}
		if(positionB == 100)
			break;
		
	}
	if(positionA == 100)
		System.out.println("PlayerA won the game and took "+cntA+" moves on the dice");
	if(positionB == 100)
		System.out.println("PlayerB won the game and took "+cntB+" moves on the dice");
	

}
}
