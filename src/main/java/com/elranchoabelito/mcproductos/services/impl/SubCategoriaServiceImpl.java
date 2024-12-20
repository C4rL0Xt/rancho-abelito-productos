package com.elranchoabelito.mcproductos.services.impl;

import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.repository.SubcategoriaRepository;
import com.elranchoabelito.mcproductos.services.ISubcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubCategoriaServiceImpl implements ISubcategoriaService {

    @Autowired
    private SubcategoriaRepository subcategoriaRepository;

    public List<Subcategoria> findAll() {
        return (List<Subcategoria>) subcategoriaRepository.findAll();
    }

    public List<SubcategoriaDTO> listarSubcategoriaDTO(){
        List<Subcategoria> subcategorias = subcategoriaRepository.findAll();
        List<SubcategoriaDTO> subcategoriasDTO = new ArrayList<>();
        for(Subcategoria subcategoria: subcategorias){
            SubcategoriaDTO subcategoriaDTO = new SubcategoriaDTO();
            subcategoriaDTO.setIdSubcategoria(subcategoria.getIdSubcategoria());
            subcategoriaDTO.setNombre(subcategoria.getNombre());
            subcategoriasDTO.add(subcategoriaDTO);
        }
        return subcategoriasDTO;
    }
}
