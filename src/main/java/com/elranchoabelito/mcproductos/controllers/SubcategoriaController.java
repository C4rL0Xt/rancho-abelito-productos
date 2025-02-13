package com.elranchoabelito.mcproductos.controllers;

import com.elranchoabelito.mcproductos.models.dtos.SaveSubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaCardDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.services.ISubcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/for-card")
    public ResponseEntity<List<SubcategoriaCardDTO>> listarSubcategoriaForCard() {

        List<SubcategoriaCardDTO> subcategoriaCardDTOS = subcategoriaService.listarSubcategoriaCardDTO();

        return ResponseEntity.ok(subcategoriaCardDTOS);
    }

    @PostMapping("/create")
    public ResponseEntity<Subcategoria> crearSubcategoria(@RequestBody SaveSubcategoriaDTO saveSubcategoriaDTO) {
        Subcategoria subcategoria = subcategoriaService.createSubcategoria(saveSubcategoriaDTO);
        return ResponseEntity.ok(subcategoria);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ByIdCategoria/{idCategoria}")
    public ResponseEntity<List<SubcategoriaDTO>> listarByIdCategoria(@PathVariable Integer idCategoria){
        List<SubcategoriaDTO> subcategorias = subcategoriaService.SubcategoriasByIdCategoria(idCategoria);
        return ResponseEntity.ok(subcategorias);
    }


}
