package com.cice.fundamentos;

public class Bucles {

    public static void main(String[] args) {

        //BUCLE FOR

        //for (iniciacion; condicion; incremento){
        for(int i = 0; i<10; i++){
            //ejecutamos codigo,
            System.out.println(i);
        }

        for(;;){
            System.out.println("hola");
            //bucle infinito, no es necesario ningun parametro para un bucle
            break;
            //con el break paramos el bucle infinito


        }
        int i = 0;
                for(;i < 2;){
                    System.out.println("hola");
                    break;




                }

                int[] array = {1,2,3,4,5,6,7,8,9};

                //FOREACH recorremos todos los parametros del array

        for(int a : array){
            System.out.println(a);
        }

    }
}
