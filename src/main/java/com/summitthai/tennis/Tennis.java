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
	
	public Map<String, String> scoreDesc;
	public Map<String, String> scoreCalling;
	
	public void beginMatch() {
		try {
			this.scoreDesc = new HashMap<String, String>();
			this.scoreDesc.put("0", "0");
			this.scoreDesc.put("1", "15");
			this.scoreDesc.put("2", "30");
			this.scoreDesc.put("3", "40");
			
			this.scoreCalling = new HashMap<String, String>();
			this.scoreCalling.put("0", "love");
			this.scoreCalling.put("1", "fifteen");
			this.scoreCalling.put("2", "thirty");
			this.scoreCalling.put("3", "forty");
			this.scoreCalling.put("d", "deuce");
			this.scoreCalling.put("a", "advantage");
			
			this.player1Score = 0;
			this.player2Score = 0;
			
		} finally {
			
		}
	}
	
	public void finishMatch() {
		
	}
	
	public void updateScore(boolean player1Scoring) {
		try {
			if (player1Scoring) {
				this.player1Score++;
			} else {
				this.player2Score++;
			}
		} finally {
			
		}
	}
	
	public String currentScore() {
		String output = null;
		try {
			output = this.scoreDesc.get(this.player1Score + "");
			output = output + "-";
			output = this.scoreDesc.get(this.player2Score + "");
			
			return output;			
		} finally {
			
		}
	}
	
	public String currentScoreName() {
		String output = null;
		try {
			output = this.scoreCalling.get(this.player1Score + "");
			output = output + "-";
			output = this.scoreCalling.get(this.player2Score + "");
			
			return output;			
		} finally {
			
		}
	}	
}
