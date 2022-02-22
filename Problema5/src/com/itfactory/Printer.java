package com.itfactory;

public class Printer implements Task {
    private String text;

    public Printer(String text) {
        this.text = text;
    }

    @Override
    public void executa() {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "{Afisati textul \"" + text + "\"}";
    }
}
