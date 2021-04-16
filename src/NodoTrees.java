
public class NodoTrees {

    // Atributos

    private String key;
    private String traduccion1;
    private String traduccion2;

    private NodoTrees NodoIzquierda;
    private NodoTrees NodoDerecha;


    // Constructor
    public NodoTrees(String key, String traduccion1, String traduccion2) {

        this.key = key;
        this.traduccion1 = traduccion1;
        this.traduccion2 = traduccion2;

    }

    public void setNodoDerecha(NodoTrees nodo) {
        this.NodoDerecha = nodo;
    }

    public void setNodoIzquierda(NodoTrees nodo) {
        this.NodoIzquierda = nodo;
    }

    public NodoTrees getIzquierda() {
        return this.NodoIzquierda;
    }

    public NodoTrees getDerecha() {
        return this.NodoDerecha;
    }

    public String getKey() {
        return this.key;
    }

}
