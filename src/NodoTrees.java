/**
 * @ author Sara Paguaga
 * @ reference https://www.baeldung.com/java-binary-tree
 */

import com.sun.jdi.Value;

import java.util.Map;

public class NodoTrees <K extends Comparable<K>, V extends Comparable<V>>  implements Comparable<NodoTrees<K, V>> , Map.Entry<K,V> {

    // Atributos

    private K key;
    private Value traduccion1;
    private Value traduccion2;

    private NodoTrees NodoIzquierda;
    private NodoTrees NodoDerecha;


    // Constructor
    public NodoTrees(K key, Value traduccion1, Value traduccion2) {

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

    public K getKey() {
        return key;
    }


    @Override
    public V getValue() {
        return null;
    }


    @Override
    public V setValue(V value) {
        return null;
    }


    @Override
    public int compareTo(NodoTrees<K, V> o) {
        return 0;
    }
}
