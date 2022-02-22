package com.itfactory.model;

import java.util.Objects;

public class Curs {
    private String idCurs;
    private String numeCurs;

    public Curs(String idCurs, String numeCurs) {
        this.idCurs = idCurs;
        this.numeCurs = numeCurs;
    }

    public String getIdCurs() {
        return idCurs;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curs curs = (Curs) o;
        return Objects.equals(idCurs, curs.idCurs) && Objects.equals(numeCurs, curs.numeCurs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurs, numeCurs);
    }

    @Override
    public String toString() {
        return "{idCurs='" + idCurs + '\'' + ", numeCurs='" + numeCurs + '\'' + '}';
    }
}
