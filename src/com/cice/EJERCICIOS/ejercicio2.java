package com.cice.EJERCICIOS;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        int var = 5;

        //Scanner para pedir datos por consola al usuario

        System.out.println("Introdce un numero");

        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        if (var % 2 == 0) {

            System.out.println("ES PAR");

        } else {

            System.out.println(" ES IMPAR ");
        }
    }
}

