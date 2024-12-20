package com.elranchoabelito.mcproductos.models.dtos;

import java.math.BigDecimal;

public class ProductoMeseroDTO {

    private int idProducto;
    private String nombre;
    private SubcategoriaDTO subcategoria;
    private Integer stock;
    private BigDecimal precio;

    public ProductoMeseroDTO() {

    }


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SubcategoriaDTO getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubcategoriaDTO subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
