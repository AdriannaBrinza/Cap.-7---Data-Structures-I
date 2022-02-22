package com.itfactory.Utils;

import com.itfactory.model.Produs;
import java.util.Scanner;

public class Utils {

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static Produs citesteProdus() {
        System.out.print("Tastati numele produsului: ");
        String denumire = scanner.nextLine();
        System.out.print("Tastati pretul produsului: ");
        double pret = Double.parseDouble(scanner.nextLine());
        return new Produs(denumire, pret);
    }

}