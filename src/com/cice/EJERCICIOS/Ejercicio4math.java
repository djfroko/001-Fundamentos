package com.cice.EJERCICIOS;

/*En este ejercicio vamos a realizar un programa que nos muestre la suma de todos los números
enteros comprendidos entre dos números aleatorios generados por el propio programa. Los
números aleatorios serán mayores de 0 y menores de 100.*/

public class Ejercicio4math {

    public static void main(String[] args) {

        int numero1 = (int)(Math.random()*100+1);
        int numero2 = (int)(Math.random()*100+1);

        int numeroMayor = Math.max(numero1,numero2);
        System.out.println(numeroMayor);

        int numeroMenor = Math.min(numero1, numero2);
        System.out.println(numeroMenor);

        int suma = 0;


        for ( int i = numeroMenor ; i <= numeroMayor ; i++){

            suma += i;
        }

        System.out.println(suma);


        }

    }




