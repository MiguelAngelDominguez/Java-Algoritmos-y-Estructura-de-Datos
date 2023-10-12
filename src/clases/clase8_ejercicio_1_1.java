package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class clase8_ejercicio_1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter writer = new PrintWriter(archivo);

            System.out.println("Editor de texto - Escriba 'salir' para terminar");

            String linea;
            do {
                linea = scanner.nextLine();
                writer.println(linea);
            } while (!linea.equalsIgnoreCase("salir"));

            writer.close();
            System.out.println("Archivo guardado exitosamente.");
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo: " + e.getMessage());
        }
    }
}
