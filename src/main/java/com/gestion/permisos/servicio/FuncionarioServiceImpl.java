package com.gestion.permisos.servicio;

import com.gestion.permisos.entidades.Empleado;
import com.gestion.permisos.entidades.Funcionario;
import com.gestion.permisos.repositorio.EmpleadoRepository;
import com.gestion.permisos.repositorio.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class FuncionarioServiceImpl implements FuncionarioService{
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Funcionario> findAll() {
        return (List<Funcionario>) funcionarioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Funcionario> findAll(Pageable pageable) {
        return funcionarioRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    @Override
    @Transactional
    public void delete(Long id_f) {
        funcionarioRepository.deleteById(id_f);
    }

    @Override
    @Transactional(readOnly = true)
    public Funcionario findOne(Long id_f) {
        return funcionarioRepository.findById(id_f).orElse(null);
    }
}
