package u4.grafos;

public class PruebaGrafo {
    public static void main(String[]args){
        Grafo<String> grafo = new GrafoDinamico<>();

        grafo.insVertice("F");  //0
        grafo.insVertice("L");  //1
        grafo.insVertice("B");  //2
        grafo.insVertice("P");  //3
        grafo.insVertice("M");  //4

        grafo.insArista(0, 1, 5);
        grafo.insArista(0, 3, 5);
        grafo.insArista(0, 4, 5);
        grafo.insArista(1, 2, 9);
        grafo.insArista(2, 0, 4);
        grafo.insArista(3, 4, 8);

        System.out.println(" "+ grafo.mostrar());

        /*
            Valores del grafo del video
        grafo.insVertice("A");
        grafo.insVertice("B");
        grafo.insVertice("C");
        grafo.insVertice("D");
        grafo.insVertice("E");

        grafo.insArista(0, 2, 12);
        grafo.insArista(0, 3, 60);
        grafo.insArista(1, 0, 10);
        grafo.insArista(2, 3, 32);
        grafo.insArista(2, 1, 20);
        grafo.insArista(4, 0, 7);*/
    }

}
