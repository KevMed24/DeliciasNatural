package udla.kmedinaleon.inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;
    private double capacidadAlmacen;
    private double presupuesto;

    public Inventario(double capacidadAlmacen, double presupuesto) {
        this.productos = new ArrayList<>();
        this.capacidadAlmacen = capacidadAlmacen;
        this.presupuesto = presupuesto;
    }

    public void agregarProducto(Producto producto) {
        if (verificarEspacio(producto)) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("No hay suficiente espacio en el almacén para este producto.");
        }
    }

    public boolean verificarEspacio(Producto producto) {
        double espacioOcupado = productos.stream().mapToDouble(Producto::calcularEspacioOcupado).sum();
        return (espacioOcupado + producto.calcularEspacioOcupado()) <= capacidadAlmacen;
    }

    public void mostrarProductos() {
        System.out.println("Inventario:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

