package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class clase5 {
    public static void main(String[] args) throws IOException {
        // Lectura de Archivos de Texto

        // Al menejar este tipo de archivos, pedemos menejar tipo de datos bits.

        // COMO MANEJAR UN ARCHIVO ?

        // 1. Para abrir un archivo se necesita la ruta-PATH
        // 2. para despues necesitamos comprobar que el archivo exista

        File miArchivo = new File("H:\\Programacion\\Java-Algoritmos-y-Estructura-de-Datos\\src\\clases\\Main.java");
        System.out.println("EL archivo Existe : "+miArchivo.exists());
        File dir = new File("H:/RESPALDO");
        System.out.println("El archivo Existe : "+dir.exists());

        // Algoritmo para crear directorio
        String path = "miTestDir";
        File dir_2 = new File("H:/"+path);
        dir_2.mkdir();

        // Algortitmo para crear y agregar texto a un archivok
        FileWriter fichero = new FileWriter("H:/"+path+"/miFichero.py");
        for(int i=0; i<10 ;i++){
            fichero.write("print('hola mundo "+i+"')\n");
        }
        fichero.close();
        try {
            String ruta = "H:/miTestDir";
            Path fuentes = Paths.get(ruta);
            Path destino = Paths.get("H:/");
            Files.copy(fuentes,destino, StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
