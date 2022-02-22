package com.itfactory.problema4b;
/*
Sa se creeze o clasa simpla (ProblemaListe) in care se va defini doar main. Se cere sa se creeze o lista de numere intregi
(folosind List din java). Folosind o bucla while se cere sa se genereze numere intregi (folosind Random) pana in momentul in care
numarul generat este 10 (cand se genereaza 10 se iese din bucla).
Fiecare numar generat pana la intalnirea lui 10 este introdus in lista de mai sus.
Mai departe, daca lista va contine elemente se vor numara cate aparitii ale numarului 5 sunt.
Indicatii:
! Se va folosi metoda isEmpty() din obiectul de tip lista pentru verificare daca lista este goala

Exemplu de rulare:
Presupunem ca s-au generat numerele 2 5 4 16 5 11 18 5 7 10 (la 10 ma opresc). Introduc numerele intr-0 lista.
Parcurg lista si cand intalnesc valoarea 5 incrementez un contor.
(Un contor inseamna  ca ne definim o variabila de tip int pe care o incrementam cand intalnim valoarea 5 in lista). */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemaListe {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();
        int contor = 0;

        while (true) {
            int numar = random.nextInt(20 + 1);
            if (numar == 10) {
                break;
            }
            lista.add(numar);
        }

        if (lista.isEmpty()) {
            System.out.println("Lista generata random pana la intalnirea lui 10 este goala.");
        } else {
            System.out.println("S-au generat numerele: " + lista);
            for (int element : lista) {
                if (element == 5) {
                    contor++;
                }
            }
            System.out.println("Numarul 5 a fost generat de " + contor + " ori.");
        }

    }
}
