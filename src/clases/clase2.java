import java.io.IOException;

public class clase2 {
    public static void main(String[] args) throws IOException{
        // Estrutura

        // While .- esta estructura nos permite ejecuar una porcion de codigo, solo si se cumple la condicion, condicion is equals true
        int indice_1 = 0;
        while (indice_1 < 8){
            System.out.println("Numero : "+ indice_1);
            indice_1 ++;
        }
        // Do - While .- la estructa repetitiva que se ejecuta por lo menoz una vez, para despues verificar si la concion sea verdadera
        int indice_2 = 5;
        do {
            System.out.println("Numero : "+ indice_2);
        }while(indice_2 <3);
        // For .- Esta estructura repetitiva, tienes parametros inicializacion de variable, limitante y (decremente o adcioon a la variable iniciada)
        // en cada iteracion se verifica la condicion y se ejecuta el decremneto o la adicion

        for (int e = 0; e< 12; e++){
            System.out.println("Numero : "+ indice_1);
        }

        // Foreach .- La estructura repetitiva foreach es una forma simple de recorrer un arreglo o una coleccion
        // Se utiliza para iterar en cada elemento del array
        // muy parecido al for, pero con una sintaxis simplificada

        int [] numeros = {1,2,3,4,5};
        for (int num : numeros){
            System.out.println(num);
        }

    }
}
