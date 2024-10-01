package com.example.TranslateService;

public class Response {
    private String originalText;
    private String translatedText;

    public Response(String originalText, String translatedText) {
        this.originalText = originalText;
        this.translatedText = translatedText;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }
}