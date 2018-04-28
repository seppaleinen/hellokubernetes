package com.sa.web.dto;

public class SentimentDto {

    private String sentence;
    private Double polarity;

    public SentimentDto() {
    }

    public SentimentDto(String sentence, Double polarity) {
        this.sentence = sentence;
        this.polarity = polarity;
    }

    public String getSentence() {

        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Double getPolarity() {
        return polarity;
    }

    public void setPolarity(Double polarity) {
        this.polarity = polarity;
    }

    @Override
    public String toString() {
        return "SentimentDto{" +
                "sentence='" + sentence + '\'' +
                ", polarity=" + polarity +
                '}';
    }
}
