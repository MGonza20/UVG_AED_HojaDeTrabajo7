
public class TreesMain {

    private NodoTrees principal;

    public void add(NodoTrees nodo){

        if (principal == null){
            this.principal = nodo;
            return;
        }

        int valor = principal.getKey().compareTo(nodo.getKey()); // -1 0 1

        if (valor < 0){
            if (principal.getIzquierda() == null){
                this.principal.setNodoIzquierda(nodo);
            }else{

                add(nodo);
            }

        }else if (valor > 0){
            this.principal.setNodoDerecha(nodo);
        }
    }


}
