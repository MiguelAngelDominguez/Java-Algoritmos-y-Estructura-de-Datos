package SegundaPractica;

import java.io.*;
import java.nio.file.*;

// Alumno : Dominguez Valentin Miguel Angel
public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void println (String texto){
        System.out.println(texto);
    }
    public static void print (String texto){
        System.out.print(texto);
    }

    public static int[] insertElement(int[] arr, int element, int position){
        int n = arr.length;
        int[] newArr = new int[n+1];
        for(int i=0; i < n+1; i++){
            if(i<position){
                newArr[i] = arr[i];
            }else if(i==position){
                newArr[i] = element;
            }else{
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    }

    public static void rrecorridoMatrix_1(String []Array){
        for (String elemnt: Array) {
            System.out.println("Elemento : "+elemnt);
        }
    }

    public static void rrecorridoMatrix_2(String [][]Array){
        for (String []fila: Array) {
            // Obtenemos cada fila del array bi-dimencional
            for (String elemnt: fila){
                // Imprimimos cada elemento de la fila
                System.out.print(elemnt+" ");
            }
            System.out.println("");
        }
    }

    public static String[] deleteElement(String[] arr, int position){
        int n = arr.length;
        String[] newArr = new String[n-1];
        for(int i=0; i < n-1; i++){
            if(i<position){
                newArr[i] = arr[i];
            }else{
                newArr[i] = arr[i+1];
            }
        }
        return newArr;
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String pathFileNotes = "./src/SegundaPractica/notas_estudiantes.txt";

    public static String [] bdCompleteAlumno;
    public static String[] bdNamesStudent;
    public static String[] bdNotesStudent;
    public static int[][] bdNotesStudentInt;
    public static int cntAlumnos=0;
    public static void main(String[] args){
        println("Bienvenido . . . ");
        println("Las Notas que se cargaron a la BD son hasta ahora :\n");
        try {
            // Lectura del Archivo
            FileReader aux = new FileReader(pathFileNotes);
            int l;
            String crgdAlumno = "";

            while ((l = aux.read())!=-1){
                crgdAlumno= crgdAlumno + String.valueOf((char)l);
                if ( String.valueOf((char)l).equals("\n")){
                    cntAlumnos++;
                }
            }
            println("Cantidad de alumnos : "+ cntAlumnos);
            aux.close();
            FileReader lector = new FileReader(pathFileNotes);
            bdCompleteAlumno = new String[cntAlumnos];
            bdNamesStudent = new String[cntAlumnos];
            bdNotesStudent = new String[cntAlumnos];
            int auxiArray = 0;
            while ((l = lector.read())!=-1){


                if ( String.valueOf((char)l).equals("\n") ){
                    int lenStrAlm = crgdAlumno.length()-1;
                    crgdAlumno = crgdAlumno.substring(0,lenStrAlm-1);

                    bdCompleteAlumno[auxiArray] = crgdAlumno;
                    println("- "+bdCompleteAlumno[auxiArray]);
                    int lenStrAlumno = crgdAlumno.length();
                    int indexNoteStr = crgdAlumno.indexOf("1");
                    String nameAlumno = crgdAlumno.substring(0,indexNoteStr);
                    bdNamesStudent[auxiArray] = nameAlumno;
                    String noteAlumno = crgdAlumno.substring(indexNoteStr,lenStrAlumno);
                    bdNotesStudent[auxiArray] = noteAlumno;
                    auxiArray ++;
                    crgdAlumno = "";
                }
                crgdAlumno= crgdAlumno + String.valueOf((char)l);

            }
            println("");
            lector.close();
            bdCompleteAlumno = deleteElement(bdCompleteAlumno,0);
            bdCompleteAlumno = deleteElement(bdNamesStudent,    0);
            bdNotesStudent = deleteElement(bdNotesStudent,0);
            rrecorridoMatrix_1(bdCompleteAlumno);
            println("---");
            rrecorridoMatrix_1(bdNamesStudent);
            rrecorridoMatrix_1(bdNotesStudent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}