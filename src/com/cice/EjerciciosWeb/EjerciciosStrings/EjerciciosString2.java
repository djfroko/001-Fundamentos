package com.cice.EjerciciosWeb.EjerciciosStrings;

import java.util.Scanner;

public class EjerciciosString2 {

    public static void main(String[] args) {

        /*
         * Pedimos al usuario introducir una frase palabra por palabra.
         * Cuando termine la frase debe pulsar la palabra "fin". Momento en que se
         * mostrara la frase completa por consola. Dara igual que las palabras sean
         * mayusculas o minusculas. El programa funcionara igual.
         */

        Scanner sc = new Scanner(System.in);
        String frase = " ";
        String palabra;

        System.out.print("Introduce palabras para ir formando una frase y fin para terminar: ");
        palabra = sc.nextLine();

        while (!palabra.toLowerCase().equals("fin")){
            frase = frase + " " + palabra;
            System.out.print("Introduce otra palabra o fin para salir: ");
            palabra = sc.nextLine();
        }
        System.out.println(frase);
    }

}
