package com.fabianofelix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianofelix.cursomc.domian.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
