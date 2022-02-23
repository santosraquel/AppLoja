package com.dev.lojavirtual.repositorios;

import com.dev.lojavirtual.modelos.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
