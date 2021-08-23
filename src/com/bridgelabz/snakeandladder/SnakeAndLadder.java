package com.bridgelabz.snakeandladder;

public class SnakeAndLadder 
{

	public static void main(String[] args) 
	{
		int position=0;
		System.out.println("***WELCOME TO THE GAME OF SNAKES AND LADDERS***");
		int valueOfDie=(int)(Math.random()*6) +1;
		System.out.println("The value of die is "+ valueOfDie);
		int option=(int)(Math.random()*3) +1;
		switch(option)
		{
			case 1: System.out.println("positionition:"+position);
			        break;
			case 2: position+=valueOfDie;
			        System.out.println("positionition:"+position);
					break;
			case 3: position-=valueOfDie;
					System.out.println("positionition:"+position);
					break;
			default:break;
		}

	}

}
