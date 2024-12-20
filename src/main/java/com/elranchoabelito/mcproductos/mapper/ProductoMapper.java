package com.elranchoabelito.mcproductos.mapper;

import com.elranchoabelito.mcproductos.models.dtos.ProductoMeseroDTO;
import com.elranchoabelito.mcproductos.models.dtos.SubcategoriaDTO;
import com.elranchoabelito.mcproductos.models.entities.Producto;

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

}
