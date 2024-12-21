package com.elranchoabelito.mcproductos.models.dtos;

public class SubcategoriaCardDTO {

    private Integer idSubcategoria;
    private String nombre;
    private String imageUrl;


    public SubcategoriaCardDTO() {

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
