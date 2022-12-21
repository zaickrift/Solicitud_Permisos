package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.DevTiempo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DevTiempoService {
    public List<DevTiempo> findAll();

    public Page<DevTiempo> findAll(Pageable pageable);

    public void save(DevTiempo devTiempo);

    public DevTiempo findOne(Long id_dev);

    public void delete(Long id_dev);
}
