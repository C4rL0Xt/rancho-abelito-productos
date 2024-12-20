package com.elranchoabelito.mcproductos.mapper;

import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;

public class SubcategoriaMapper {

    public static SubcategoriaDTO toSubcategoriaDTO(Subcategoria subcategoria) {
        SubcategoriaDTO subcategoriaDTO = new SubcategoriaDTO();
        subcategoriaDTO.setIdSubcategoria(subcategoria.getIdSubcategoria());
        subcategoriaDTO.setNombre(subcategoria.getNombre());

        return subcategoriaDTO;
    }
}
