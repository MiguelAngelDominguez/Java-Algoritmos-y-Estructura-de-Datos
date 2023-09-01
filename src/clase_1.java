public class clase_1 {
    public static void main(String[] args){
        /*
          1 Arreglos
          - estructura de datos que almacenan un solo tipo dato
          - estos tipos de datos son de tamalo fijo
          - los arreglos pueden ser desde un arreglo unidimencional, hasta multidimencional
            [ 2: 4]

         */
        int [] notas;
        notas = new int[2];
        notas[0] = 2;
        System.out.print(notas[0]);
        System.out.println("\n");

        //    Tambien podemos declara e inicializar los valores
        int[] Array = {1, 2, 3, 4, 5};

        //   Tambien podemos primero declarar y despues inicializar los valores del array
        int[] miArray = new int[5];
        int valorInicial = 10;

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = valorInicial;
            valorInicial++;
            System.out.println(miArray[i]);
        }



        /*
          2 Listas Enlazadas
          - similar al array
          - no hay la necesida de saber cuantos elemenot tendra la lista
          - contiene un punturo o enlace
          - permite insertar y eliminar de nodos en cualquier punto de la lista
          - cada elemento apunta al siguiente

         */
        /*
          3 Pilas
          - como su nombre dice, es un tipo de dato que apila los datos ingresados
          - solo se puede apilar o despilar, en otras palabras solo se puede elelminar o insertar en la cima de la lista
          - el ultimo elemento ingresado es el ultimo en salir
         */
        /*
          4 Arboles Binarios
          - es una nuev clase de nodos, donde cada uno contiene un item o un valor
          - cada nodo tiene 0 a 2 hijos
          - Se conoce el nodo de la izquierda como hijo izquierdo y el nodo de la derecha como hijo derecho
         */
        System.out.print("Hola mundo");

        /*
          Aprender declaracion de variables, " Scope "
        */
    }
}
