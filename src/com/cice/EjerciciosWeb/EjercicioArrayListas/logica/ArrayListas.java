package com.cice.EjerciciosWeb.EjercicioArrayListas.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListas {

    Scanner sc = new Scanner(System.in);
    private int cantidad;
    private double media = 0;
    private int numeroAltos= 0;
    private int numeroBajos = 0;

    public void iniciarApp(){

        numeroAlumnos();
        leerAlturas();
        calcularMedias();
        mediaAltos();
        mediaBajos();
        mostrarResultados();
    }


    //Calcular la altura media de los alumnos de una clase

    private ArrayList<Double> listaAltura = new ArrayList<>();




    private void  numeroAlumnos() {

        System.out.println("Introduce el numero de alumnos ");

        cantidad = sc.nextInt();

    }

    private void leerAlturas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println( " Introduce la altura ");

            listaAltura.add(sc.nextDouble());
        }
    }

    private void calcularMedias() {

        for (int i = 0; i < cantidad ; i++) {

           listaAltura.get(i) += media ;
        }

        media = media / cantidad;
    }

    private void mediaAltos(){

        for (int i = 0; i < cantidad; i++) {
            if (listaAltura.get(i)>media){
                numeroAltos++;
            }

        }
    }

    private void mediaBajos(){
        for (int i = 0; i < cantidad; i++) {
            if (listaAltura.get(i)<media){
                numeroBajos++;
            }

        }

    }

    private void mostrarResultados() {

        System.out.println("===============================");
        System.out.println("La media de la altura es: " + media);
        System.out.println("El numero que supera la altura media es " + numeroAltos);
        System.out.println("El numero por debajo de la media de altura es " + numeroBajos);
        System.out.println("===============================");

    }


}


