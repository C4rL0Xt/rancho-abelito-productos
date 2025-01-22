package com.elranchoabelito.mcproductos.services;

import com.elranchoabelito.mcproductos.models.dtos.*;
import com.elranchoabelito.mcproductos.models.entities.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> findAll();

    Producto findById(Integer id);

    List<ProductoMeseroDTO> getProductsForList();

    List<ProductoCardDTO> listarProductosCardDTOPorSubcategoria(Integer idSubcategoria);

    Producto createProducto(CreateProductoDTO createProductoDTO);

    Producto updateStockProducto(UpdateStockProductoDTO updateProductoDTO);

    Producto updateProducto(UpdateProductoDTO updateProductoDTO);



}
