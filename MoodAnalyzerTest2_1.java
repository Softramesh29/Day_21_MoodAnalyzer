package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest2_1 {

	@Test
	public void test() throws InvalidMoodException {
		MoodAnalyzerUC2 moodAnalyzer = new MoodAnalyzerUC2();
		String result = moodAnalyzer.analyzeMood("");
		assertEquals("Happy",result);
	}

}
