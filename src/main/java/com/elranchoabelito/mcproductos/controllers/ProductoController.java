package com.elranchoabelito.mcproductos.controllers;

import com.elranchoabelito.mcproductos.models.dtos.ProductoMeseroDTO;
import com.elranchoabelito.mcproductos.models.entities.Producto;
import com.elranchoabelito.mcproductos.repository.ProductoRepository;
import com.elranchoabelito.mcproductos.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listarProductos(){return (List<Producto>) productoService.findAll();}

    @GetMapping("/buscar/{idProducto}")
    public Producto buscarProductoPorId(@PathVariable("idProducto") Integer idProducto){
        return productoService.findById(idProducto);
    }

    @GetMapping("/mesero")
    public ResponseEntity<List<ProductoMeseroDTO>> getProductosForMesero() {

        List<ProductoMeseroDTO> productos = productoService.getProductsForMesero();

        return ResponseEntity.ok().body(productos);
    }

}
