package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest1_2_RF {

	@Test
	public void test() {
		MoodAnalyzerUC1_RF moodAnalyzer = new MoodAnalyzerUC1_RF();
		String result = moodAnalyzer.analyzeMood();
		assertEquals("Happy",result);
	}

}
