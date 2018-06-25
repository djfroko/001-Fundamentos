package com.cice.EjerciciosWeb;


public class Basicos {


    public static void main(String[] args) {

        int n = 10;

        n += 77;

        System.out.println(n);

        n -= 3;
        System.out.println(n);

        n *= 2;
        System.out.println(n);

        System.out.println("=========================================");

        int A = 1, B = 2, C = 3, D = 4, AUX;
        System.out.println("Valores iniciales");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        System.out.println("Valores finales");
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C = " + C);
        System.out.println("A toma el valor de D -> A = " + A);
        System.out.println("D toma el valor de B -> D = " + D);
        System.out.println("=========================================");


        int a = 3;

        System.out.println(a + (a % 2 == 0 ? " es par " : " es impar"));

        System.out.println("=========================================");

        int b = 5;


        if (b>=0) {


            System.out.println("el numero es positivo");

        } else {


            System.out.println("el numero es negativo");




        }
        System.out.println("=========================================");

        int c =100;
        System.out.println(c + (c % 2 ==0 ? " es par" : " es impar"));
        System.out.println(c + ( c >= 0 ? " es positivo" : "es negativo"));
        System.out.println( c + ( c % 3 ==0 ? " es multiplo de 3" : " no es multiplo de 3"));
        System.out.println( c + ( c % 10 ==0 ? " es multiplo de 10" : " no es multiplo de 10"));
        System.out.println( c + ( c % 100 ==0 ? " es multiplo de 100" : " no es multiplo de 100"));
        System.out.println("=========================================");



    }
}