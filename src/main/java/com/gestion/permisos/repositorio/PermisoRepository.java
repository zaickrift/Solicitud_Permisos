package com.gestion.permisos.repositorio;


import com.gestion.permisos.entidades.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisoRepository extends JpaRepository<Permiso, Long> {
}
