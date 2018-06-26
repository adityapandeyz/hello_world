import java.util.Scanner;
import java.util.Random;

public class example {
	
	public static void main(String args[]) {
		String r = "rock";
		String p = "Paper";
		String s = "Scissor";
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. Rock ");
		System.out.println("2. Paper ");
		System.out.println("3. scissor ");
		System.out.println();
        System.out.print("Enter your Choice: ");
		int user  = input.nextInt();
		System.out.println();
		
			if(user == 1 || user == 2 || user == 3){
				
				if(user == 1) {
					System.out.println("You: Rock!");
					
				}else if (user == 2) {
					System.out.println("You: Paper!");
					
				}else  if (user == 3){
					System.out.println("You: Scissor!");
				}
				
				Random rand = new Random();
				int randNum = rand.nextInt(10);
				
				System.out.println();
				
				if(randNum==0) {
					System.out.println("Computer: Rock!");
					System.out.println();
					
					if(user == 2 && randNum == 0) {
						System.out.println("Computer Win!");
						
					}else if(randNum == 0 && user == 3 ) {
						System.out.println("You Win!");
						
					}else if(randNum == 0 && user == 1  ){
						System.out.println("Tie!");
						
					}else if (randNum <= 5  && user == 1 ) {
						System.out.println("You Win!");
						
						
					}else if (randNum <=5 && user == 2 ) {
						System.out.println("Tie!");
						
					}else if(randNum <=5 && user == 3){
						System.out.println("You Win!");
						
					}else if (randNum >5 && user == 1) {
						System.out.println("You win!");
						
					}else if(randNum >5 && user == 2) {
						System.out.println("Computer Win!");
						
					}else if(randNum >5 && user == 3) {
						System.out.println("Tie!");
					}
					
					
				}else if (randNum <= 5) {
					System.out.println("Computer: Paper!");
					System.out.println();
					
					if(user == 2 && randNum == 0) {
						System.out.println("Computer Win!");
						
					}else if(randNum == 0 && user == 3 ) {
						System.out.println("You Win!");
						
					}else if(randNum == 0 && user == 1  ){
						System.out.println("Tie!");
						
					}else if (randNum <= 5  && user == 1 ) {
						System.out.println("You Win!");
						
						
					}else if (randNum <=5 && user == 2 ) {
						System.out.println("Tie!");
						
					}else if(randNum <=5 && user == 3){
						System.out.println("You Win!");
						
					}else if (randNum >5 && user == 1) {
						System.out.println("You win!");
						
					}else if(randNum >5 && user == 2) {
						System.out.println("Computer Win!");
						
					}else if(randNum >5 && user == 3) {
						System.out.println("Tie!");
					}
					
				}else {
					System.out.println("Computer: Scissor!");
					System.out.println();
					
					if(user == 2 && randNum == 0) {
						System.out.println("Computer Win!");
						
					}else if(randNum == 0 && user == 3 ) {
						System.out.println("You Win!");
						
					}else if(randNum == 0 && user == 1  ){
						System.out.println("Tie!");
						
					}else if (randNum <= 5  && user == 1 ) {
						System.out.println("You Win!");
						
						
					}else if (randNum <=5 && user == 2 ) {
						System.out.println("Tie!");
						
					}else if(randNum <=5 && user == 3){
						System.out.println("You Win!");
						
					}else if (randNum >5 && user == 1) {
						System.out.println("You win!");
						
					}else if(randNum >5 && user == 2) {
						System.out.println("Computer Win!");
						
					}else if(randNum >5 && user == 3) {
						System.out.println("Tie!");
					}

				}				
				
			}else {
				
				System.out.println("You entered an wrong Input!");
				System.out.println();
				System.out.print("Enter your Choice: ");
				 user  = input.nextInt();
				 
			}
			
		}	
		
	}


