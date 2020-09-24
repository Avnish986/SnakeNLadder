package com.game_package;

public class SnakeNLadder {
	public static final int player_count=1;
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		System.out.println("Welcome to game");
		int position=0;
		while(position <= 100) {
		int valDice=(int)(Math.floor(Math.random()*10)%6)+1;
		System.out.println("player rolled no. "+valDice);
		
		int option=(int)(Math.floor(Math.random()*10)%3);
		if(option == noPlay)
			System.out.println("Player stays at "+position);
		else if(option == ladder) {
			position+=valDice;
			if(position > 100) {
				position-=valDice;
				System.out.println("Player rolled more than expected so stays at "+position);
			}
			else
			System.out.println("Player moves ahead at "+position);
		}
		else {
			position-=valDice;
			if(position < 0)
				position = 0;
			System.out.println("Player moves back at "+position);
		}
		
	}
	}

}
