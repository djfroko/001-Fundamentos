package com.cice.EjerciciosWeb;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice
        // y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.

        /*int [] array = new int[10];

        for (int i = 0; i<array.length;i++){
            System.out.println("introduce valor de la posicion " +i);
            array[i]=sc.nextInt();
        }

        System.out.println("datos completos");

        for (int i = 0; i<array.length;i++){
            System.out.println("el valor de la posicion "+ i +" es: "+ array[i]);
        }

        System.out.println("fin de la cita");

        System.out.println("================================");

        //Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array
        // con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y
        // la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los
        // números entre los que tenga que generar), para mostrar el contenido y la suma del array y un
        // método privado para generar número aleatorio (lo puedes usar para otros ejercicios).

        System.out.println("introduce el tamaño del array");

        int [] array2 = new int[sc.nextInt()];

        for (int i = 0; i<array2.length;i++){
            array2[i]=(int)(Math.random()*10+1);
        }

        for (int i = 0;i<array2.length;i++){
            System.out.println("En el indice "+i+" el valor es "+ array2[i]);
        }
        System.out.println("================================");

        System.out.println("introdice tamaño del array");
        int[] array3 = new int[sc.nextInt()];

        for (int i = 0; i<array3.length;i++) {
            array3[i] = (int) (Math.random() * 10 + 1);
        }
        boolean primo=true;
        int contador = 2;

        for (int i = 0;i<array3.length;i++){

            while ((primo) && (contador!=array3[i])){
                if (array3[i]% contador == 0)
                    primo = false;
                contador++;
            }

            System.out.println("la posicion " +i+ " tiene un numero primo " + array3[i]);
        }

        System.out.println("================================");
        //Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        // Obtén la suma de todos ellos y la media.

        int[] array4 = new int[100];
        int suma = 1;
        double media = 0;

        for (int i = 0; i<array4.length ;i++){
            array4[i]=i+1;
            suma = suma + i;
            //System.out.println(array4[i]);

         }
         media =(double) suma/array4.length;

        System.out.println("la suma de todos los numeros del array es: " + suma);
        System.out.println("la media del array es " + media);

        */
        System.out.println("================================");

        /*5) Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
         Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta,
         se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.

        Por ejemplo, si escribo los siguientes numeros
        0 //Añadira la ‘A’
        5 //Añadira la ‘F’
        25 //Añadira la ‘Z’
        50 //Error, inserte otro numero
                -1 //fin

        Cadena resultante: AFZ*/

        char[] array5 = new char[26];

        char letra = 'A';

        for (int i = 0; i < array5.length; i++) {
            array5[i] = letra;
            //System.out.println(letra);
            letra++;
        }
        int posicion = 1;
        String palabra = "";


        do {
            System.out.println("introduce una posicion del array");

            posicion = sc.nextInt();

            if (posicion > 25) {

                System.out.println("==================================================");
                System.out.println("Posicion incorrecta, vuelva a introducir posicion");
                System.out.println("==================================================");

            } else if (posicion >= 0) {

                char guardarPosicion = array5[posicion];
                palabra += guardarPosicion;
                System.out.println(guardarPosicion);
            } else if (posicion < 0) {

            }

        } while (posicion != -1);

        System.out.print("Las letras acumuladas son :");

        System.out.println(palabra);
    }
}



























