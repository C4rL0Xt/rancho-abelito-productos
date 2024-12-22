package com.elranchoabelito.mcproductos.services.impl;

import com.elranchoabelito.mcproductos.mapper.CategoriaMapper;
import com.elranchoabelito.mcproductos.models.dtos.SaveCategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Categoria;
import com.elranchoabelito.mcproductos.repository.CategoriaRepository;
import com.elranchoabelito.mcproductos.services.ICategoriaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {

        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> findAll() {
        List<Categoria> categorias = categoriaRepository.findAll();
        if (categorias.isEmpty()) {
            System.out.println("No se encontraron categorías.");
        }
        return categorias;
    }

    @Override
    public Categoria findCategoriaById(Integer id) {

        if (id == null || id <= 0) {
            throw new IllegalArgumentException("El ID proporcionado es inválido. Debe ser mayor a 0 y no nulo.");
        }

        return categoriaRepository.findByIdCategoria(id).orElseThrow(
                () -> new NullPointerException("No se encontro la categoria con id: "+ id)
        );
    }

    @Override
    @Transactional
    public Categoria save(SaveCategoriaDTO saveCategoriaDTO) {
        Categoria categoria = CategoriaMapper.toCategoryEntity(saveCategoriaDTO);
        return categoriaRepository.save(categoria);
    }
}
