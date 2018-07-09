package com.cice.EJERCICIOS;

public class ejercicio1 {
    public static void main(String[] args) {

        String cadena1 = " hola ";
        String cadena2 = " hola que tal estas hoy piltrafa";
        String cadena3 = " hola que ";


        if (cadena1.length() > cadena2.length()) {
            if (cadena1.length() > cadena3.length()) {
                System.out.println(" la cadena las larga es la numero 1 " + cadena1);
            }

            }else if (cadena2.length() > cadena3.length()) {

            System.out.println(" la cadena las larga es la numero 2 " + cadena2);
        }else
            System.out.println(" la cadena las larga es numero 3 " + cadena3);


    }
}


