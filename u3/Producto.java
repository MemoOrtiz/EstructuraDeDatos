import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return clave == producto.clave && Double.compare(precio, producto.precio) == 0 && Objects.equals(descripcion, producto.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, descripcion, precio);
    }
}
