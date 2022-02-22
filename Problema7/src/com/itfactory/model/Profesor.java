package com.itfactory.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Profesor extends Persoana {
    private List<Curs> listaCursuri;

    public Profesor(String nume, int varsta, List<Curs> listaCursuri) {
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
        Profesor profesor = (Profesor) o;
        return Objects.equals(listaCursuri, profesor.listaCursuri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), listaCursuri);
    }

    @Override
    public String toString() {
        return "[Profesor " + super.getNume() + ", " + super.getVarsta() + " ani, lista de Cursuri=" + listaCursuri + "]";
    }

}
