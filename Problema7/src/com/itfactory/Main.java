package com.itfactory;

import com.itfactory.model.Curs;
import com.itfactory.model.Elev;
import com.itfactory.model.Profesor;
import com.itfactory.utils.Utils;

public class Main {

    public static void main(String[] args) {
        Profesor profesor = Utils.citesteProfesor();
        Elev elev = Utils.citesteElev();

        System.out.println("\nCursurile urmatoare sunt comune profesorului si elevului: ");
        for (Curs cursProf : profesor.getListaCursuri()) {
            for (Curs cursElev : elev.getListaCursuri()) {
                if (cursProf.equals(cursElev)) {
                    System.out.println(cursProf);
                }
            }
        }

        System.out.println("-----------------------------");

        System.out.println("Introduceti un curs pentru a determina daca este comun profesorului si elevului: ");
        Curs curs = Utils.citesteCurs();
        if (profesor.getListaCursuri().contains(curs) && elev.getListaCursuri().contains(curs)) {
            System.out.println("\nDa, cursul este comun.");
        } else {
            System.out.println("\nNu, cursul nu este comun.");
        }
    }
}
