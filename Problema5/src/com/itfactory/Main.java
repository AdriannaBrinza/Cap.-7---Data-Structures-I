package com.itfactory;
/* Sa se un program in Java pe baza urmatoarelor cerinte.
1. Sa se creeze o interfata Task in care se va declara metoda executa. ("void executa();")
2. Se va crea o clasa Printer care va implementa implementa interfata Task. Aceasta clasa va avea un parametru de tip String (folositi constructor cu parametri). Metoda execute implementata din interfata va afisa string-ul respectiv.
3. Se va crea o clasa Insumare care va implementa implementa interfata Task. Aceasta clasa va avea doi parametri de tip int(folositi constructor cu parametri). Metoda execute implementata din interfata va afisa suma celor doua numeree.
4. Se va crea o clasa Main cu metoda main unde se va initializa o lista de Task-uri (folosind List din java).
5. Se va crea o bucla for de 10 iteratii in care la fiecare iteratie se va genera un numar random intre 0 si 1. Daca numarul generat este 0 atunci se va introduce in lista un task de tipul Printer. Daca numarul generat este 1 se va introduce in lista un task de tipul Insumare. La constructie alegeti voi parametrii.
6. Se va parcurge lista si se vor executa task-urile fiecarui element. */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int numar = random.nextInt(1 + 1);
            if (numar == 0) {
                System.out.print("Introduceti un text pentru taskul \"Printer\": ");
                lista.add(new Printer(scanner.nextLine()));
            } else {
                lista.add(new Insumare(random.nextInt(21), random.nextInt(21)));
            }
        }

        System.out.println("\nLista de taskuri este urmatoarea: ");
        for(Task task: lista){
            System.out.println(task);
        }

        int contor = 0;
        System.out.println("\nTaskurile executate: ");
        for (Task element : lista) {
            contor++;
            System.out.print(contor + ". Rezultatul task-ului " + element + " este: ");
            element.executa();
        }

    }
}
