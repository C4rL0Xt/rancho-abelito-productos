package com.elranchoabelito.mcproductos.repository;

import com.elranchoabelito.mcproductos.models.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    Optional<Categoria> findByIdCategoria(Integer idCategoria);

}
