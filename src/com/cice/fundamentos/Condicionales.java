package com.cice.fundamentos;

public class Condicionales {


    public static void main(String[] args) {

        boolean condicion = true;

        //estructura de control IF/ IF - ELSE
        if (true) {
            //si se cumple la condicion ejecuto este bloque de codigo
            System.out.println("condicion cumplida");

            if (condicion) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else {
            //si no se cumple ejecutamos este otro bloque de codigo
            System.out.println("no se cumple la condicion");
        }

        if (condicion) {

        } else if (!condicion) {

        } else if (1 == 2) {

        } else {

        }
    }


}
