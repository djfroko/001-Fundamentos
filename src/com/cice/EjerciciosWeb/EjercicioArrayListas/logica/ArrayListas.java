package com.cice.EjerciciosWeb.EjercicioArrayListas.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListas {

    Scanner sc = new Scanner(System.in);
    int cantidad;

    public void iniciarApp(){

        numeroAlumnos();
        leerAlturas();
        calcularMedias();
        mostrarResultados();
    }


    //Calcular la altura media de los alumnos de una clase

    ArrayList<Double> listaAltura = new ArrayList<>();


    double media = 0;

    private void  numeroAlumnos() {

        cantidad = sc.nextInt();

    }

    private void leerAlturas() {

        double alturas;

        for (int i = 0; i < cantidad; i++) {

            listaAltura.add(sc.nextDouble());

        }


    }

    private void calcularMedias() {

        for (int i = 0; i < listaAltura.size(); i++) {

            listaAltura.get(i) += media;
        }

        media = media / listaAltura.size();

    }


    private void mostrarResultados() {

        System.out.println("===============================");
        System.out.print("La media de las notas es: " + media);
    }


}


