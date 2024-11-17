package udla.kmedinaleon.inventario;

public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto(String idProducto, String nombre, double precio, int cantidadDisponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidad) {
        this.cantidadDisponible = cantidad;
    }

    public double calcularEspacioOcupado() {
        return cantidadDisponible * 0.5; // Ejemplo: Cada producto ocupa 0.5 unidades de espacio
    }

    @Override
    public String toString() {
        return "Producto{id=" + idProducto + ", nombre=" + nombre + ", precio=" + precio +
                ", cantidad=" + cantidadDisponible + "}";
    }
}
