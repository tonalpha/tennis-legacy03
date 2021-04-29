/**
 * 
 */
package com.summitthai.tennis;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class RunTennis {
	
	public static void main(String[] args) {
		RunTennis ins = null;
		try {
			ins = new RunTennis();
			
			print("main() Begin");
			
			
			
		} finally {
			print("main() End");
		}
	}

	private static void print(String msg) {
		System.out.println(msg);
	}
	
    public static void runningCommand() {
        int choice = -1;
        Tennis tennis = null;
        try {
        	print("runningCommand() Begin");
            
            Scanner input = new Scanner(System.in);

            while (choice != 0) {
                /***************************************************/
                System.out.println("Choose from these choices");
                System.out.println("-------------------------\n");
                System.out.println("1 - New Game 2 Player");
                System.out.println("2 - Update Score");
                System.out.println("0 - Quit");

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                    	tennis = new Tennis();
                    	
                    	tennis.beginMatch();
                    	
                    	print("CurrentScore=" + tennis.currentScore());
                    	print("CallingScore=" + tennis.currentScoreName());
                    	
                        break;
                    case 2:
                    	tennis = new Tennis();
                    	
                    	Scanner input1 = new Scanner(System.in);
                    	
                    	System.out.println("1=Player1 scoring or other for Player2 scoring");
                    	
                    	int choice1 = input.nextInt();
                    	
                    	if (choice1 == 1) {
                    		
                    	} else {
                    		
                    	}
//                    	tennis.updateScore(player1Score, player2Score);
                    	
                    	print("CurrentScore=" + tennis.currentScore());
                    	print("CallingScore=" + tennis.currentScoreName());
                    	
                        break;                        
                    default:
                        // The user input an unexpected choice.
                }                      
            }
            
        } finally {
        	print("runningCommand() End");
        }
    }
}
