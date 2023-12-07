package clases.ArbolesNodos;

    /**
     * Clase que representa un árbol.
     */
    public class Arbol {
    
        private Nodo raiz;
        
        /**
         * Constructor por defecto para un árbol vacío.
         */
        public Arbol() {
            this.raiz = null;
        }
        
        /**
         * Inserta un nuevo nodo en el árbol.
         * 
         * @param valor El valor del nodo a insertar.
         */
        public void insertar(int valor) {
            this.raiz = insertarRecursivo(this.raiz, valor);
        }
        
        private Nodo insertarRecursivo(Nodo actual, int valor) {
            if (actual == null) {
                return new Nodo(valor);
            }
            if (valor < actual.getValor()) {
                actual.setIzquierdo(insertarRecursivo(actual.getIzquierdo(), valor));
            } else if (valor > actual.getValor()) {
                actual.setDerecho(insertarRecursivo(actual.getDerecho(), valor));
            } else {
                // El nodo ya existe
                return actual;
            }
            return actual;
        }
        
        /**
         * Realiza un recorrido en orden del árbol e imprime los valores de los nodos.
         */
        public void imprimirInOrden() {
            imprimirInOrdenRecursivo(this.raiz);
        }
        
        private void imprimirInOrdenRecursivo(Nodo nodo) {
            if (nodo != null) {
                imprimirInOrdenRecursivo(nodo.getIzquierdo());
                System.out.print(nodo.getValor() + " ");
                imprimirInOrdenRecursivo(nodo.getDerecho());
            }
        }

        /**
         * Grafica el árbol en consola con flechas.
         */
        public void graficarArbol() {
            graficarArbolRecursivo(this.raiz, "");
        }
        
        private void graficarArbolRecursivo(Nodo nodo, String prefijo) {
            if (nodo != null) {
                System.out.println(prefijo + "└── " + nodo.getValor());
                graficarArbolRecursivo(nodo.getDerecho(), prefijo + "    ");
                graficarArbolRecursivo(nodo.getIzquierdo(), prefijo + "    ");
            }
        }
        
        /**
         * Función principal para probar el árbol.
         */
        public static void main(String[] args) {
            Arbol arbol = new Arbol();
            arbol.insertar(3);
            arbol.insertar(5);
            arbol.insertar(2);
            arbol.insertar(4);
            arbol.insertar(6);
            arbol.imprimirInOrden();
            System.out.println("");
            arbol.graficarArbol();
        }
    }
