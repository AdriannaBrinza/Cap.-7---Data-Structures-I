package com.itfactory.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Elev extends Persoana {
    private List<Curs> listaCursuri;

    public Elev(String nume, int varsta, List<Curs> listaCursuri) {
        super(nume, varsta);
        this.listaCursuri = listaCursuri;
    }

    public List<Curs> getListaCursuri() {
        return listaCursuri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Elev elev = (Elev) o;
        return Objects.equals(listaCursuri, elev.listaCursuri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), listaCursuri);
    }

    @Override
    public String toString() {
        return "Elev{" +
                "listaCursuri=" + listaCursuri +
                '}';
    }
}
