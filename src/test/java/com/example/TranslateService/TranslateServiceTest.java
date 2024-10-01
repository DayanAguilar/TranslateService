package com.example.TranslateService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslateServiceTest {

    private  TranslateService translateService = new TranslateService();
    @Test
    @DisplayName("It should return Hello from Hola")
    void translate() {
        Response response = translateService.translate("Hola","Ingles");
        assertEquals("Hello",response.getTranslatedText());
    }
    @Test
    @DisplayName("It should return Translation not found")
    void translateDoesnotExists() {
        Response response = translateService.translate("Bueno","Ingles");
        assertEquals("Translation not found",response.getTranslatedText());
    }
}