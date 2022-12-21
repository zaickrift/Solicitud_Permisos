package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.Empleado;
import com.gestion.permisos.entidades.SolCometido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SolCometidoService {

    public List<SolCometido> findAll();

    public Page<SolCometido> findAll(Pageable pageable);

    public void save(SolCometido solCometido);

    public SolCometido findOne(Long id_SC);

    public void delete(Long id_SC);
}
