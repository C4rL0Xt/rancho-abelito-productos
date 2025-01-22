package com.elranchoabelito.mcproductos.repository;

import com.elranchoabelito.mcproductos.models.entities.Producto;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    Optional<Producto> findById(Integer id);
    List<Producto> findProductosBySubcategoria(Subcategoria subcategoria);
}
