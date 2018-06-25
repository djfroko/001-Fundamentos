package com.cice.indices;

//hacer lista con 5 notas y sacar la media

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList <Double> listaNotas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la primera nota");
        Double nota1 = sc.nextDouble();
        System.out.println("introduce la segunda nota");
        Double nota2 = sc.nextDouble();
        System.out.println("introduce la tercera nota");
        Double nota3 = sc.nextDouble();
        System.out.println("introduce la cuarta nota");
        Double nota4 = sc.nextDouble();
        System.out.println("introduce la quinta nota");
        Double nota5 = sc.nextDouble();

        System.out.println(" la nota media es " + (nota1+nota2+nota3+nota4+nota5)/listaNotas.size());






    }
}
