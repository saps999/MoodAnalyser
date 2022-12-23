package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalyserException {
        try {
            if (message.contains("sad")) {
                return "SAD";
            }
            return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Invalid mood");
        }
    }
}
