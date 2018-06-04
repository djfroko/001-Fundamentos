package com.cice.EJERCICIO2;
//Realizar un programa que calcule el factorial de un número existente en una
// determinada variable entera.
//El factorial de un número es el resultado de multiplicar entre sí todos los números naturales menores
// entre 1 y el número en cuestión.

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

       //Factorial dado un numero -> desde n * (n-1) * ...... hasta 1

        Scanner sc = new Scanner(System.in);

        System.out.print("introduce numero");
        int numeroDado = sc.nextInt();

        int factorial =1;
        for(int i= 1; i <=numeroDado;i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numeroDado + " es: " + factorial);







        }


    }

