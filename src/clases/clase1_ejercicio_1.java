import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class clase1_ejercicio_1 {
    public static String VerificateSigno( int numero){
        if (numero > 0) return "Mayor";
        return "Menor";
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un Numero: ");
        int numero = Integer.parseInt(reader.readLine());
        String vrf;
        if (numero == 0) vrf= "Nulo";
        else vrf = VerificateSigno(numero);
        System.out.println("el numero "+ numero + " es "+vrf);
    }
}
