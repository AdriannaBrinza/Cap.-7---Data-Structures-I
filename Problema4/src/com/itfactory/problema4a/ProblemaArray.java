package com.itfactory.problema4a;

/* Sa se creeze o clasa simpla (ProblemaArray) in care se va defini main.
Pentru aceasta problema se cere sa se initieze un array de stringuri citite de la tastatura.
(Numarul il stabiliti voi. Alegeti cel putin 3 elemente ca sa nu fie nici 1 sau 2 ca nu ar mai avea sens array-ul).
Se cere sa se construiasca un alt array de stringuri de aceeasi dimensiune in care sa se introduca elementele din primmul array
construit in ordine inversa. (Acesta nu il mai veti citi de la tastatura)
Exemplu:
array1 in care elementele sunt citite de la tastatura: mar par cireasa banana
array2 pe care il veti construi pe baza array1: banana cireasa par mar.
Se vor afisa ambele array-uri element cu element folosind parcurgerea cu for. */

import java.util.Scanner;

public class ProblemaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Alegeti lungimea primului array: ");
        int lungime = Integer.parseInt(scanner.nextLine());
        String[] arrayString = new String[lungime];
        String[] arrayStringReversed = new String[lungime];

        for (int i = 0; i < lungime; i++) {
            System.out.print("Introduceti elementul cu indexul " + i + ": ");
            arrayString[i] = scanner.nextLine();
        }

        System.out.println("\nPrimul array este: ");
        for (String element : arrayString) {
            System.out.println(element);
        }


        for (int j = 0; j < lungime; j++) {
            arrayStringReversed[j] = arrayString[lungime - 1 - j];
        }

        System.out.println("\nArray-ul inversat este: ");
        for (String element : arrayStringReversed) {
            System.out.println(element);
        }
    }
}