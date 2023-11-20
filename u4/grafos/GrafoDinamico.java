package u4.grafos;

import java.util.ArrayList;

public class GrafoDinamico <E> implements Grafo <E>{

    private ArrayList<Vertice<E>> vertices = new ArrayList<>();
    public void insVertice(E x){
        vertices.add(new Vertice<>(x));
    }
    public E obtVertice(int pos){
        for(int i = 0 ; i < vertices.size() ; i++){
            Vertice<E> get = vertices.get(i);
            if(pos ==i){
                return vertices.get(i).getVertice();
            }
        }return null;
    }

    @Override
    public void insArista(int vi, int vf, int costo) {
        vertices.get(vi).addArista(new Arista<>(obtVertice(vf),costo));
    }

    @Override
    public int costoArista(int vi, int vf) {
        Vertice ver = vertices.get(vi);
        ArrayList<Arista<E>> aristas = ver.getAristas();
        for(int j = 0; j < aristas.size() ; j++ ){
            Arista<E> aris = aristas.get(j);
            if(aris.getSucesor().equals(obtVertice(vf))){
                return aris.getCosto();
            }
        }
        return -1;
    }

    @Override
    public int orden() {
        return vertices.size();
    }

    @Override
    public ArrayList<E> sucesores(int pos) {
        ArrayList<E>suce = new ArrayList<>();
        Vertice<E> verti = vertices.get(pos);
        ArrayList<Arista<E>> aristas = verti.getAristas();
        for (int i = 0; i < aristas.size() ; i++){
            suce.add(aristas.get(i).getSucesor());
        }
        return suce;
    }

    @Override
    public String mostrar() {
        String mos = "";
        for(Vertice<E> vertice : vertices){
            mos += " "+ vertice.getVertice();
            ArrayList<Arista<E>> aristas = vertice.getAristas();
            for (Arista<E> arista: aristas){
                mos += " "+ arista.getSucesor() + " "+ arista.getCosto();
            }
            mos+= "\n";
        }
        return mos;
    }

}
