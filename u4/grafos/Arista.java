package u4.grafos;

public class Arista<T> {
    private T sucesor;
    private int costo;

    public Arista(T sucesor, int costo) {
        this.sucesor = sucesor;
        this.costo = costo;
    }

    public T getSucesor() {
        return sucesor;
    }

    public void setSucesor(T sucesor) {
        this.sucesor = sucesor;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
