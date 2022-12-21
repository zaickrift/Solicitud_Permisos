package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.Empleado;
import com.gestion.permisos.entidades.SolCometido;
import com.gestion.permisos.entidades.SolExtras;
import com.gestion.permisos.repositorio.EmpleadoRepository;
import com.gestion.permisos.repositorio.SolCometidoRepository;
import com.gestion.permisos.repositorio.SolExtrasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class SolExtrasServiceImpl implements SolExtrasService {
    @Autowired
    private SolExtrasRepository solExtrasRepository;

    @Override
    @Transactional(readOnly = true)
    public List<SolExtras> findAll() {
        return (List<SolExtras>) solExtrasRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<SolExtras> findAll(Pageable pageable) {
        return solExtrasRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(SolExtras solExtras) {
        solExtrasRepository.save(solExtras);
    }

    @Override
    @Transactional
    public void delete(Long id_HE) {
        solExtrasRepository.deleteById(id_HE);
    }

    @Override
    @Transactional(readOnly = true)
    public SolExtras findOne(Long id_HE) {
        return solExtrasRepository.findById(id_HE).orElse(null);
    }
}
