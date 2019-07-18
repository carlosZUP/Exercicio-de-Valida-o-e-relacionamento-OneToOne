package com.br.zup.relacionavel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.relacionavel.models.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{

}
