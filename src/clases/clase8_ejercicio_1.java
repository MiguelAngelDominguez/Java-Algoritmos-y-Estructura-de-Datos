package clases;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase8_ejercicio_1 {
    protected static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String nameFile(String pathF){
        int i = pathF.lastIndexOf('/');
        //print(pathF[]);
        return "none";
    }

    public static void print(String txt){
        System.out.print(txt);
    }
    public static void println(String txt){
        System.out.println(txt);
    }
    public static void interfaz (String pathFile){
        System.out.println("|.___</"+pathFile+">___.. .  .    .");

    }
    public static void main(String[] args) throws IOException {
        print(" - Ingrese ubicacion del archivo: ");
        String filePath = reader.readLine();
        String menu = """
                .@---</"""+ nameFile(filePath)+">----"+
                """
                1.Visualizar
                2.Editar
                3.Sobre escribir
                4.Borrar
                5.Salir
                .________________________
                Elija una OPC: 
                """;;
        println(menu);
        String opcionMenu = reader.readLine();

    }
}

