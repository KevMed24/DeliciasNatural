package udla.kmedinaleon.inventario;

public class ProductoNoPerecedero extends Producto {
    private int vidaUtil; // En meses

    public ProductoNoPerecedero(String idProducto, String nombre, double precio, int cantidadDisponible, int vidaUtil) {
        super(idProducto, nombre, precio, cantidadDisponible);
        this.vidaUtil = vidaUtil;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    @Override
    public String toString() {
        return super.toString() + ", vidaUtil=" + vidaUtil + " meses";
    }
}