import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class clase1_ejercicio_2 {
    public static boolean esMayuscula(String s) {
        return s.equals(s.toUpperCase());
    }

    public static boolean esMinuscula(String s) {
        return s.equals(s.toLowerCase());
    }

    public static  boolean esNumero( String n){
        try{
            int nuevoInt = Integer.getInteger(n);
            return true;
        }catch(Exception e ){
            return false;
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ingrese un letra: ");
        String letra = reader.readLine();
        System.out.println("Es minuscula? "+esMinuscula(letra));
        System.out.println("Es mayuscula? " + esMayuscula(letra));
        System.out.print("ingrese un Numero: ");
        String numero = reader.readLine();
    }
}
