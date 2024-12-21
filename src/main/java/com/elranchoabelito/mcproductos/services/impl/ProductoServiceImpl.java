package com.elranchoabelito.mcproductos.services.impl;

import com.elranchoabelito.mcproductos.mapper.ProductoMapper;
import com.elranchoabelito.mcproductos.models.dtos.*;
import com.elranchoabelito.mcproductos.models.entities.Producto;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import com.elranchoabelito.mcproductos.repository.ProductoRepository;
import com.elranchoabelito.mcproductos.services.IProductoService;
import com.elranchoabelito.mcproductos.services.ISubcategoriaService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    private final ProductoRepository productoRepository;
    private final ISubcategoriaService subcategoriaService;

    public ProductoServiceImpl(ProductoRepository productoRepository, ISubcategoriaService subcategoriaService) {
        this.productoRepository = productoRepository;
        this.subcategoriaService = subcategoriaService;
    }

    @Override
    public List<Producto> findAll() {
        List<Producto> productos = productoRepository.findAll();
        if (productos.isEmpty()) {

            System.out.println("aea");
        }
        return productos;
    }

    @Override
    public Producto findById(Integer id) {
        return productoRepository.findById(id).orElseThrow(
            () -> new NullPointerException("Producto no encontrado con el id:" + id)
        );
    }

    @Override
    public List<ProductoMeseroDTO> getProductsForList() {

        List<Producto> productos = productoRepository.findAll();

        return productos.stream().map(
                ProductoMapper::toProductoMeseroDto
        ).toList();
    }

    @Override
    public List<ProductoCardDTO> listarProductosCardDTO(){
        List<Producto> productos = productoRepository.findAll();
        return productos.stream().map(
                ProductoMapper::toProductoCardDTO
        ).toList();
    }

    @Override
    @Transactional
    public Producto createProducto(CreateProductoDTO createProductoDTO) {

        Producto producto = ProductoMapper.toProductoEntity(createProductoDTO);
        Subcategoria subcategoria = subcategoriaService.findById(createProductoDTO.getIdSubcategoria());

        producto.setSubcategoria(subcategoria);

        return productoRepository.save(producto);
    }

    @Override
    @Transactional
    public  Producto updateStockProducto(UpdateStockProductoDTO updateProductoDTO) {
        Producto producto = productoRepository.findById(updateProductoDTO.getIdProducto()).orElse(null);
        producto.setStock(updateProductoDTO.getStock());
        productoRepository.save(producto);
        return producto;
    }

    @Override
    @Transactional
    public Producto updateProducto(UpdateProductoDTO updateProductoDTO){
        Producto producto = productoRepository.findById(updateProductoDTO.getId()).orElse(null);
        producto = ProductoMapper.updateProducto(producto,updateProductoDTO);
        productoRepository.save(producto);
        return producto;
    }
}
