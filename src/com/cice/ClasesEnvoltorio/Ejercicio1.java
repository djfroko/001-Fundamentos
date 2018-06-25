package com.cice.ClasesEnvoltorio;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");

        String num1 = sc.next();

        System.out.println("introduce un otro numero");

        String num2 = sc.next();


        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);

        System.out.println("la suma de los 2 numeros es:" + (numero1 + numero2));



















    }

}
