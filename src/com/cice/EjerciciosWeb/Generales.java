package com.cice.EjerciciosWeb;

import java.io.IOException;
import java.util.Scanner;

public class Generales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pasar de grados centígrados a grados kelvin.El proceso de leer grados centígrados se debe repetir
        // mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)


       /* char respuesta;

        do {
            System.out.println("Introduce temperatura");

            double temperatura = sc.nextDouble();

            double resultado = temperatura + 273.15;


            System.out.println("La temperatura en grados kelvin es " + resultado);

            System.out.println("Quieres volver a repetirlo(S/N)");

            respuesta = (char)System.in.read();


        }while(respuesta =='S' || respuesta == 's');

        System.out.println("=======================================");

        //Mostrar la tabla de multiplicar de un número.

        System.out.println("introduce un numero");

        int numero = sc.nextInt();

        System.out.println("tabla del " + numero);

        for (int i=1;i<=10;i++){
            System.out.println(numero +"*"+i+"="+(i*numero));
        }

        System.out.println("=======================================");
        //Leer un número N y calcular el factorial de los números desde 0 hasta N.


        int N;
        double factorial;

        //Leer un número entero >= 0
        do {
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        } while (N < 0);

        for (int i = 0; i <= N; i++) { //para cada número desde 1 hasta N

            //se calcula su factorial
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            //se muestra el factorial
            System.out.printf("%2d! = %.0f %n", i, factorial);
        }


        System.out.println("=======================================");

        for (char x = 'Z'; x >= 'A'; x--) {
            for (char y = x; y >= 'A'; y--) {
                System.out.print(y);
            }
            System.out.println();
        }*/
        System.out.println("=======================================");

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            System.out.print(i != 3 ? i : "E");
                            System.out.print(j != 3 ? j : "E");
                            System.out.print(k != 3 ? k : "E");
                            System.out.print(l != 3 ? l : "E");
                            System.out.println(m != 3 ? m : "E");
                        }
                    }
                }
            }
        }
        System.out.println("=======================================");


    }
}




