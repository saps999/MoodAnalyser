package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void returnSad() throws MoodAnalyserException{
        MoodAnalyzer moodAnalyzer= new MoodAnalyzer("I am sad");
        String mood= moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void returnHappy() throws MoodAnalyserException{
        MoodAnalyzer moodAnalyzer =new MoodAnalyzer("I am happy");
        String mood= moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
