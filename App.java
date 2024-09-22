package com.example.calculatorappjavafx;

import javafx.application.Application;

public class App {

    public static void main(String[] args) {
        System.out.println("Starting App");
        Frontend.setBackend(new Backend());
        Application.launch(Frontend.class, args);
    }
}
