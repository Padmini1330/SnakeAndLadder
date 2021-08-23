package com.bridgelabz.snakeandladder;


public class SnakeAndLadder {
	static int positionOfPlayerA=0;
	static int positionOfPlayerB=0;
	static int dieValueOfPlayerA=0;
	static int dieValueOfPlayerB=0;

	
	  public void playerATurn() {
				int valueOfDie=(int)(Math.random()*6) +1;
				dieValueOfPlayerA+=1;
				System.out.println("A : Die Shows:"+ valueOfDie);
				int option=(int)(Math.random()*3) +1;
				switch(option)
				{
				case 1: System.out.println("A : position:"+positionOfPlayerA);
				        break;
				case 2: positionOfPlayerA+=valueOfDie;
						if(positionOfPlayerA==100)
							break;
						else if(positionOfPlayerA>100)
						{
							positionOfPlayerA-=valueOfDie;
						}
				        System.out.println("A : position:"+positionOfPlayerA);
				        playerATurn();
						break;
				case 3: positionOfPlayerA-=valueOfDie;
						if(positionOfPlayerA<0)
						{
							positionOfPlayerA=0;
						}
						System.out.println("A : position:"+positionOfPlayerA);
						break;
				default:break;
				}
	  } 
	  
	  public void playerBTurn() {
				int valueOfDie=(int)(Math.random()*6) +1;
				dieValueOfPlayerB+=1;
				System.out.println("B : Die Shows:"+ valueOfDie);
				int option=(int)(Math.random()*3) +1;
				switch(option)
				{
				case 1: System.out.println("B : position:"+positionOfPlayerB);
				        break;
				case 2: positionOfPlayerB+=valueOfDie;
						if(positionOfPlayerB==100)
							break;
						else if(positionOfPlayerB>100)
						{
							positionOfPlayerB-=valueOfDie;
						}
						System.out.println("B : position:"+positionOfPlayerB);
						playerBTurn();
						break;
				case 3: positionOfPlayerB-=valueOfDie;
						if(positionOfPlayerB<0)
						{
							positionOfPlayerB=0;
						}
						System.out.println("B : position:"+positionOfPlayerB);
						break;
				default:break;
				}
	  } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnakeAndLadder ob=new SnakeAndLadder();
		
		System.out.println("***WELCOME TO THE GAME OF SNAKES AND LADDERS***");
		while(!(positionOfPlayerA==100||positionOfPlayerB==100))
		{
			ob.playerATurn();
			ob.playerBTurn();
		}
		
		System.out.println("Number Of Times Die Rolled by Player A:" + dieValueOfPlayerA);
		System.out.println("Position of Player A: "+ positionOfPlayerA);
		System.out.println("Number Of Times Die Rolled by Player B:" + dieValueOfPlayerB);
		System.out.println("Position of Player B: "+ positionOfPlayerB);
		if(positionOfPlayerA==100) {
			System.out.println("Player A wins!! ");
		}
		else {
			System.out.println("Player B wins!! ");
		}

	}

}
