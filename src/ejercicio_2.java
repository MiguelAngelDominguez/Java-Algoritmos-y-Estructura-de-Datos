import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio_2 {

    public static String verficarCrt( String s){
        return esNumero(s);
    }

    public static  String esNumero( String n){
        try{
            int nuevoInt = Integer.parseInt(n);
            return "un Numero";
        }catch(Exception e ){
            return esMayuscula(n);
        }

    }
    public static String esMayuscula(String s) {
        if (s.equals(s.toUpperCase())) {
            return "una Letra Mayuscula";
        }
        return esMinuscula(s);
    }

    public static String esMinuscula(String s) {
        if (s.equals(s.toLowerCase())){
            return "una Letra Minuscula";
        }
        return "";
    }


    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ingrese un caracter: ");
        String crt = reader.readLine();

        try{
            String valorCrt = verficarCrt(crt);
            System.out.println("El caracter ingresado es "+valorCrt);

        }catch (Exception e){
            System.out.println("El caracter ingresado es desconocido");
        }

    }
}
