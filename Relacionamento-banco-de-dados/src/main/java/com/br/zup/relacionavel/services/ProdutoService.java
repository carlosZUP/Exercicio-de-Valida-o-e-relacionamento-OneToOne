package com.br.zup.relacionavel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.relacionavel.models.Produto;
import com.br.zup.relacionavel.repositories.CategoriaRepository;
import com.br.zup.relacionavel.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public String cadastrarProduto(Produto produto, List<Integer> idCategorias ) {
		for (Integer idCategoria : idCategorias) {
			produto.getCategorias().add(categoriaRepository.findById(idCategoria).get());
			
		}
		produtoRepository.save(produto);
		
		return "Produto Cadastrado com Sucesso...";
		
	}
	
	public Iterable<Produto> buscarTodosProdutos() {
		return produtoRepository.findAll();
		
	}
}
