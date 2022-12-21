package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.Empleado;
import com.gestion.permisos.entidades.SolCometido;
import com.gestion.permisos.entidades.SolExtras;
import com.gestion.permisos.repositorio.EmpleadoRepository;
import com.gestion.permisos.repositorio.SolCometidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class SolCometidoServiceImpl implements SolCometidoService {
    @Autowired
    private SolCometidoRepository solCometidoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<SolCometido> findAll() {
        return (List<SolCometido>) solCometidoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<SolCometido> findAll(Pageable pageable) {
        return solCometidoRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(SolCometido solCometido) {
        solCometidoRepository.save(solCometido);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        solCometidoRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public SolCometido findOne(Long id_SC) {
        return solCometidoRepository.findById(id_SC).orElse(null);
    }
}