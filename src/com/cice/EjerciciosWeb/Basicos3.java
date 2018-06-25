package com.cice.EjerciciosWeb;

import java.util.Scanner;

public class Basicos3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        /*System.out.println("introduce un numero");

        int a = entrada.nextInt();

        if(a%2==0){

            System.out.println("el numero " + a + " es par");

        }else{

            System.out.println("el numero " + a + " es impar");
        }

        System.out.println("=======================================");

        System.out.println("introduce un numero");

        int b = entrada.nextInt();
        int c = 10;
        int resto;

        resto = b%c;
        if(resto==0) {
            System.out.println("el numerp es multiplo de 10");
        }else{
            System.out.println("el numero no es multiplo de 10");
        }

        System.out.println("=======================================");

        System.out.println("introduce una letra");

        String caracter1 = entrada.nextLine();

        System.out.println("introduce otra letra");

        String caracter2 = entrada.nextLine();

        if(caracter2.equals(caracter1)){

            System.out.println(" los caractreres son iguales");
        }else{
            System.out.println("no lo son");
        }*/

        System.out.println("=======================================");

        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = entrada.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = entrada.nextInt();

        if (n1 > n2)
            if (n1 > n3)
                System.out.println("El mayor es: " + n1);
            else
                System.out.println("el mayor es: " + n3);
        else if (n2 > n3)
            System.out.println("el mayor es: " + n2);
        else
            System.out.println("el mayor es: " + n3);


    }
}
