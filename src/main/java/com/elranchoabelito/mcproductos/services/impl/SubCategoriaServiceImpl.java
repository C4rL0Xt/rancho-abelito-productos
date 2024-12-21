package com.elranchoabelito.mcproductos.services.impl;

import com.elranchoabelito.mcproductos.mapper.SubcategoriaMapper;
import com.elranchoabelito.mcproductos.models.dtos.CreateSubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaCardDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Categoria;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.repository.SubcategoriaRepository;
import com.elranchoabelito.mcproductos.services.ICategoriaService;
import com.elranchoabelito.mcproductos.services.ISubcategoriaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubCategoriaServiceImpl implements ISubcategoriaService {


    private final SubcategoriaRepository subcategoriaRepository;
    private final ICategoriaService categoriaService;

    public SubCategoriaServiceImpl(SubcategoriaRepository subcategoriaRepository, ICategoriaService categoriaService) {
        this.subcategoriaRepository = subcategoriaRepository;
        this.categoriaService = categoriaService;
    }

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

    @Override
    public List<SubcategoriaCardDTO> listarSubcategoriaCardDTO() {

        List<Subcategoria> subcategorias = subcategoriaRepository.findAll();

        return subcategorias.stream().map(
                SubcategoriaMapper::subcategoriaCardDTO
        ).toList();
    }

    @Override
    public Subcategoria findById(Integer id) {
        return subcategoriaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Subcategoria createSubcategoria(CreateSubcategoriaDTO createSubcategoriaDTO) {

        Subcategoria subcategoria = SubcategoriaMapper.toSubcategoriaEntity(createSubcategoriaDTO);
        Categoria categoria = categoriaService.findCategoriaById(createSubcategoriaDTO.getIdCategoria());
        subcategoria.setCategoria(categoria);

        return subcategoriaRepository.save(subcategoria);
    }
}
