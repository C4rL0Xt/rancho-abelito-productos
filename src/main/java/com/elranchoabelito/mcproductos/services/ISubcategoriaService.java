package com.elranchoabelito.mcproductos.services;

import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.repository.SubcategoriaRepository;

import java.util.List;

public interface ISubcategoriaService {
    List<Subcategoria> findAll();
    List<SubcategoriaDTO> listarSubcategoriaDTO();
}
