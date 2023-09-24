package PrimeraPractica;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void print(String txt){
        System.out.print(txt);
    }

    public static void println(String txt){
        System.out.println(txt);
    }

    public static float[][] SumadeMatrices() throws IOException {
        println(".___ Valores de la Primera Matriz");
        print(" - Ingrese la longitud de la fila : ");
        int fila = Integer.parseInt(reader.readLine());
        print(" - Ingrese la longitud de la columna : ");
        int columna = Integer.parseInt(reader.readLine());

        Matriz matriz_1  = new Matriz(fila,columna);

        matriz_1.setValuesArray();
        matriz_1.getValuesArray();

        println(".___ Valores de la Segunda Matriz");
        print(" - Ingrese la longitud de la fila : ");
        int fila_2 = Integer.parseInt(reader.readLine());
        print(" - Ingrese la longitud de la columna : ");
        int columna_2 = Integer.parseInt(reader.readLine());

        Matriz matriz_2  = new Matriz(fila_2,columna_2);

        matriz_2.setValuesArray();
        matriz_2.getValuesArray();
        println(".______Suma de Matrices_______.");
        Matriz matrizSuma = new Matriz(fila,columna);
        matrizSuma.array = matriz_1.SumaMatriz(matriz_2.getArray());
        matrizSuma.getValuesArray();
        return matrizSuma.getArray();
    }

    public static void main (String[] args) throws IOException{
        while(true){
            println(" CALCULADORA DE MATRICES");
            String menu = """
                _____________________________
                1. Suma de Matriz.
                2. Multiplicacion de Matrices.
                3. Salir.
                ______________________________
                
                .___Ingrese una opcion : """;
            print(menu);
            int opc = Integer.parseInt(reader.readLine());
            switch (opc){
                case 1:
                    SumadeMatrices();
                    break;
                case 2:
                    println("Multiplicacion de Matrices en proceso");
                    break;
                case 3:
                    return;
                default:
                    println(":___Opc no Encontrada");
                    println("______________________________");
            }
        }
    }
}
