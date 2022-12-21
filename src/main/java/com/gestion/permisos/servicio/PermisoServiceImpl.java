package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.Empleado;
import com.gestion.permisos.entidades.Permiso;
import com.gestion.permisos.repositorio.EmpleadoRepository;
import com.gestion.permisos.repositorio.PermisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PermisoServiceImpl implements PermisoService{

    @Autowired
    private PermisoRepository permisoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Permiso> findAll() {
        return (List<Permiso>) permisoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Permiso> findAll(Pageable pageable) {
        return permisoRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Permiso permiso) {
        permisoRepository.save(permiso);
    }

    @Override
    @Transactional
    public void delete(Long id_p) {
        permisoRepository.deleteById(id_p);
    }

    @Override
    @Transactional(readOnly = true)
    public Permiso findOne(Long id_p) {
        return permisoRepository.findById(id_p).orElse(null);
    }
}
