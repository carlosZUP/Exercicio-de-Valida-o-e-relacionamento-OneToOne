package com.br.zup.relacionavel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.relacionavel.models.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
