package u4.grafos;

import java.util.ArrayList;

public interface Grafo<E> {
    void insVertice (E x);
    E obtVertice(int pos);
    void insArista(int vi, int vf, int costo);
    int costoArista(int vi, int vt);
    int orden();
    ArrayList<E> sucesores (int pos);
    String mostrar();
    int inf = 99999;


}
