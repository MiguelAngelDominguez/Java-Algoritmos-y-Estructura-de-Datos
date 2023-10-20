package SegundaPractica.Metodos;

public class Arrays {

    public static void print(String texto){
        System.out.print(texto);
    }

    public static void println(String texto){
        System.out.println(texto);
    }


    public static void rrecorridoMatrix_1(String []Array){
        for (String elemnt: Array) {
            System.out.println("Elemento : "+elemnt);
        }
    }

    public static void rrecorridoMatrix_2(String [][]Array){
        for (String []fila: Array) {
            // Obtenemos cada fila del array bi-dimencional
            for (String elemnt: fila){
                // Imprimimos cada elemento de la fila
                System.out.print(elemnt+" ");
            }
            System.out.println("");
        }
    }

    public static void rrecorridoMatrix_3(String [][][]Array){
        for (String [][] plano: Array) {
            // Obtenemos el array bi dimencional
            for (String []fila: plano) {
                // Obtenemos cada fila del array bi-dimencional
                for (String elemnt: fila){
                    // Imprimimos cada elemento de la fila
                    System.out.print(elemnt+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public static int menorInArray(int[] Array){
        int aux = Array[0];
        for (int number: Array) {
            if (number<aux){
                aux=number;
            }
        }
        return aux;
    }

    public static int mayorInArray(int[] Array){
        int aux = Array[0];
        for (int number: Array) {
            if (number>aux){
                aux=number;
            }
        }
        return aux;
    }
    /**
     * Este metodo implementa el algoritmo de ordenamiento de burbuja.
     * El algoritmo de ordenamiento de burbuja es un algoritmo de comparacion.
     * En este algoritmo, se compara cada elemento con el siguiente, y si el siguiente es menor, se intercambian.
     * Este proceso se repite hasta que no se necesiten mas intercambios.
     * @param arr El arreglo que se desea ordenar.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] ordenarArray(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertElement(int[] arr, int element, int position){
        int n = arr.length;
        int[] newArr = new int[n+1];
        for(int i=0; i < n+1; i++){
            if(i<position){
                newArr[i] = arr[i];
            }else if(i==position){
                newArr[i] = element;
            }else{
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    }

    public static int[] deleteElement(int[] arr, int position){
        int n = arr.length;
        int[] newArr = new int[n-1];
        for(int i=0; i < n-1; i++){
            if(i<position){
                newArr[i] = arr[i];
            }else{
                newArr[i] = arr[i+1];
            }
        }
        return newArr;
    }

    public static int[] deleteElementByValue(int[] arr, int value){
        int n = arr.length;
        int[] newArr = new int[n-1];
        int j = 0;
        for(int i=0; i < n; i++){
            if(arr[i] != value){
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }



    public static void main(String[] args) {
        System.out.println("Array unidimencional");
        String[] ArrayString_1 = {"a", "b", "c", "d", "z"};
        rrecorridoMatrix_1(ArrayString_1);

        System.out.println("Array bidimencional");
        String[][] ArrayString_2 = {{"a", "b", "c", "d", "z"}, {"1", "2", "3", "4", "5"}};
        rrecorridoMatrix_2(ArrayString_2);

        System.out.println("Array Tridemencional");
        String[][][] ArrayString_3 = {{{"a", "b", "c", "d", "z"}, {"1", "2", "3", "4", "5"}}, {{"a", "b", "c", "d", "z"}, {"1", "2", "3", "4", "5"}}, {{"a", "b", "c", "d", "z"}, {"1", "2", "3", "4", "5"}}};
        rrecorridoMatrix_3(ArrayString_3);

        println("Menor numero en un Array int");
        int[] numeros = {5, 3, 6, 7, 2, 1, 5};
        int menNumber = menorInArray(numeros);
        int mayNumber = mayorInArray(numeros);
        println("Menor Numero : "+menNumber);
        println("Mayor Numero : "+mayNumber);


    }
}
