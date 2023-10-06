package clases;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase2_ejercicio_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cntNOta = 0 ;
        float promedioNotas = 0;
        String  nota = "0";
        while ( cntNOta<=7 ){
            do {
                try{
                    System.out.print(" - Ingrese una Nota: ");
                    nota = reader.readLine();
                    Integer.parseInt(nota);
                    System.out.println(nota);
                    if (nota.equals("")){
                        System.out.println("No se ingreso la nota ");
                    }
                }catch (Exception e){
                    nota="";
                    System.out.println("La nota ingresa no es un numero");
                }
            }while (nota.equals(""));
            promedioNotas  += Integer.parseInt(nota);
            cntNOta++;
        }

        System.out.println(promedioNotas/7);

    }
}
