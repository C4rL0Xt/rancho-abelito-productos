package com.elranchoabelito.mcproductos.mapper;

import com.elranchoabelito.mcproductos.models.dtos.SaveCategoriaDTO;
import com.elranchoabelito.mcproductos.models.dtos.SaveSubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Categoria;

public class CategoriaMapper {


    public static Categoria toCategoryEntity(SaveCategoriaDTO saveCategoriaDTO) {

        Categoria categoria = new Categoria();
        categoria.setNombre(saveCategoriaDTO.getNombre());
        categoria.setIdCategoria(saveCategoriaDTO.getIdCategoria());

        return categoria;
    }
}
