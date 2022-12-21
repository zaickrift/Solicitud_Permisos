package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.DevTiempo;
import com.gestion.permisos.entidades.Empleado;
import com.gestion.permisos.repositorio.DevTiempoRepository;
import com.gestion.permisos.repositorio.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DevTiempoServiceImpl implements DevTiempoService{
    @Autowired
    private DevTiempoRepository devTiempoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DevTiempo> findAll() {
        return (List<DevTiempo>) devTiempoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DevTiempo> findAll(Pageable pageable) {
        return devTiempoRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(DevTiempo devTiempo) {
        devTiempoRepository.save(devTiempo);
    }

    @Override
    @Transactional
    public void delete(Long id_dev) {
        devTiempoRepository.deleteById(id_dev);
    }

    @Override
    @Transactional(readOnly = true)
    public DevTiempo findOne(Long id_dev) {
        return devTiempoRepository.findById(id_dev).orElse(null);
    }
}
