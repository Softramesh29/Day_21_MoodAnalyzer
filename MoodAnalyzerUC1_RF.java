package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerUC1_RF {
	private String message;
		
	public MoodAnalyzerUC1_RF(String message){
		if(message == "I am in Sad Mood")
			this.message = "Sad";
		else if(message == "I am in Happy Mood") 
			this.message = "Sad";
	}
	public MoodAnalyzerUC1_RF(){
	}
	
	public String analyzeMood(String message){
		if(message == "Happy") 
			return "Happy";
		if(message == "I am in Sad Mood")
			return "Sad";
		else
			return null;
	}
	public String analyzeMood(){
		MoodAnalyzerUC1_RF moodAnalyzerRf =new MoodAnalyzerUC1_RF("I am in Sad Mood");
		String result = moodAnalyzerRf.message;
		if(result == "Sad")
			result = "Happy";
		return result;

	}

}
