package u4.grafos;

import java.util.ArrayList;

public class Vertice <T>{
    private T vertice;
    private ArrayList<Arista<T>> aristas = new ArrayList<>();

    public Vertice(T vertice) {
        this.vertice = vertice;
    }

    public void addArista(Arista<T> arista){
        aristas.add(arista);
    }
    public int costo(int pos){
        return aristas.get(pos).getCosto();
    }

    public T getVertice() {
        return vertice;
    }

    public void setVertice(T vertice) {
        this.vertice = vertice;
    }

    public ArrayList<Arista<T>> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista<T>> aristas) {
        this.aristas = aristas;
    }
}
