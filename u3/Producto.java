public class Producto {
    private int clave;
    private String descripcion;
    private double precio;

    public Producto(int clave, String descripcion, double precio) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "clave=" + clave +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
