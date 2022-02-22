package com.itfactory.Problema2;

//Sa se creeze un program simplu (o clasa Main cu metoda main) in care se va defini un array de elemente de tip String.
// Lungimea array-ului (int) se va citi de la tastatura.
//(Folositi <int lungime = Integer.parseInt(scanner.nextLine());> pentru a citi int-ul (contraindicat scanner.nextInt()).
//Cu ajutorul unei bucle for se vor introduce in array elemente citite de la tastatura. Afisati array-ul.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti lungimea array-ului de String-uri: ");
        int lungime = Integer.parseInt(scanner.nextLine());
        String[] myArray = new String[lungime];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Introduceti elementul cu indexul " + i + " in lista: ");
            myArray[i] = scanner.nextLine();
        }

        System.out.println("\nLista este compusa din urmatoarele elemente de tip String: " +
                "\n---------------");
        for (String element : myArray) {
            System.out.println(element);
        }

    }

}
