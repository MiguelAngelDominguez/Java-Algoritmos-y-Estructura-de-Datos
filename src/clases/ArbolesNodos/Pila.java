package clases.ArbolesNodos;

/**
 * Clase que representa una pila.

** Características:

*? - La única forma de acceder a los elementos es desde el tope de la pila.
*? - Su administración es muy sencilla ya que tiene pocas operaciones.
*? - Si la pila esta vacía no tiene sentido referirse a un tope ni a un fondo.
*? - En caso de querer acceder a un elemento que nos e encuentre en el tope de
*?    la pila se debe realizar un volcado de la pila a una pila auxiliar, una 
*?    vez realizada la operación con el elemento se vuelve a volcar los elementos 
*?    de la pila auxiliar a la original.

 */
public class Pila {

    private int tamano;
    private int cima;
    private int[] elementos;

    /**
     * ! Constructor de la clase Pila.
     * 
     * @param tamano Tamaño máximo de la pila.
     */
    public Pila(int tamano) {
        this.tamano = tamano;
        this.elementos = new int[tamano];
        this.cima = -1;
    }

    /**
     * ! Verifica si la pila está vacía.
     * 
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return (cima == -1);
    }

    /**
     * ! Verifica si la pila está llena.
     * 
     * @return true si la pila está llena, false en caso contrario.
     */
    public boolean estaLlena() {
        return (cima == tamano - 1);
    }

    /** 
     * ! Agrega un elemento a la pila.
     * 
     * @param elemento Elemento a agregar.
     */

    public void push(int elemento) {
        if (!estaLlena()) {
            elementos[++cima] = elemento;
        } else {
            System.out.println("La pila está llena");
        }
    }

    /**
     * ! Elimina y devuelve el elemento en la cima de la pila.
     * 
     * @return Elemento en la cima de la pila.
     */
    public int pop() {
        if (!estaVacia()) {
            return elementos[cima--];
        } else {
            System.out.println("La pila está vacía");
            return -1;
        }
    }

    /**
     * ! Devuelve el elemento en la cima de la pila sin eliminarlo.
     * 
     * @return Elemento en la cima de la pila.
     */
    public int peek() {
        if (!estaVacia()) {
            return elementos[cima];
        } else {
            System.out.println("La pila está vacía");
            return -1;
        }
    }

    /**
     * ! Busca un valor en la pila.
     * 
     * @param valor Valor a buscar.
     * @return true si el elemento a buscar existe en la pila, false en caso contrario.
     */
    public boolean buscar(int valor) {
        for (int i = 0; i <= cima; i++) {
            if (elementos[i] == valor) {
                return true;
            }
        }
        return false;
    }

    /**
     * ! Elimina todos los elementos de la pila.
     */
    public void vaciar() {
        cima = -1;
    }

    /**
     * ! Imprime en pantalla los elementos de la pila.
     */
    public void imprimir() {
        for (int i = cima; i >= 0; i--) {
            System. out.println(elementos[i]);
        }
    }

    /**
     * ! Método main para probar la funcionalidad de la pila.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Buscando elemento 3 en la pila: " + pila.buscar(3));
        System.out.println("Imprimiendo pila:");
        pila.imprimir();
        System.out.println("Sacando elementos de la pila:");
        // ! Una forma de Eliminar Pila
        while (!pila.estaVacia()) {
            System.out.println(pila.pop());
        }
        // ! Otra forma de Eliminar Pila
        pila.vaciar();

        System.out.println("Imprimiendo pila eliminada :");
        pila.imprimir();

    }
}
