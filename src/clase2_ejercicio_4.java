import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class clase2_ejercicio_4 {
    // 1 1 2 3 5 8 13 21 34
    static int ini = 1;
    public static void fiboNacci(int e, int j){
        System.out.print(ini+" ");
        ini = e;
        e = ini + e;
        if(j==0){
            return;
        }
        j--;
        fiboNacci(e,j);
    }
    public static void main(String[] args) throws IOException{
        fiboNacci(ini,12);
    }
}
