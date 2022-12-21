package com.gestion.permisos.servicio;


import com.gestion.permisos.entidades.Permiso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PermisoService {
    public List<Permiso> findAll();

    public Page<Permiso> findAll(Pageable pageable);

    public void save(Permiso permiso);

    public Permiso findOne(Long id_p);

    public void delete(Long id_p);
}
