package com.cice.EJERCICIOS;

public class ejercicio5 {

    //Realizar un programa que, dado un array de números enteros, calcule la suma de todos los números
    //contenidos en el mismo y la muestre por pantalla.
    //Se empleará una instrucción foreach para realizar el recorrido del array.


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int resultado = 0;
        //bucle foreach
        for (int i : array) {
            //resultado += i; podriamos hacerlo asi para escribir menos.
            resultado = resultado + i;

        }
        System.out.println("la suma de los valores es: " + resultado);
        System.out.println("=========================");

        //bucle convencional
        for(int i=0; i<array.length; i++){
            int auxiliar = array[i];
        }
        System.out.println("la suma de los valores es: " + resultado);

        System.out.println("=========================");


//FOREACH




    }

}