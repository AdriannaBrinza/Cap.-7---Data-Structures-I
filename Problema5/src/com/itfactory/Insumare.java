package com.itfactory;

public class Insumare implements Task {
    private int numar1, numar2;

    public Insumare(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }

    @Override
    public void executa() {
        int suma = numar1 + numar2;
        System.out.println(suma);
    }

    @Override
    public String toString() {
        return "{Suma numerelor (" + numar1 + ", " + numar2 + ")}";
    }
}
