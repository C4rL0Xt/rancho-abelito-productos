package com.elranchoabelito.mcproductos.controllers;

import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.services.ISubcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subcategorias")
public class SubcategoriaController {

    @Autowired
    private ISubcategoriaService subcategoriaService;

    @GetMapping("/listar")
    public List<Subcategoria> listarSubcategorias() {
        return (List<Subcategoria>) subcategoriaService.findAll();
    }

    @GetMapping("/listarDTO")
    public List<SubcategoriaDTO> listarSubcategoriaDTO() {
        return (List<SubcategoriaDTO>) subcategoriaService.listarSubcategoriaDTO();
    }
}
