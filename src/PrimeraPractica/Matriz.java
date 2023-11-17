package PrimeraPractica;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Matriz {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int fila;
    int columna;
    float [][] array;

    private static void print(String txt){
        System.out.print(txt);
    }
    public static boolean buscarCaracter(String texto, char caracter) {
        return texto.indexOf(caracter) != -1;
    }

    private static void println(String txt){
        System.out.println(txt);
    }


    public Matriz(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.array = new float[fila][columna];
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setArray(float[][] array) {
        this.array = array;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public float[][] getArray() {
        return array;
    }

    public void getValuesArray(){
        for (int f = 0; f< fila; f++){
            for (int c = 0; c < columna; c++){
                print(Float.toString(array[f][c])+" ");
            }
            println("");
        }
    }

    public void setValuesArray() throws IOException {
        println(" Ingresar los valores de la matriz");
        for (int f = 0; f< fila; f++){
            println(".___Valore de la fila ["+(f+1)+"]");
            for (int c = 0; c < columna; c++){
                print(" - Valor ["+f+"]["+c+"]: ");
                array[f][c] = Float.parseFloat(reader.readLine());
            }
        }
    }
    public float[][] SumaMatriz(float [][] array2){
        float [][] newArray = new float[this.fila][this.columna];
        for (int i=0 ; i<this.fila; i++) {
            for (int e=0; e<this.columna;e++){
                newArray[i][e] = this.array[i][e] + array2[i][e];
            }
        }
        return newArray;
    }

    public float[][] MultiplacionMatriz (float [][] array2){
        // falta implementar codigo para la multiplicacion
        float [][] newArray = new float[this.fila][this.columna];
        for (int i=0 ; i<this.fila; i++) {
            for (int e=0; e<this.columna;e++){
                newArray[i][e] = array[i][e] + array2[i][e];
            }
        }
        return newArray;
    }
}
