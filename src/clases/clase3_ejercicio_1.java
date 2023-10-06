package clases;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase3_ejercicio_1 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void printMajor (int mayor, int menor){
        System.out.println(mayor);
        mayor--;
        if (mayor<menor){
            return;
        }
        printMajor(mayor, menor);
    }
    public static void printLess (int mayor, int menor){
        int n = menor;
        while (mayor>=menor){
            System.out.println(n);
            mayor--;
            n++;
        }
    }
    public static void printRangeNumber (int num1, int num2){
        if(num2>num1){
            printLess(num2,num1);
        }else{
            printMajor(num1,num2);
        }
    }
    public static void main (String[] args) throws IOException {
        System.out.print("Ingrese el primer numero : ");
        int numero_1 = Integer.parseInt(reader.readLine());
        System.out.print("Ingrese el Segundo numero : ");
        int numero_2 = Integer.parseInt(reader.readLine());
        printRangeNumber(numero_1,numero_2);
        System.out.println("______________________");
        System.out.println(fibonacci(8));
    }
}