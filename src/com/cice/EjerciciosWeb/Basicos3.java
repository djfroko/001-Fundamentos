package com.cice.EjerciciosWeb;

import java.util.Scanner;

public class Basicos3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        /*System.out.println("introduce un numero");

        int a = entrada.nextInt();

        if(a%2==0){

            System.out.println("el numero " + a + " es par");

        }else{

            System.out.println("el numero " + a + " es impar");
        }

        System.out.println("=======================================");

        System.out.println("introduce un numero");

        int b = entrada.nextInt();
        int c = 10;
        int resto;

        resto = b%c;
        if(resto==0) {
            System.out.println("el numerp es multiplo de 10");
        }else{
            System.out.println("el numero no es multiplo de 10");
        }

        System.out.println("=======================================");

        System.out.println("introduce una letra");

        String caracter1 = entrada.nextLine();

        System.out.println("introduce otra letra");

        String caracter2 = entrada.nextLine();

        if(caracter2.equals(caracter1)){

            System.out.println(" los caractreres son iguales");
        }else{
            System.out.println("no lo son");
        }

        System.out.println("=======================================");

        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = entrada.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = entrada.nextInt();

        if (n1 > n2)
            if (n1 > n3)
                System.out.println("El mayor es: " + n1);
            else
                System.out.println("el mayor es: " + n3);
        else if (n2 > n3)
            System.out.println("el mayor es: " + n2);
        else
            System.out.println("el mayor es: " + n3);

        System.out.println("=======================================");

        //Programa que lea tres números enteros H, M, S que contienen hora,
        // minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

        System.out.println("introduce la hora");
        int horas = entrada.nextInt();
        System.out.println("introduce los minutos");
        int minutos = entrada.nextInt();
        System.out.println("Introduce segundos");
        int segundos = entrada.nextInt();

        if(horas>=0 && horas<24 && minutos>=0 && minutos<60 && segundos>=0 && segundos<60)
            System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");

        System.out.println("=======================================");

        //Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de
        // 30, 31 o 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el
        // valor introducido esté comprendido entre 1 y 12.

        int mes;
        System.out.print("Introduzca número de mes: ");
        mes =  entrada.nextInt();
        if(mes < 1 || mes > 12) //se comprueba que el valor del mes es correcto
            System.out.println("Mes incorrecto");
        else{  //si el mes es correcto
            switch(mes){  //se muestra el nombre mediante una instrucción switch
                case 1: System.out.print("Enero");
                    break;
                case 2: System.out.print("Febrero");
                    break;
                case 3: System.out.print("Marzo");
                    break;
                case 4: System.out.print("Abril");
                    break;
                case 5: System.out.print("Mayo");
                    break;
                case 6: System.out.print("Junio");
                    break;
                case 7: System.out.print("Julio");
                    break;
                case 8: System.out.print("Agosto");
                    break;
                case 9: System.out.print("Septiembre");
                    break;
                case 10: System.out.print("Octubre");
                    break;
                case 11: System.out.print("Noviembre");
                    break;
                case 12: System.out.print("Diciembre");
                    break;
            }
            // mostrar si es un mes de 30, 31 0 28 días
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
                System.out.println(" es un mes de 30 días");
            else if(mes == 2)
                System.out.println(" es un mes de 28 días");
            else
                System.out.println(" es un mes de 31 días");
        }*/


        System.out.println("=======================================");
        // Programa Java que muestre los números del 1 al 100 utilizando la instrucción while

        System.out.println("Numeros del 1 al 100: ");

        int numeros = 1;

        while(numeros <= 100){
            System.out.println(numeros);
            numeros++;
        }




    }





}

