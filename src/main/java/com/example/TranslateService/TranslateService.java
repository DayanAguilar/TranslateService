package com.example.TranslateService;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslateService {
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("Hola", "Hello");
        dictionary.put("Adiós", "Goodbye");
    }

    public Response translate(String text, String targetLanguage) {
        String translatedText = dictionary.getOrDefault(text, "Translation not found");
        return new Response(text, translatedText);
    }
}
