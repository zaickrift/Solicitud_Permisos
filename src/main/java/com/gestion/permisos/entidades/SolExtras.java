package com.gestion.permisos.entidades;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="solExtras", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_HE"})})
public class SolExtras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_HE;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechSolicitud_HE;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechSolicitada_HE;
    @NotNull
    private int horaIni_HE;
    @NotNull
    private int horaFin_HE;
    @NotNull
    private int totalHoras_HE;
    @NotNull
    private int porcentaje_HE;
    @NotEmpty
    private String descripcion_HE;
    @NotEmpty
    private String nombreFicha_HE;
    @NotEmpty
    private String firmaFuncionario_HE;
    @NotEmpty
    private String firmaAdminM_HE;
    @NotEmpty
    private String firmaDirector_HE;

    public SolExtras() {
    }

    public Long getId_HE() {
        return id_HE;
    }

    public void setId_HE(Long id_HE) {
        this.id_HE = id_HE;
    }

    public Date getFechSolicitud_HE() {
        return fechSolicitud_HE;
    }

    public void setFechSolicitud_HE(Date fechSolicitud_HE) {
        this.fechSolicitud_HE = fechSolicitud_HE;
    }

    public Date getFechSolicitada_HE() {
        return fechSolicitada_HE;
    }

    public void setFechSolicitada_HE(Date fechSolicitada_HE) {
        this.fechSolicitada_HE = fechSolicitada_HE;
    }

    public int getHoraIni_HE() {
        return horaIni_HE;
    }

    public void setHoraIni_HE(int horaIni_HE) {
        this.horaIni_HE = horaIni_HE;
    }

    public int getHoraFin_HE() {
        return horaFin_HE;
    }

    public void setHoraFin_HE(int horaFin_HE) {
        this.horaFin_HE = horaFin_HE;
    }

    public int getTotalHoras_HE() {
        return totalHoras_HE;
    }

    public void setTotalHoras_HE(int totalHoras_HE) {
        this.totalHoras_HE = totalHoras_HE;
    }

    public int getPorcentaje_HE() {
        return porcentaje_HE;
    }

    public void setPorcentaje_HE(int porcentaje_HE) {
        this.porcentaje_HE = porcentaje_HE;
    }

    public String getDescripcion_HE() {
        return descripcion_HE;
    }

    public void setDescripcion_HE(String descripcion_HE) {
        this.descripcion_HE = descripcion_HE;
    }

    public String getNombreFicha_HE() {
        return nombreFicha_HE;
    }

    public void setNombreFicha_HE(String nombreFicha_HE) {
        this.nombreFicha_HE = nombreFicha_HE;
    }

    public String getFirmaFuncionario_HE() {
        return firmaFuncionario_HE;
    }

    public void setFirmaFuncionario_HE(String firmaFuncionario_HE) {
        this.firmaFuncionario_HE = firmaFuncionario_HE;
    }

    public String getFirmaAdminM_HE() {
        return firmaAdminM_HE;
    }

    public void setFirmaAdminM_HE(String firmaAdminM_HE) {
        this.firmaAdminM_HE = firmaAdminM_HE;
    }

    public String getFirmaDirector_HE() {
        return firmaDirector_HE;
    }

    public void setFirmaDirector_HE(String firmaDirector_HE) {
        this.firmaDirector_HE = firmaDirector_HE;
    }
}
