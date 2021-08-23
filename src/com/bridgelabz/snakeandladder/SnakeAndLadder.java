package com.bridgelabz.snakeandladder;

public class SnakeAndLadder 
{

	public static void main(String[] args) 
	{
		int position=0;
		System.out.println("***WELCOME TO THE GAME OF SNAKES AND LADDERS***");
		
		while(position!=100) 
		{
			
			int valueOfDie=(int)(Math.random()*6) +1;
			System.out.println("The value of die is "+ valueOfDie);
			int option=(int)(Math.random()*3) +1;
			switch(option)
			{
				case 1: System.out.println("position:"+position);
				        break;
				case 2: position+=valueOfDie;
						if(position>100)
						{
							position-=valueOfDie;
						}
				        System.out.println("position:"+position);
						if(position==100)
							break;
						
						break;
				case 3: position-=valueOfDie;
						if(position<0)
						{
							position=0;
						}
						System.out.println("position:"+position);
						break;
				default:break;
			}

		}

    }
}
