package clases.ArbolesNodos;

/**
 * Clase que representa una lista.
 **Lista (List)
*? - Estructura de datos lineal que almacena elementos secuencialmente.
*? - Permite acceso aleatorio a elementos mediante índices.
*? - Puede contener elementos duplicados.
*? - Operaciones comunes incluyen append (añadir al final), insert (insertar en una posición específica), remove (eliminar un elemento), y pop (eliminar y devolver el elemento en una posición).
*? - Utilizada para almacenar y manipular colecciones de elementos en un orden específico.
*? - Acceso eficiente a elementos a través de índices, pero la inserción y eliminación pueden ser menos eficientes en comparación con otras estructuras de datos, como las listas enlazadas.
 */
public class Lista {

    private Nodo inicio;
    private int tamano;

    /**
     * ! Constructor de la clase Lista.
     */
    public Lista() {
        this.inicio = null;
        this.tamano = 0;
    }

    /**
     * ! Verifica si la lista está vacía.
     * 
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     * ! Agrega un elemento al inicio de la lista.
     * 
     * @param valor Valor a agregar.
     */
    public void agregarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamano++;
    }

    /**
     * ! Elimina el elemento al inicio de la lista.
     */
    public void eliminarAlInicio() {
        if (!estaVacia()) {
            inicio = inicio.getSiguiente();
            tamano--;
        }
    }

    /**
     * ! Devuelve el tamaño de la lista.
     * 
     * @return Tamaño de la lista.
     */
    public int obtenerTamano() {
        return tamano;
    }

    /**
     * ! Imprime los elementos de la lista.
     */
    public void imprimirLista() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }

    /**
     * ! Función principal para probar la lista.
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregarAlInicio(3);
        lista.agregarAlInicio(5);
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(7);
        lista.agregarAlInicio(10);
        lista.imprimirLista();
        lista.eliminarAlInicio();
        lista.imprimirLista();
    }
}



