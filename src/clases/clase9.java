package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase9 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[] args) throws IOException {
        int [] arregloEnteros;
        arregloEnteros = new int[12];
        int lengthArreglo = arregloEnteros.length;
        System.out.println(lengthArreglo);

        /*
        Un arreglo ocupa memerria, recien cuando se inserta un dato.

        Recorrido de un arreglo :

         - For
        */
        int [] newNumber = {1, 2, 3, 5, 6};
        for (int i = newNumber.length-1; i>0; i--){
            System.out.println(i);
        }
        /*
         - Foreach
         */

        for (int number : newNumber){
            System.out.println("Numero : "+number);
        }

        System.out.print("- Ingresar el numero a eliminar : ");
        int newNbr = Integer.parseInt(reader.readLine());
        int [] newArreglo = new int[newNumber.length-1];
        int y = 0;
        for (int i = 0; i<newNumber.length-1; i++){
            if (newNbr != newNumber[i]) {
                newArreglo[i] = newNumber[i+y];

            }
            if (newNbr == newNumber[i]){
                y ++;
                newArreglo[i] = newNumber[i+1];

            }
        }
        //newArreglo[newNumber.length-1] = newNbr;
        newNumber = newArreglo;
        for (int nbr : newNumber){
            System.out.print(nbr+" ");
        }

    }
}
