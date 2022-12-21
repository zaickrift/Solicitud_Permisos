package com.gestion.permisos.repositorio;


import com.gestion.permisos.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
