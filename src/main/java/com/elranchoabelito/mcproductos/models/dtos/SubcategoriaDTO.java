package com.elranchoabelito.mcproductos.models.dtos;

public class SubcategoriaDTO {
    private Integer idSubcategoria;
    private String nombre;


    public SubcategoriaDTO() {

    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
