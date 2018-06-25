package com.cice.EjerciciosWeb;

import java.util.Scanner;

public class Basicos2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //suma 2 numeros

        System.out.println("introduce un numero");

        int numeroA = entrada.nextInt();


        System.out.println("introduce un numero");

        int numeroB = entrada.nextInt();

        System.out.println("la suma de esos numero es " + (numeroA+numeroB));

        System.out.println("=====================================");
        // saluda a tu nombre

        System.out.println("Escribe tu nombre");

        String nombre = entrada.nextLine();

        System.out.println("hola " + nombre + " Como estas maquina");

        System.out.println("=====================================");
        //pasar centigrados a fahrenheit

        System.out.println("Escribe la temperatura en grados centigrados");

        int temperatura = entrada.nextInt();

        System.out.println(" la temperatura en grados fahrenheit es: " + (9*temperatura/5));

        System.out.println("=====================================");
        //area circulo

        System.out.println("escribe el radio de la circunferencia");

        double radio = entrada.nextInt();
        System.out.println(" el area del circulo es " + (Math.PI*(radio*radio)));
        System.out.println(" la longitud de la circunferencia es " + (2*Math.PI*radio));

        System.out.println("=====================================");
        //Volumen Esfera

        double radioE = entrada.nextDouble();

        System.out.println("escribe el radio de la esfera");
        System.out.println(" el volumen de la esfera es " + (4*Math.PI*Math.pow(radioE, 3))/3 );

        System.out.println("=====================================");
        // velocidad a metros por segundo

        System.out.println("introducde la velocidad a convertir");

        int velocidad = entrada.nextInt();

        System.out.println(" la velocidad " + velocidad + "km/h  en metros por segundo es " + (velocidad*1000/3600));

        System.out.println("=====================================");
        //calcular area triangulo

        double p;

        System.out.println("escribe la longitud del cateto 1");

        double a = entrada.nextDouble();

        System.out.println("escribe la longitud del cateto 2");

        double b = entrada.nextDouble();

        System.out.println("escribe la longitud de la hipotenusa");

        double c = entrada.nextDouble();

        p = (a+b+c)/2;

        System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));

        System.out.println("=====================================");

        System.out.println("introduce un numero de 3 cifras");

        int numero3 = entrada.nextInt();

        System.out.println("Primera cifra de " + numero3 + " -> " + (numero3/100));
        System.out.println("Cifra central de " + numero3 + " -> " + (numero3/10)%10);
        System.out.println("Última cifra  de " + numero3 + " -> " + (numero3%10));

        System.out.println("=====================================");

        System.out.println("introduce un numero de 5 cifras");

        int numero5 = entrada.nextInt();

        System.out.println(numero5/10000);
        System.out.println(numero5/1000);
        System.out.println(numero5/100);
        System.out.println(numero5/10);
        System.out.println(numero5);

        System.out.println("=====================================");






    }
}
