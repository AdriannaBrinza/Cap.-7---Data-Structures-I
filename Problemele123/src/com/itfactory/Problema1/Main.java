package com.itfactory.Problema1;

//Sa se creeze un program simplu (o clasa Main cu metoda main) in care se va defini un array de elemente de tip int (primitiva).
// Lungimea array-ului (int) se va citi de la tastatura.
//(Folositi <int lungime = Integer.parseInt(scanner.nextLine());> pentru a citi int-ul (contraindicat scanner.nextInt()).
//Cu ajutorul unei bucle for se vor introduce in array elemente random intre 0 si 20. Afisati array-ul.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduceti lungimea array-ului: ");
        int lungime = Integer.parseInt(scanner.nextLine());
        int[] myArray = new int[lungime];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(20+1);
            System.out.println(myArray[i]);
        }

    }
}