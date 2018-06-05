package com.cice.fundamentos;

public class Bucles {

    public static void main(String[] args) {

        int i = 0;

        if (true) {
            i = 2;
            if (true) {
                i = 3;
                int j = 2;
            }
        }

        //BUCLE FOR

        //for (iniciacion; condicion; incremento){

        /*for(int i = 0; i<10; i++){
            //ejecutamos codigo,
            System.out.println(i);
        }*/

        for (; ; ) {
            System.out.println("hola");
            //bucle infinito, no es necesario ningun parametro para un bucle
            break;
            //con el break paramos el bucle infinito


        }
        System.out.println("=============incremento de 3 en 3==========");
        for (; i < 10; i += 3) {
            System.out.println("hola");

        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //FOREACH recorremos todos los parametros del array

        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("===========while=========");

        //while

        while (i < 20) {
            System.out.println("i vale: " + i);
            i++;
            // tambien se puede poner la linea asi
            // System.out.println("i vale: " + i++);
            //y quitariamos la liena de abajo i++;
        }
        System.out.println("=====do while=======");
        do {
            System.out.println("i vale " + i++);

        } while (i < 30);
    }
}
