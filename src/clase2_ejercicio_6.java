public class clase2_ejercicio_6 {
    static String[][] puntos = {
            {" ", "°", " "},
            {" ", "°", " "},
            {" ", " ", " "}
    };
    static String[][] cero = {
            {" ", "_", " "},
            {"|", " ", "|"},
            {"|", "_", "|"}
    };
    static String[][] uno = {
            {" ", "|", " "},
            {" ", "|", " "},
            {" ", "|", " "}
    };
    static String[][] dos = {
            {" ", "_", " "},
            {" ", " ", "|"},
            {" ", "/", "_"}
    };
    static String[][] tres = {
            {" ", "_", " "},
            {" ", "_", "|"},
            {" ", "_", "|"}
    };

    public static void printNumberCMD(String [][] nmb){
        for (String [] crt: nmb) {
            for (String c: crt) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    public static void print(String txt){
        System.out.print(txt);
    }

    public static void println(String txt){
        System.out.println(txt);
    }

    public static void main (String[] args){
        println("________.Test de Impresion.________");
        println("  .___ Numero por separado ___.");
        printNumberCMD(cero);
        printNumberCMD(uno);
        printNumberCMD(puntos);
        printNumberCMD(dos);
        printNumberCMD(tres);
        println("________.Test de Imprecion._______");

        String [][] cadenaDeHora = new String[30][3];
        String [][][] arrayNumeros = {
                cero, uno, puntos, dos, cero, puntos, uno, tres
        };
        for (){
            
        }
        printNumberCMD(cadenaDeHora);
    }
}
