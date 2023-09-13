import java.io.IOException;

public class clase2_ejercicio_3 {
    public static void main(String[] args) throws IOException{
        while(true){
            for (int h=0; h <24; h++){
                System.out.println("se cumplio horas");
                for (int m=0; m<60; m++){
                    System.out.println("se cumplio minuto");
                    for (int s=0; s<60; s++){
                        try {
                            //
                            Thread.sleep(1000);
                            System.out.println(h+":"+m+":"+s);
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                    }
                }
            }
        }
    }
}
