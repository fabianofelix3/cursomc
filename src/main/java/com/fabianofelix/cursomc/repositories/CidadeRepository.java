package com.fabianofelix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianofelix.cursomc.domian.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
