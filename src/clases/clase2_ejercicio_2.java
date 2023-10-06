package clases;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase2_ejercicio_2 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String readNumber(int e) throws IOException {
        System.out.print("Ingresa el #Numero "+e+": ");
        return reader.readLine();
    }

    public static void printArray (int [] a){
        for (int num:a) {
            System.out.println("Dato: "+num);
        }
    }
    public static void printParNumber(int [] a){
        for (int num: a) {
            if(num%2 == 0){
                System.out.println("Dato: "+num);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        int [] numeros = new int[11];
        for (int i = 0; i<=10; i++){
            numeros[i]=Integer.parseInt(readNumber(i));
        }
        System.out.println("________. Todos los Numero ._______");
        printArray(numeros);
        System.out.println("________. Numero Pares ._______");
        printParNumber(numeros);
    }
}
