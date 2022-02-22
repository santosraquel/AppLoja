package com.dev.lojavirtual.repositorios;

import com.dev.lojavirtual.modelos.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {

}
