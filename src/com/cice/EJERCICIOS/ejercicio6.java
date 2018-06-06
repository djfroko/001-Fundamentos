package com.cice.EJERCICIOS;

/* Realizar un programa que, dado un determinado array de números enteros, realice el
recorrido de éstey muestre cada uno de estos números hasta que se encuentre un
número negativo, momento en el cual se finalizará el recorrido del array y
se indicará el total de números recuperados.
Para realizar este recorrido utilizaremos una instrucción while en vez de for,
ya que se desconoce el número de iteraciones que debemos realizar

 */

public class ejercicio6 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, -7, 8, 9};
        int i = 0;
        while (i < array.length){
            System.out.println("valor "+array[i]);
            if(array[i] < 0){
                System.out.println("Es negativo abortamos");
                break;
            }
            i++;
        }


        }
    }




