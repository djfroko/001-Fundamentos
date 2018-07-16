package com.cice.EjerciciosWeb.EjerciciosStrings;

import java.util.Scanner;

public class EjerciciosString1 {

    public static void main(String[] args) {
        /*
         *Juego "acierta la contraseña". Pedir al jugador 1 que introduzca una palabra contraseña.
         *Luego se mostrara al jugador 2 un mensaje con la primera y ultima letras de la contraseña.
         *Debera intentar adivinar la contraseña. A cada intento se mostrara mensaje diciendo si el
         *intento tiene mas o menos caracteres que la contraseña. Al acertar, mensaje de enhorabuena.
         */

        Scanner sc = new Scanner(System.in);
        String contraseña;
        String adivina;


        System.out.print("Jugador 1 introduce la contraseña: ");
        contraseña = sc.next();
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");


        System.out.println("Jugador 2 adivina la contraseña");
        System.out.println(" empieza por la letra " + contraseña.charAt(0) +
                " y termina por la " + contraseña.charAt(contraseña.length() - 1));

        do {

            adivina = sc.next();

            if (contraseña.length() < adivina.length()) {
                System.out.println("la contraseña es mas corta");

            } else if (contraseña.length() == adivina.length()) {

                System.out.println("La contraseña tiene el mismo numero de caracteres " + contraseña.length());

            } else {

                System.out.println(" la contraseña es mas larga");
            }

        } while (!contraseña.equalsIgnoreCase(adivina));

        System.out.println("Bien, has acertado!!!");
    }
}






