package com.gestion.permisos.entidades;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="permisos", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_permiso"})})
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_permiso;
    @NotNull
    private int anioFeriado_PER;
    private Boolean feriadoLegal_PER;
    @NotNull
    private int anioFeriadoLegal_PER;
    private Boolean feriadoAcuFrac_PER;
    @NotNull
    private int anioFeriadoAcuFrac_PER;
    private Boolean permisoFacul_PER;
    private Boolean permisoSinGoce_PER;
    private Boolean devTiempo_PER;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechIniDev_PER;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechFinDev_PER;
    @NotNull
    private int horaIniDev_PER;
    @NotNull
    private int horaFinDev_PER;
    @NotEmpty
    private String nombreFichaPer;
    @NotEmpty
    private String firmaFuncionario_PER;
    @NotEmpty
    private String firmaDirector_PER;
    @NotEmpty
    private String firmaRRHHP_PER;
    @NotEmpty
    private String firmaDAFF_PER;
    @NotEmpty
    private String firmaAdminM_PER;
    @NotEmpty
    private String firmaAlcalde_PER;
}
