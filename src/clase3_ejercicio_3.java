import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase3_ejercicio_5 {
    static int major = 0;
    public static int majorNumberArray( int [][] array){

        for (int []fila: array) {
            for (int elemnt: fila) {
                if (elemnt>major){
                    major = elemnt;
                }
            }

        }
        return major;
    }
    public static void main (String[] args) throws IOException{
        int [][] arrayTest = {{1,2,3,8,4,2,2,5},{1,2,3,2,4,2,1,1}};
        int nmbMajor = majorNumberArray(arrayTest);
        System.out.println(nmbMajor);
    }
}
