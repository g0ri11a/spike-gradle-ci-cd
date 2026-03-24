package com.gorilla.spike;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void startAndStop() {
        App app = new App();
        System.out.println(app.getGreeting());
    }
}
