package com.summitthai.tennis;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

	public int numberOfSet;
	public int gamePerSet;
	public int player1Score;
	public int player2Score;
	public String score;
	public String scoreName;
	public boolean gameFinish;
	
	public Map<String, String> scoreDesc;
	public Map<String, String> scoreCalling;
	
	public void beginMatch() {
		try {
			System.out.println("begin tennis match");
			
			this.gameFinish = false;
			
			this.scoreDesc = new HashMap<String, String>();
			this.scoreDesc.put("0", "0");
			this.scoreDesc.put("1", "15");
			this.scoreDesc.put("2", "30");
			this.scoreDesc.put("3", "40");
			this.scoreDesc.put("4", "45");
			this.scoreDesc.put("d", "deuce");
			this.scoreDesc.put("a", "advantage");
			
			this.scoreCalling = new HashMap<String, String>();
			this.scoreCalling.put("0", "love");
			this.scoreCalling.put("1", "fifteen");
			this.scoreCalling.put("2", "thirty");
			this.scoreCalling.put("3", "forty");
			this.scoreCalling.put("4", "45");
			this.scoreCalling.put("d", "deuce");
			this.scoreCalling.put("a", "advantage");
			
			this.player1Score = 0;
			this.player2Score = 0;
			
		} finally {
			
		}
	}
	
	public void nextMatch() {
		
	}
	
	public String updateScore(boolean player1Scoring) {
		try {
			if (!this.gameFinish) {
				if (player1Scoring) {
					this.player1Score++;
				} else {
					this.player2Score++;	
				}
			}
			
			return this.currentScore();
		} finally {
			
		}
	}
	
	public String currentScore() {
		String output = null;
		int    diff   = 0;
		try {
//			System.out.println(player1Score + "-" + player2Score);
			
			if (this.player1Score >=3 && this.player2Score >= 3) {
				if (this.player1Score == this.player2Score) {				
					output = ">> " + this.scoreDesc.get("d");
				} else {
					diff = this.player1Score - this.player2Score;
//					System.out.println("diff=" + diff);
					if (diff == 1) {
						output = ">> " + "player1 " + this.scoreDesc.get("a");
					} else if (diff > 1){
						output = ">> " + "player1 Win";
						this.gameFinish= true;
					} else if (diff == -1) {
						output = ">> " + "player2 " + this.scoreDesc.get("a");
					} else if (diff < -1) {
						output = ">> " + "player2 Winx";
						this.gameFinish= true;
					}
				}
			} else {
				if (this.player1Score == 4) {
					output = ">> " + "player1 Win";
					this.gameFinish= true;
				} else if (this.player2Score == 4) {
					output = ">> " + "player2 Win";
					this.gameFinish= true;
				} else {
					output = ">> " + this.scoreDesc.get(this.player1Score + "");
					output = output + "-";
					output = output + this.scoreDesc.get(this.player2Score + "");
					output = output + ", ";
					output = output + this.scoreCalling.get(this.player1Score + "");
					output = output + "-";
					output = output + this.scoreCalling.get(this.player2Score + "");					
				}
			}
			
			return output;			
		} finally {
			System.out.println(output);
		}
	}
}
