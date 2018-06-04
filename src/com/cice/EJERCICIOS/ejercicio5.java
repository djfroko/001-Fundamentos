package com.cice.EJERCICIOS;

public class ejercicio5 {

    //Realizar un programa que, dado un array de números enteros, calcule la suma de todos los números
    //contenidos en el mismo y la muestre por pantalla.
    //Se empleará una instrucción foreach para realizar el recorrido del array.


    public static void main(String[] args) {

        int i = 0;

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 0;
        for (int a : array) {

            num += a;


        }
        System.out.println("la suma de los valores es: " + num);
        System.out.println("=========================");


        int[] auxiliar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int resultado = 0;
        for (int j : auxiliar) {
            resultado = resultado + j;
        }
        System.out.println("la suma de los valores es: " + resultado);


        //while
        while (i < 10) {
            System.out.println("i vale " + i++);

        }
        System.out.println("======================");
        do{
            System.out.println("i vale " + i++);
        }while( i < 10);
    }

}