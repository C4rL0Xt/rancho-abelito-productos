package com.elranchoabelito.mcproductos.services.impl;

import com.elranchoabelito.mcproductos.mapper.ProductoMapper;
import com.elranchoabelito.mcproductos.models.dtos.ProductoMeseroDTO;
import com.elranchoabelito.mcproductos.models.entities.Producto;
import com.elranchoabelito.mcproductos.repository.ProductoRepository;
import com.elranchoabelito.mcproductos.services.IProductoService;
import io.micrometer.observation.annotation.Observed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    private ProductoRepository productoRepository;

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
    public List<ProductoMeseroDTO> getProductsForMesero() {
        return productoRepository.findAll().stream().map(
                ProductoMapper::toProductoMeseroDto
        ).toList();
    }
}
