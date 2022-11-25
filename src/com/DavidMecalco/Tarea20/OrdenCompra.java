package com.DavidMecalco.Tarea20;

import java.util.Date;

public class OrdenCompra {

    private int identificador;
    private String description;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId;
    private int indiceProductos;

    public OrdenCompra(String description) {
        this.description = description;
        this.identificador = ++ultimoId;
        this. productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return description;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public int getGranTotal(){
        int total = 0;
        for (Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }

}
