package clases;

public class    clase6 {
    public static void main(String[] args){
        /*
        char -> tipo primitivo
        String -> tipo personalizado (clase)
        2 != '2' != "2"
        int  char String

        Caracteras que maneja java son:
         - minusculas
         - mayusculas
         - Numeros
         - Caracteres especiales

        String - type Object
        Metodos de String
        1. toUpperCase() Mayusculas
        */
         String holaMundo = "uwu";
         System.out.println(holaMundo.toUpperCase());
         /*
        2. toLowerCase() Minusculas
         */
        System.out.println(holaMundo.toLowerCase());
        /*
        3 charArt(i) retorna la cadena en el indice i
         */
        System.out.println(holaMundo.charAt(1));
        /*
        4 length() Retorna la cantidad de caracteres que posee una cadena
         */
        System.out.println(holaMundo.length());
        /*
        4. indexOf('caracter') retorna el primer indice que concida con el caracter ingresado
         */
        System.out.println(holaMundo.indexOf('w'));
        /*
        5. lastIndexOf('caracter') retorna el ultimo indice que concida con el caractes ingresado
         */
        System.out.println(holaMundo.lastIndexOf('u'));
        /*
        6. str.subString(i,e) retorna una sub cadena de la cadena padre, desde el indice i hasta el indice e
         */
        System.out.println("____");
        System.out.println(holaMundo.substring(0,2));
        /*
        7. startsWith("cadena")
         */
        String s = "Un buen libro de Java";

        System.out.println(s.startsWith("Un buen"));
        /*
        8. endsWith("cadena")
         */
        System.out.println(s.endsWith("Chau"));
        /*
        9. StringBuffer - Alamacenamiento temporal
         */
        String x  = new StringBuffer().append("wasa ").append("gaa").toString();
        System.out.println(x);



        for (int i = 0; i<0; i++){
            System.out.println(i+'A');
        }
        char c;
        for (int i = 'A'; i=='Z'; i++){
            // usando la palabara clave (char), convertimos el numero en un char
            c = (char) i;
            System.out.println(c);
        }
        // System.out.println("Hola\n Mundo \t desde Java 1\\12\\23");


     }
}
