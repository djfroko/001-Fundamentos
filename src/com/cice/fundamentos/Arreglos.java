package com.cice.fundamentos;

public class Arreglos {

    int a = 10;
    int[] numeros = new int[a];
    static int[] otrosNumeros = { 1,2,3,4,5};

    public static void main(String[] args) {

        System.out.println(otrosNumeros[4]);

        otrosNumeros[1] = 3;

        int size = otrosNumeros.length;

        System.out.println(size);
    }
}
