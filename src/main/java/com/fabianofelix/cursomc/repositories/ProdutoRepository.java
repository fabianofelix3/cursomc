package com.fabianofelix.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fabianofelix.cursomc.domian.Categoria;
import com.fabianofelix.cursomc.domian.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

	@Transactional(readOnly = true)
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(String nome, List<Categoria> categorias, Pageable pageRequest);
}