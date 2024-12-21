package com.elranchoabelito.mcproductos.mapper;

import com.elranchoabelito.mcproductos.models.dtos.CreateSubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaCardDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;

public class SubcategoriaMapper {

    public static SubcategoriaDTO toSubcategoriaDTO(Subcategoria subcategoria) {
        SubcategoriaDTO subcategoriaDTO = new SubcategoriaDTO();
        subcategoriaDTO.setIdSubcategoria(subcategoria.getIdSubcategoria());
        subcategoriaDTO.setNombre(subcategoria.getNombre());

        return subcategoriaDTO;
    }


    public static SubcategoriaCardDTO subcategoriaCardDTO(Subcategoria subcategoria) {
        SubcategoriaCardDTO cardDTO = new SubcategoriaCardDTO();
        cardDTO.setIdSubcategoria(subcategoria.getIdSubcategoria());
        cardDTO.setNombre(subcategoria.getNombre());
        cardDTO.setImageUrl(subcategoria.getImageUrl());

        return cardDTO;
    }

    public static Subcategoria toSubcategoriaEntity(CreateSubcategoriaDTO createSubcategoriaDTO) {
        Subcategoria subcategoria = new Subcategoria();
        subcategoria.setIdSubcategoria(createSubcategoriaDTO.getIdSubcategoria());
        subcategoria.setNombre(createSubcategoriaDTO.getNombre());
        subcategoria.setImageUrl(createSubcategoriaDTO.getImageUrl());

        return subcategoria;
    }
}
