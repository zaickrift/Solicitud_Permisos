package com.gestion.permisos.repositorio;

import com.gestion.permisos.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
