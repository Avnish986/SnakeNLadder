package com.game_package;

public class SnakeNLadder {
	public static final int player_count=1;
	public static final int position=0;
	public static void main(String[] args) {
		System.out.println("Welcome to game");
		int valDice=(int)(Math.floor(Math.random()*10)%6)+1;
		System.out.println("player rolled no. "+valDice);
		
	}

}
