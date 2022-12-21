package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.Empleado;
import com.gestion.permisos.entidades.SolExtras;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SolExtrasService {
    public List<SolExtras> findAll();

    public Page<SolExtras> findAll(Pageable pageable);

    public void save(SolExtras solExtras);

    public SolExtras findOne(Long id_HE);

    public void delete(Long id_HE);
}
