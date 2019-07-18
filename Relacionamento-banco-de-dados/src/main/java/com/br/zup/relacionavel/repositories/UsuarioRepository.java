package com.br.zup.relacionavel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.relacionavel.models.Usuario;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	
}
