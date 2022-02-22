package com.itfactory;

import com.itfactory.model.Curs;
import com.itfactory.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Curs> listaCursuri = new ArrayList<>();
        while (true) {
            Curs curs = Utils.citesteCurs();
            listaCursuri.add(curs);
            System.out.print("Mai adaugam un curs in lista? Daca da, tastati \"y\", iar daca nu tastati orice alt caracter de la tastatura: ");
            String raspuns = scanner.nextLine();
            if (!raspuns.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.println(listaCursuri);
    }
}
