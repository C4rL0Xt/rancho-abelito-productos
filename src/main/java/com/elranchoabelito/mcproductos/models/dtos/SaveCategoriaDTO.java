package com.elranchoabelito.mcproductos.models.dtos;

public class SaveCategoriaDTO {

    private Integer idCategoria;
    private String nombre;

    public SaveCategoriaDTO() {
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
