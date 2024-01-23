package com.NumbersTwo;
import java.util.Random;
import java.util.Scanner; 


public class NumbersTwo {

	public static void main(String[] args) {
	

{
	// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("Well, " + name + ", I am thinking of a number between 1 and 100!");
		int myNumber = getRandomNumber(1,101);
		
		for (int i=0;i <5; i++) {
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Take a Guess!");
			int yourGuess = scan2.nextInt();
			
			if (yourGuess == myNumber) {
				System.out.println("You Are Correct!");
				break; }
				
			else if (yourGuess < myNumber) {
				// If the users guess is lower than the answer
				System.out.println("Your Guess is too low");
			}
			
			else if (yourGuess > myNumber) {
				//If the users guess is higher than the answer 
				System.out.println("Your Guess is too High");
			}
		
			if (i >=4) {
				//If the user gets it wrong too many times
			}
				System.out.println();
				System.out.println("Nope. The number I was thinking of was" + myNumber + "!");
			}
		}
		
	}

	private static int getRandomNumber(int min, int max) {
		
		Random random = new Random();
		return random.ints(min,max).findFirst().getAsInt();
		
	}
	
}
	
