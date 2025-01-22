package com.elranchoabelito.mcproductos.repository;

import com.elranchoabelito.mcproductos.models.entities.Categoria;
import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoriaRepository extends JpaRepository<Subcategoria, Integer> {
    List<Subcategoria> findSubcategoriasByCategoria(Categoria categoria);
}
