package com.elranchoabelito.mcproductos.services;

import com.elranchoabelito.mcproductos.models.dtos.SaveSubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaCardDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;

import java.util.List;

public interface ISubcategoriaService {

    List<Subcategoria> findAll();

    List<SubcategoriaDTO> listarSubcategoriaDTO();

    List<SubcategoriaCardDTO> listarSubcategoriaCardDTO();

    Subcategoria findById(Integer id);

    Subcategoria createSubcategoria(SaveSubcategoriaDTO saveSubcategoriaDTO);

    Subcategoria updateSubcategoria(SaveSubcategoriaDTO saveSubcategoriaDTO);

}
