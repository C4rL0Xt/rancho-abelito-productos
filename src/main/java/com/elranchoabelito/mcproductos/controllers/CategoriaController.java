package com.elranchoabelito.mcproductos.controllers;

import com.elranchoabelito.mcproductos.models.dtos.SaveCategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Categoria;
import com.elranchoabelito.mcproductos.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {


    private final ICategoriaService categoriaService;

    public CategoriaController(ICategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/list")
    public ResponseEntity<List<Categoria>> getAllCategorias() {
        List<Categoria> categorias = categoriaService.findAll();
        if (categorias.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(categorias);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getCategoriaById(@PathVariable Integer id) {

        Categoria categoria = categoriaService.findCategoriaById(id);

        if (categoria == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(categoria);
    }

    @PostMapping("/create")
    public ResponseEntity<Categoria> createCategoria(@RequestBody SaveCategoriaDTO saveCategoriaDTO) {
        Categoria categoria = categoriaService.save(saveCategoriaDTO);

        return ResponseEntity.ok(categoria);
    }

    @PutMapping("/update")
    public ResponseEntity<Categoria> updateCategoria(@RequestBody SaveCategoriaDTO saveCategoriaDTO) {
        Categoria categoria = categoriaService.save(saveCategoriaDTO);

        return ResponseEntity.ok(categoria);
    }

}
