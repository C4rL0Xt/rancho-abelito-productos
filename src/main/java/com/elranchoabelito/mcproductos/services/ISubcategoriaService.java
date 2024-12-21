package com.elranchoabelito.mcproductos.services;

import com.elranchoabelito.mcproductos.models.dtos.CreateSubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaCardDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.repository.SubcategoriaRepository;

import java.util.List;

public interface ISubcategoriaService {

    List<Subcategoria> findAll();

    List<SubcategoriaDTO> listarSubcategoriaDTO();

    List<SubcategoriaCardDTO> listarSubcategoriaCardDTO();

    Subcategoria findById(Integer id);

    Subcategoria createSubcategoria(CreateSubcategoriaDTO createSubcategoriaDTO);

}
