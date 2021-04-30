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
		Tennis tennis = null;
		try {
			print("main() Begin");
			
			tennis = new Tennis();
			tennis.beginMatch();
			tennis.updateScore(false);
			tennis.updateScore(true);
			tennis.updateScore(true);
			tennis.updateScore(true);
			tennis.updateScore(true);
			
			tennis.beginMatch();
			tennis.updateScore(false);
			tennis.updateScore(true);
			tennis.updateScore(true);
			tennis.updateScore(true);
			tennis.updateScore(false);
			tennis.updateScore(false);
			tennis.updateScore(false);
			tennis.updateScore(true);
			tennis.updateScore(true);
			tennis.updateScore(true);
			//after finish game
			tennis.updateScore(true);
			tennis.updateScore(false);
			
			tennis.beginMatch();
			tennis.updateScore(false);
			tennis.updateScore(false);
			tennis.updateScore(false);
			tennis.updateScore(true);		
			tennis.updateScore(false);
			
		} finally {
			print("main() End");
		}
	}

	private static void print(String msg) {
		System.out.println(msg);
	}
	
    public void runningCommand() {
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
                    	
//                    	print("CurrentScore=" + tennis.currentScore());
//                    	print("CallingScore=" + tennis.currentScoreName());
                    	
                        break;
                    case 2:
                    	Scanner input1 = new Scanner(System.in);
                    	
                    	System.out.println("input 1=Player1 scoring or other for Player2 scoring");
                    	
                    	int choice1 = input.nextInt();
                    	
                    	if (choice1 == 1) {
                    		tennis.updateScore(true);
                    	} else {
                    		tennis.updateScore(false);
                    	}
                    	
//                    	print("CurrentScore=>> " + tennis.currentScore());
                    	
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
