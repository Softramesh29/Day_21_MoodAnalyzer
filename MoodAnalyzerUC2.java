package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerUC2 {

	public String analyzeMood(String message) throws InvalidMoodException{
		try {
		if(message.contains("Happy")) {
			System.out.println("Happy");
			return "Happy";
		}
		if(message.contains("Sad")) {
			System.out.println("Sad");
			return "Sad";
		}
		if(message.length()==0);
			throw new InvalidMoodException("Invalid Mood");
		}
		catch(Exception e) {
			System.out.println("Please Enter the Mood"+e);
			return "Happy";
		}
	}
	public static void main(String[] args) throws InvalidMoodException {
		MoodAnalyzerUC2 moodAnalyzer = new MoodAnalyzerUC2();
		moodAnalyzer.analyzeMood("");
	}
}
