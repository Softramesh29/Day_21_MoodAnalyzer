package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerTC1_1 {
	private String message;
	
	public MoodAnalyzerTC1_1(String message){
		this.message = message;
	}
	
	public String analyzeMood(String message){
		if(message == "Happy") 
			return "Happy";
		if(message == "I am in Sad Mood")
			return "Sad";
		else
			return null;
	}
	public static void main(String[] args) {
		MoodAnalyzerTC1_1 moodAnalyzer = new MoodAnalyzerTC1_1("Happy");
		moodAnalyzer.analyzeMood("Happy");
	}
}
