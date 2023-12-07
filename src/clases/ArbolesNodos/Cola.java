package clases.ArbolesNodos;

/**
** Cola (Queue):
*? - Estructura de datos lineal.
*? - Sigue el principio FIFO (First In, First Out).
*? - El primer elemento añadido es el primero en ser eliminado.
*? - Operaciones principales: enqueue (añadir un elemento) y dequeue (eliminar el elemento frontal).
*? - Puede incluir operaciones adicionales como front (obtener el 
*?      elemento frontal sin eliminarlo) y isEmpty (verificar si la cola está vacía).
*? - Utilizada para gestionar elementos en un orden específico, como tareas en una línea de espera.
 */

public class Cola {

    private Nodo inicio;
    private Nodo fin;

    /**
     * ! Constructor de la clase Cola.
     */
    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    /**
     * ! Verifica si la cola está vacía.
     * 
     * @return true si la cola está vacía, false si no.
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     * ! Agrega un valor al final de la cola.
     * 
     * @param valor El valor a agregar.
     */
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }

    /**
     * ! Elimina el valor al inicio de la cola.
     */
    public void eliminar() {
        if (!estaVacia()) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        }
    }

    /**
     * ! Imprime todos los valores de la cola.
     */
    public void imprimir() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    /**
     * ! Muestra el primer elemento de la cola, sin extraerlo.
     * 
     * @return El valor del primer elemento de la cola.
     */
    public int verPrimero() {
        if (!estaVacia()) {
            return inicio.getValor();
        } else {
            throw new IllegalStateException("La cola está vacía");
        }
    }

    /**
     * ! Muestra el último elemento de la cola, sin extraerlo.
     * 
     * @return El valor del último elemento de la cola.
     */
    public int verUltimo() {
        if (!estaVacia()) {
            return fin.getValor();
        } else {
            throw new IllegalStateException("La cola está vacía");
        }
    }

    /**
     * ! Destructor de la cola, elimina todos los elementos.
     */
    public void destruir() {
        inicio = null;
        fin = null;
        System.out.println("Se destruyo la cola");
    }

    /**
     * ! Función principal para probar la cola.
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.agregar(5);
        cola.agregar(10);
        cola.agregar(2);
        cola.agregar(7);
        cola.imprimir();
        cola.eliminar();
        cola.imprimir();
        System.out.println("Primer elemento de la cola: " + cola.verPrimero());
        System.out.println("Último elemento de la cola: " + cola.verUltimo());
        cola.destruir();
    }
}
