

import java.util.ArrayList;
import java.util.List;


class Monchito {


    public static void main(String[] args) {
        Monchito m = new Monchito();
        String cadena = m.cadenaLarga();
        System.out.println("La cadena más larga es: " + cadena);
    }

    public String cadenaLarga() {

        String cadena1 = "hola";
        String cadena2 = "hola que tal";
        String cadena3 = "hola machote";
        String cadena4 = "hola que tal estas";
        List<String> cadenas = new ArrayList();

        cadenas.add(cadena1);
        cadenas.add(cadena2);
        cadenas.add(cadena3);
        cadenas.add(cadena4);

        String cadena_larga = "";
        for (String cadena : cadenas) {
            if (cadena.length() > cadena_larga.length()) {
                cadena_larga = cadena;
            }
        }

        return cadena_larga;
    }
}