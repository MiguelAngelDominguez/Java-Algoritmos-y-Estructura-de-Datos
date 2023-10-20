package SegundaPractica.Metodos;

import java.io.*;
import java.nio.file.*;

public class Archivos {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void println (String texto){
        System.out.println(texto);
    }
    public static void print (String texto){
        System.out.print(texto);
    }

    public static  void manejoArch(){

        String pathFile = "miarchivo.txt";

        /*
        Manejo y modificacion de archivos

        Primer Metodo
         */

        // Escritura del Archivo
        try {
            FileWriter Escritor = new FileWriter(pathFile);
            println("Ingrese el texto a agregar al archivo : ");
            String newContent = reader.readLine();
            Escritor.write(newContent);
            Escritor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Lectura del Archivo
        try {
            // Lectura del Archivo
            FileReader lector = new FileReader(pathFile);
            int l;
            while ((l = lector.read())!=-1){
                System.out.print((char)l);
            }
            println("");
            lector.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Segundo Metodo
        //Escritura
        try{
            println("Ingrese el texto a agregar al archivo : ");
            String newContent = reader.readLine();
            Files.write(Paths.get(pathFile),newContent.getBytes());
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Lectura
        try{
            String texto = new String(Files.readAllBytes(Paths.get(pathFile)));
            println(texto);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        String pathFile = "miarchivo.txt";

        // Verificar si el archivo existe, se puede leer o escribir
        File pathArchivo = new File("./src/SegundaPractica/Metodos/miarchivo.txt");
        println("El archivo existe : "+pathArchivo.exists());
        println("Se puede leer ?  : "+pathArchivo.canRead());
        println("Se puede escribir ? : "+pathArchivo.canWrite());


        // Verificar si una ruta existe, se puede leer o escribir
        File pathdir = new File("D:\\APRENDIENDO PROGRAMACION\\Java - Algoritmos y Estructura de Datos\\src\\SegundaPractica\\Metodos");
        println("El archivo existe : "+pathdir.exists());
        println("Se puede leer ?  : "+pathdir.canRead());
        println("Se puede escribir ? : "+pathdir.canWrite());

        // Crear directorios
        File pathdir2 = new File("./src/SegundaPractica/Metodos/newDir");
        boolean crearDir = pathdir2.mkdir();
        println("El directorio: "+pathdir2+" -> "+crearDir);
    }
}
