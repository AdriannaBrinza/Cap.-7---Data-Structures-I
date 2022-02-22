package com.itfactory.utils;

import com.itfactory.model.Curs;
import com.itfactory.model.Elev;
import com.itfactory.model.Persoana;
import com.itfactory.model.Profesor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static Curs citesteCurs() {
        System.out.print("Introduceti ID-ul cursului: ");
        String idCurs = scanner.nextLine();
        System.out.print("Introduceti numele cursului: ");
        String numeCurs = scanner.nextLine();
        return new Curs(idCurs, numeCurs);
    }

    public static Persoana citestePersoana() {
        System.out.print("Nume si prenume: ");
        String nume = scanner.nextLine();
        System.out.print("Varsta: ");
        int varsta = Integer.parseInt(scanner.nextLine());
        return new Persoana(nume, varsta);
    }

    public static List<Curs> construiesteListaDeCursuri() {
        List<Curs> listaCursuri = new ArrayList<>();
        String raspuns;
        do {
            Curs curs = citesteCurs();
            listaCursuri.add(curs);
            System.out.print("Mai adaugam un curs in lista? Daca da, tastati \"y\", iar daca nu tastati orice alt caracter de la tastatura: ");
            raspuns = scanner.nextLine();
        } while (raspuns.equalsIgnoreCase("y"));

        return listaCursuri;
    }

    public static Elev citesteElev() {
        System.out.println("\nUrmeaza sa introduceti datele personale ale unui ELEV si cursurile la care participa.");
        Persoana persoana = citestePersoana();
        System.out.println("Urmeaza sa creati lista de cursuri a elevului: ");
        return new Elev(persoana.getNume(), persoana.getVarsta(), construiesteListaDeCursuri());
    }

    public static Profesor citesteProfesor() {
        System.out.println("\nUrmeaza sa introduceti datele personale ale unui PROFESOR si cursurile pe care le tine acesta.");
        Persoana persoana = citestePersoana();
        System.out.println("Urmeaza sa creati lista de cursuri a profesorului: ");
        return new Profesor(persoana.getNume(), persoana.getVarsta(), construiesteListaDeCursuri());
    }
}
