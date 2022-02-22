package com.itfactory.model;

import java.util.Objects;

public class Produs {
    private String denumire;
    private double pret;

    public Produs(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return Double.compare(produs.pret, pret) == 0 && Objects.equals(denumire, produs.denumire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denumire, pret);
    }

    @Override
    public String toString() {
        return "Produs {" +
                "denumire= '" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }

}
