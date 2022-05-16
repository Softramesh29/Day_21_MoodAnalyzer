package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerTC1_2 {
	private String message;
	
	public MoodAnalyzerTC1_2(String message){
		this.message = message;
	}
	
	public String analyzeMood(String message){
		if(message == "I am in any Mood") 
			return "Happy";
		if(message == "I am in Sad Mood")
			return "Sad";
		else
			return null;
	}
	public static void main(String[] args) {
		MoodAnalyzerTC1_2 moodAnalyzer = new MoodAnalyzerTC1_2("Happy");
		moodAnalyzer.analyzeMood("Happy");
	}
}
