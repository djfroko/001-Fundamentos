package com.cice.indices;

import java.util.ArrayList;

public class ColeccionesBasadaseEnIndices {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Cristian");
        listaNombres.add("antonio");
        listaNombres.add(1, "Pedro");

        String nombre = listaNombres.get(0);

        System.out.println("el nombre almacenado es: " + nombre);

        for (int i = 0; i < listaNombres.size(); i++) {

            System.out.println((listaNombres.get(i)));


        }
        listaNombres.set(1, "pakito");
        System.out.println("========================");
        for (String name : listaNombres) {
            System.out.println(name);
        }

        listaNombres.set(1, "pakito");
        {

        }
        System.out.println("========================");


    }


}
