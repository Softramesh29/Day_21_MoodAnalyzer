package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest1_1 {
	
	@Test
	public void test() {
		MoodAnalyzerTC1_1 moodAnalyzer = new MoodAnalyzerTC1_1("I am in Sad Mood");
		String result = moodAnalyzer.analyzeMood("I am in Sad Mood");
		assertEquals("Sad",result);
	}

}
