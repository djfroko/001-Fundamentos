package com.cice.EJERCICIO2;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        System.out.println("que hora es?");

        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();

        if (hora <=24) {
            switch (hora) {

                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    System.out.println("Buenas dias");
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    System.out.println("Buenas tardes");
                    break;

                default:
                    System.out.println("Buenas noches");

            }


            } else {

                System.out.println("ERROR!!!");
            }
        }
    }

