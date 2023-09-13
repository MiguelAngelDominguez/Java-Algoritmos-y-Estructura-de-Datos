import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class clase2_ejercicio_3 {
    public static void main(String[] args) throws IOException{
        while(true){
            for (int h=0; h <24; h++){
                System.out.println("se cumplio horas");
                for (int m=0; m<60; m++){
                    System.out.println("se cumplio minuto");
                    for (int s=0; s<60; s++){
                        System.out.println(h+":"+m+":"+s);
                    }
                }
            }
        }
        // falta implementar un pequeño delay para simular con exito un reloj
    }
}
