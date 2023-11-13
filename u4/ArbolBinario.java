package u4;

public class ArbolBinario<E> {
    //atributos
    protected  E raiz;
    protected ArbolBinario<E> izq;
    protected  ArbolBinario<E>der;
    //crear un arbol binario con sus 3 parametros
    public ArbolBinario(E raiz, ArbolBinario<E>izq, ArbolBinario<E>der){
        this.raiz = raiz;
        this.izq = izq;
        this.der = der;
    }
    //crear un arbol binario vacio
    public ArbolBinario(){
        this(null,null,null);
    }

    //crear arbol binario-hoja
    public ArbolBinario(E raiz){
     this(raiz,new ArbolBinario<>(),new ArbolBinario<>());
    }

    public E getRaiz() {
        return raiz;
    }

    public ArbolBinario<E> getIzq() {
        return izq;
    }

    public ArbolBinario<E> getDer() {
        return der;
    }

    public boolean isVacio(){
        return raiz == null && izq == null && der == null;
    }
    public  void  vaciar(){
        raiz = null;
        izq = null;
        der = null;
    }
    public boolean isHoja(){
        return izq.isVacio() && der.isVacio();
    }
    //es un adaptador
    public void recorridoEnProfundidad(PrePostVisitor<E> visitor){
        if (!isVacio()){
            visitor.preVisit(raiz);
            izq.recorridoEnProfundidad(visitor);
            visitor.inVisit(raiz);
            der.recorridoEnProfundidad(visitor);
            visitor.postVisit(raiz);

        }
    }
}
