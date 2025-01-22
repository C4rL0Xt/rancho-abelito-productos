package com.elranchoabelito.mcproductos.models.dtos;


import java.math.BigDecimal;

public class ProductoCardDTO {
    private Integer idProducto;
    private Integer idSubcategoria;
    private  String nombre;
    private String descripcion;
    private BigDecimal precio;
    private String imageUrl;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return imageUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imageUrl = imagenUrl;
    }

    public ProductoCardDTO() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

}
