package com.cice.fundamentos;

public class Operadores {

    //Operadores de relaccion -> > < >= <= != ==;
    //Su finalidad es la de relaccionar 2 objetos o variables para conseguir una respuesta true o false

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;

    //operadores logicos && &; || |; !; ^;
    //                  AND     OR   NOT XOR



    public static void main (String... args) {

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println( "OPERADORES LOGICOS");
        System.out.println( ( r1 || r2 ) );
        System.out.println( ( r2 && r3 ) );
        System.out.println( ( !r4 ) );
        System.out.println( ( r5 ^ r6) );

        System.out.println("OPERADORES UNARIOS");
        int a= ~127;
        System.out.println(a);

        System.out.println("OPERADORES DE ASIGNACION");
        int b = 5;
        b++; // b = b+1 pinta el valor sin sumar la variable
        System.out.println(b);
        ++b; // pinta el valor de b sumando la variable
        System.out.println(b);
        b--; // b = b-1
        System.out.println(b);
        --b;
        System.out.println(b);
        b*=2; // b = b*2
        System.out.println(b);
        b/=5; // b= b/5
        System.out.println(b);

        b+=3;
        System.out.println(b);

        b%=5; // b = b%5 -----> para asignarle el resto a la variable B
        System.out.println(b);

        b=1;
        b<<=01; //mete un 0 a la derecha en el binario del numero.
        // desplazamiento de binarios 7 -> 111 -> 111(+0) -> 1110 ---> en decimal 14
        System.out.println(b);

        b=4;
        b>>=01;// desplazamiento de binarios 7 -> 111 -> (0)+11(-1)-> 011 ---> en decimal 3
        System.out.println(b);





    }

}
