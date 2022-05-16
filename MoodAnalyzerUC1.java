package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerUC1 {
	private String message;
	
	public MoodAnalyzerUC1(String message){
		this.message = message;
	}
	
	public String analyzeMood(String message){
		if(message == "Happy") 
			return "Happy";
		if(message == "Sad")
			return "Sad";
		else
			return null;
	}
	public static void main(String[] args) {
		MoodAnalyzerUC1 moodAnalyzer = new MoodAnalyzerUC1("Happy");
		moodAnalyzer.analyzeMood("Happy");
	}
}
