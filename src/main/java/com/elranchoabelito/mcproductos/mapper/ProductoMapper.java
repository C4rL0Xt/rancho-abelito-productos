package com.elranchoabelito.mcproductos.mapper;

import com.elranchoabelito.mcproductos.models.dtos.*;
import com.elranchoabelito.mcproductos.models.entities.Producto;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;

public class ProductoMapper {

    public static ProductoMeseroDTO toProductoMeseroDto(Producto producto) {
        ProductoMeseroDTO dto = new ProductoMeseroDTO();
        dto.setIdProducto(producto.getIdProducto());
        dto.setNombre(producto.getNombre());
        SubcategoriaDTO subcategoriaDTO = SubcategoriaMapper.toSubcategoriaDTO(producto.getSubcategoria());
        dto.setSubcategoria(subcategoriaDTO);
        dto.setStock(producto.getStock());
        dto.setPrecio(producto.getPrecio());

        return dto;
    }

    public static ProductoCardDTO toProductoCardDTO(Producto producto){
        ProductoCardDTO productoCardDTO = new ProductoCardDTO();
        productoCardDTO.setIdProducto(producto.getIdProducto());
        productoCardDTO.setNombre(producto.getNombre());
        productoCardDTO.setSubcategoriaNombre(producto.getSubcategoria().getNombre());
        productoCardDTO.setIdSubcategoria(producto.getSubcategoria().getIdSubcategoria());
        productoCardDTO.setStock(producto.getStock());
        productoCardDTO.setPrecio(producto.getPrecio());
        productoCardDTO.setImagen(producto.getImageUrl());
        return productoCardDTO;
    }

    public static Producto toProductoEntity(CreateProductoDTO createProductoDTO) {
        Producto producto = new Producto();
        producto.setIdProducto(createProductoDTO.getIdProducto());
        producto.setNombre(createProductoDTO.getNombre());
        producto.setDescripcion(createProductoDTO.getDescripcion());
        producto.setPrecio(createProductoDTO.getPrecio());
        producto.setImageUrl(createProductoDTO.getImageUrl());
        producto.setStock(0);
        producto.setActivo(false);
        return producto;
    }

    public static Producto updateProducto(Producto p, UpdateProductoDTO updateProductoDTO,Subcategoria subcategoria){
        p.setSubcategoria(subcategoria);
        p.setDescripcion(updateProductoDTO.getDescripcion());
        p.setDescripcion(updateProductoDTO.getDescripcion());
        p.setPrecio(updateProductoDTO.getPrecio());
        p.setImageUrl(updateProductoDTO.getImagen());
        return p;
    }

}
