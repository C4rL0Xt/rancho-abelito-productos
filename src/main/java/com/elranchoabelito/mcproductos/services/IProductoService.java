package com.elranchoabelito.mcproductos.services;

import com.elranchoabelito.mcproductos.models.dtos.ProductoMeseroDTO;
import com.elranchoabelito.mcproductos.models.entities.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> findAll();

    Producto findById(Integer id);

    List<ProductoMeseroDTO> getProductsForMesero();

}
