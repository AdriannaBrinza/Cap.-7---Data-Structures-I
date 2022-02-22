package com.itfactory.Problema3;

/* Sa se creeze un program simplu (o clasa Main cu metoda main) in care se va defini o lista de Stringuri (List<String>).
Mai departe se vor citi de la tastatura mai multe String-uri (Alegeti un numar relativ mic sa nu va complicati.
De exemplu, 3-4 valori sunt de ajuns).
Se vor introduce in lista doar string-urile citite care nu contin litera "a".
(se va verifica cu metoda .contains() din String)
Exemplu:
Introduceti cuvantul: birou // O sa il introduc
Introduceti cuvantul: para // Nu o sa il introduc */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaString = new ArrayList<>();
        String raspuns = "y";

        do {
            System.out.print("Introduceti un String: ");
            String cuvant = scanner.nextLine();
            if (!cuvant.contains("a")) {
                listaString.add(cuvant);
            }

            System.out.print("Mai citim un String? Daca da, tastati litera \"y\", iar daca nu, orice alt caracter de la tastatura: ");
            raspuns = scanner.nextLine();
        } while (raspuns.equalsIgnoreCase("y"));

        System.out.println("\nLista String-urilor care nu contin litera \"a\" sunt: \n" + listaString);

    }
}
