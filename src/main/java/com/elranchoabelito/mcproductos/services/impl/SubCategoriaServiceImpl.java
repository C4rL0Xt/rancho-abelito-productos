package com.elranchoabelito.mcproductos.services.impl;

import com.elranchoabelito.mcproductos.mapper.SubcategoriaMapper;
import com.elranchoabelito.mcproductos.models.dtos.SaveSubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaCardDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Categoria;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.repository.SubcategoriaRepository;
import com.elranchoabelito.mcproductos.services.ICategoriaService;
import com.elranchoabelito.mcproductos.services.ISubcategoriaService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

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

    @Override
    public List<Subcategoria> findAll() {
        return (List<Subcategoria>) subcategoriaRepository.findAll();
    }

    @Override
    public List<SubcategoriaDTO> listarSubcategoriaDTO(){
        List<Subcategoria> subcategorias = subcategoriaRepository.findAll();
        return subcategorias.stream().map(
                SubcategoriaMapper::toSubcategoriaDTO
        ).toList();
    }

    @Override
    public List<SubcategoriaCardDTO> listarSubcategoriaCardDTO() {

        List<Subcategoria> subcategorias = subcategoriaRepository.findAll();

        return subcategorias.stream().map(
                SubcategoriaMapper::subcategoriaCardDTO
        ).toList();
    }

    @Override
    @CrossOrigin(origins = "http://localhost:4200")
    public Subcategoria findById(Integer id) {
        return subcategoriaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Subcategoria createSubcategoria(SaveSubcategoriaDTO saveSubcategoriaDTO) {

        Subcategoria subcategoria = SubcategoriaMapper.toSubcategoriaEntity(saveSubcategoriaDTO);
        Categoria categoria = categoriaService.findCategoriaById(saveSubcategoriaDTO.getIdCategoria());
        subcategoria.setCategoria(categoria);

        return subcategoriaRepository.save(subcategoria);
    }

    @Override
    @Transactional
    public Subcategoria updateSubcategoria(SaveSubcategoriaDTO saveSubcategoriaDTO) {

        Subcategoria subcategoria = SubcategoriaMapper.toSubcategoriaEntity(saveSubcategoriaDTO);
        Categoria categoria = categoriaService.findCategoriaById(saveSubcategoriaDTO.getIdCategoria());
        subcategoria.setCategoria(categoria);

        return subcategoriaRepository.save(subcategoria);
    }
    @Override
    public List<SubcategoriaDTO> SubcategoriasByIdCategoria(Integer idCategoria) {
        Categoria categoria = categoriaService.findCategoriaById(idCategoria);
        List<Subcategoria> subcategorias = subcategoriaRepository.findSubcategoriasByCategoria(categoria);
        return subcategorias.stream().map(
                SubcategoriaMapper::toSubcategoriaDTO
        ).toList();
    }
}
