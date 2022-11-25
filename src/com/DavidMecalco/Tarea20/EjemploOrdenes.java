package com.DavidMecalco.Tarea20;
import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compras componentes pc");
        orden1.setCliente(new Cliente("Andres", "Guzman"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Western Digital", "Unidad SSD 480GB", 54890));
        orden1.addProducto(new Producto("MSI", "Monitor Optix G271", 363940));
        orden1.addProducto(new Producto("AMD", "Procesador AMD Ryzen 9 5900X", 599990));
        orden1.addProducto(new Producto("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1849990));

        OrdenCompra orden2 = new OrdenCompra("Compras Electrodomésticos");
        orden2.setCliente(new Cliente("John", "Doe"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Fensa", "Cocina", 239990));
        orden2.addProducto(new Producto("Samsung", "Refrigerador", 429990));
        orden2.addProducto(new Producto("Midea", "Lavadora", 149990));
        orden2.addProducto(new Producto("Aspiradora", "IRobot", 199990));

        OrdenCompra orden3 = new OrdenCompra("Compras materiales de construcción");
        orden3.setCliente(new Cliente("Pepa", "Roe"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Melon", "Cemento 25kg", 4870));
        orden3.addProducto(new Producto("Grau", "Hormigon", 6040));
        orden3.addProducto(new Producto("Ceramicas Santiago", "Ladrillo", 790));
        orden3.addProducto(new Producto("Redline", "Escala articulada aluminio", 48990));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }


    }
}
