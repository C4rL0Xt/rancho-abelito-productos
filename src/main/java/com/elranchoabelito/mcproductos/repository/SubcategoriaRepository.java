package com.elranchoabelito.mcproductos.repository;

import com.elranchoabelito.mcproductos.models.entities.Subcategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoriaRepository extends JpaRepository<Subcategoria, Integer> {
}
