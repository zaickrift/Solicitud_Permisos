package com.gestion.permisos.servicio;


import com.gestion.permisos.entidades.Funcionario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FuncionarioService {
    public List<Funcionario> findAll();

    public Page<Funcionario> findAll(Pageable pageable);

    public void save(Funcionario funcionario);

    public Funcionario findOne(Long id_f);

    public void delete(Long id_f);
}
