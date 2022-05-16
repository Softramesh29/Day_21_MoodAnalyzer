package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest1_2 {
	
	@Test
	public void test() {
		MoodAnalyzerTC1_2 moodAnalyzer = new MoodAnalyzerTC1_2("I am in any Mood");
		String result = moodAnalyzer.analyzeMood("I am in any Mood");
		assertEquals("Happy",result);
	}

}
