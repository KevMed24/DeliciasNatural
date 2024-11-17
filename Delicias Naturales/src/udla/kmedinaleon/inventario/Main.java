package udla.kmedinaleon.inventario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear inventario con capacidad de 100 unidades y presupuesto de 1000
        Inventario inventario = new Inventario(100, 1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de inventarios de 'Delicias Naturales'.");

        while (true) {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Agregar Producto Perecedero");
            System.out.println("2. Agregar Producto No Perecedero");
            System.out.println("3. Mostrar Productos en el Inventario");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el ID del producto: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad disponible: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese la fecha de caducidad (YYYY-MM-DD): ");
                    String fechaCaducidad = scanner.nextLine();

                    ProductoPerecedero productoPerecedero = new ProductoPerecedero(id, nombre, precio, cantidad, fechaCaducidad);
                    inventario.agregarProducto(productoPerecedero);
                }
                case 2 -> {
                    System.out.print("Ingrese el ID del producto: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad disponible: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese la vida útil del producto (en meses): ");
                    int vidaUtil = scanner.nextInt();

                    ProductoNoPerecedero productoNoPerecedero = new ProductoNoPerecedero(id, nombre, precio, cantidad, vidaUtil);
                    inventario.agregarProducto(productoNoPerecedero);
                }
                case 3 -> {
                    inventario.mostrarProductos();
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema. ¡Gracias por usar nuestro software!");
                    scanner.close();
                    return;
                }
                default -> {
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            }
        }
    }
}

