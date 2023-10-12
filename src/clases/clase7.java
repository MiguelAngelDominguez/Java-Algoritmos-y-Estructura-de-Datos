package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase7 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        /*
         Manejo de bases numericas
         HEX = 0x[valor hexadecimal]
         OCt = 0[valor octal]

         */
        int ix = 0x123454;

        /*
        tratamiento de cadenas
        Podemos comprar dos cadenas con la funcion equals() o tambien lo podemos hacer con el operador ==
         */
        String mitexto = "Hola";
        String otroTexto = "Hola";
        System.out.println(mitexto.equals(otroTexto));
        System.out.println(mitexto == otroTexto);
        System.out.println("Ingresa un texto: ");
        mitexto = reader.readLine();
        System.out.println("Ingresa un texto: ");
        otroTexto = reader.readLine();
        System.out.println(mitexto == otroTexto);

        /*
        Manimulacion de expresiones regulares
         */

        String s = "juan|no|come|nada|hoy";
        String []  tokens = s.split("[|]");
        for(int i = 0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }

    }
}
