package udla.kmedinaleon.inventario;

public class ProductoPerecedero extends Producto {
    private String fechaCaducidad;

    public ProductoPerecedero(String idProducto, String nombre, double precio, int cantidadDisponible, String fechaCaducidad) {
        super(idProducto, nombre, precio, cantidadDisponible);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public boolean verificarCaducidad() {
        // Lógica para comprobar si está caducado (aquí un ejemplo básico)
        return fechaCaducidad.compareTo("2024-11-17") < 0; // Fecha actual como ejemplo
    }

    @Override
    public String toString() {
        return super.toString() + ", fechaCaducidad=" + fechaCaducidad;
    }
}
