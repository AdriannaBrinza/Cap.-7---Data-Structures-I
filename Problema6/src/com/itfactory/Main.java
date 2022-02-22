package com.itfactory;
/* Sa se creeze un program in Java pe baza urmatoarelor cerinte:
1. Se va creea o clasa Produs cu proprietatile denumire si pret. (stabiliti tipurile corect). Constructor cu parametri. Generati metoda equals corespunzator dupa modelul de la curs.
2. Sa se creeze clasa Main cu metoda main in care se va creea o lista de produse. (Presupunem ca este stocul unui magazin)
3. Se da un numar int (n) citit de la tastatura care va determina cate produse se vor citi mai departe (la fel de la tastatura)
4. Mai departe se vor citi n produse de la tastatura. Daca in lista definita la punctul 2  produsul citit este deja, se va afisa un mesaj, daca nu, se va adauga in lista..
5. Afisati lista finala. */

import com.itfactory.Utils.Utils;
import com.itfactory.model.Produs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Produs> listaProduse = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cate citiri de produse vom face de la tastatura? Introduceti un numar intreg: ");
        int numarCitiri = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numarCitiri; i++) {
            Produs produs = Utils.citesteProdus();
            if (listaProduse.contains(produs)) {
                System.out.println("Acest produs este deja in lista.");
            } else {
                listaProduse.add(produs);
            }
            System.out.println("------------------------");
        }

        System.out.println("\nS-au citit " + listaProduse.size() + " produse de la tastatura: ");
        for (Produs produs : listaProduse) {
            System.out.println(produs);
        }

    }

}