package com.elranchoabelito.mcproductos.controllers;

import com.elranchoabelito.mcproductos.models.dtos.*;
import com.elranchoabelito.mcproductos.models.entities.Producto;
import com.elranchoabelito.mcproductos.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/for-list")
    public ResponseEntity<List<ProductoMeseroDTO>> getProductosForList() {
        List<ProductoMeseroDTO> productos = productoService.getProductsForList();
        return ResponseEntity.ok().body(productos);
    }

    @GetMapping("/for-card")
    public ResponseEntity<List<ProductoCardDTO>> getProductosForCard() {
        List<ProductoCardDTO> productos = productoService.listarProductosCardDTO();
        return  ResponseEntity.ok().body(productos);
    }

    @PostMapping("/create")
    public ResponseEntity<Producto> createProducto(@RequestBody CreateProductoDTO createProductoDTO){

        Producto producto = productoService.createProducto(createProductoDTO);

        return ResponseEntity.ok(producto);

    }

    @PostMapping("/actualizarStock")
    public ResponseEntity<Producto> updateStockProducto(@RequestBody UpdateStockProductoDTO updateProductoDTO){
        Producto producto = productoService.updateStockProducto(updateProductoDTO);
        return ResponseEntity.ok(producto);
    }

    @PostMapping("/actualizar")
    public  ResponseEntity<Producto> updateProducto(@RequestBody UpdateProductoDTO updateProductoDTO){
        Producto producto = productoService.updateProducto(updateProductoDTO);
        return ResponseEntity.ok(producto);
    }
}
