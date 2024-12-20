package com.elranchoabelito.mcproductos.services;

import com.elranchoabelito.mcproductos.models.entities.Categoria;

import java.util.List;

public interface ICategoriaService {

    List<Categoria> findAll();

    Categoria findCategoriaById(Integer id);

}
