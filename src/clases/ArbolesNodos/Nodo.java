package clases.ArbolesNodos;

/**
 * Clase que representa un nodo.
 */
public class Nodo {

    private int valor;
    private Nodo izquierdo;
    private Nodo derecho;
    private Nodo siguiente;

    /**
     * Constructor que inicializa el valor del nodo.
     * @param valor El valor del nodo.
     */
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    /**
     * Obtiene el valor del nodo.
     * @return El valor del nodo.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece el siguiente nodo.
     * @param siguiente El siguiente nodo.
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el siguiente nodo.
     * @return El siguiente nodo.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    /**
     * Establece el nodo izquierdo.
     * @param izquierdo El nodo izquierdo.
     */
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * Obtiene el nodo izquierdo.
     * @return El nodo izquierdo.
     */
    public Nodo getIzquierdo() {
        return izquierdo;
    }

    /**
     * Establece el nodo derecho.
     * @param derecho El nodo derecho.
     */
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    /**
     * Obtiene el nodo derecho.
     * @return El nodo derecho.
     */
    public Nodo getDerecho() {
        return derecho;
    }
    
    /**
     * Función principal para probar el nodo.
     */
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(3);
        Nodo nodo2 = new Nodo(5);
        Nodo nodo3 = new Nodo(7);
        
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        
        System.out.println("Valor del nodo 1: " + nodo1.getValor());
        System.out.println("Valor del nodo 2: " + nodo1.getSiguiente().getValor());
        System.out.println("Valor del nodo 3: " + nodo1.getSiguiente().getSiguiente().getValor());
    }
}