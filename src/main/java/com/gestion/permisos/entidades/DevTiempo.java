package com.gestion.permisos.entidades;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="devTiempo", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_dev"})})
public class DevTiempo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_dev;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechSolDev;
    @NotEmpty
    private String horaSolDev;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechSolicitada_DEV;
    @NotEmpty
    private String horaSolicitada_DEV;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechFinSol_DEV;
    @NotEmpty
    private String horaFinSol_DEV;
    @NotEmpty
    private String nroDecreto_DEV;
    @NotNull
    private int timeDev;
    @NotEmpty
    private String nombreFicha_DEV;
    @NotEmpty
    private String firmaFuncionario_DEV;
    @NotEmpty
    private String firmaAdminM_DEV;
    @NotEmpty
    private String firmaDirector_DEV;

    //Constructor Vacio

    public DevTiempo() {
    }

    //Getters and Setters


    public Long getId_dev() {
        return id_dev;
    }

    public void setId_dev(Long id_dev) {
        this.id_dev = id_dev;
    }

    public Date getFechSolDev() {
        return fechSolDev;
    }

    public void setFechSolDev(Date fechSolDev) {
        this.fechSolDev = fechSolDev;
    }

    public String getHoraSolDev() {
        return horaSolDev;
    }

    public void setHoraSolDev(String horaSolDev) {
        this.horaSolDev = horaSolDev;
    }

    public Date getFechSolicitada_DEV() {
        return fechSolicitada_DEV;
    }

    public void setFechSolicitada_DEV(Date fechSolicitada_DEV) {
        this.fechSolicitada_DEV = fechSolicitada_DEV;
    }

    public String getHoraSolicitada_DEV() {
        return horaSolicitada_DEV;
    }

    public void setHoraSolicitada_DEV(String horaSolicitada_DEV) {
        this.horaSolicitada_DEV = horaSolicitada_DEV;
    }

    public Date getFechFinSol_DEV() {
        return fechFinSol_DEV;
    }

    public void setFechFinSol_DEV(Date fechFinSol_DEV) {
        this.fechFinSol_DEV = fechFinSol_DEV;
    }

    public String getHoraFinSol_DEV() {
        return horaFinSol_DEV;
    }

    public void setHoraFinSol_DEV(String horaFinSol_DEV) {
        this.horaFinSol_DEV = horaFinSol_DEV;
    }

    public String getNroDecreto_DEV() {
        return nroDecreto_DEV;
    }

    public void setNroDecreto_DEV(String nroDecreto_DEV) {
        this.nroDecreto_DEV = nroDecreto_DEV;
    }

    public int getTimeDev() {
        return timeDev;
    }

    public void setTimeDev(int timeDev) {
        this.timeDev = timeDev;
    }

    public String getNombreFicha_DEV() {
        return nombreFicha_DEV;
    }

    public void setNombreFicha_DEV(String nombreFicha_DEV) {
        this.nombreFicha_DEV = nombreFicha_DEV;
    }

    public String getFirmaFuncionario_DEV() {
        return firmaFuncionario_DEV;
    }

    public void setFirmaFuncionario_DEV(String firmaFuncionario_DEV) {
        this.firmaFuncionario_DEV = firmaFuncionario_DEV;
    }

    public String getFirmaAdminM_DEV() {
        return firmaAdminM_DEV;
    }

    public void setFirmaAdminM_DEV(String firmaAdminM_DEV) {
        this.firmaAdminM_DEV = firmaAdminM_DEV;
    }

    public String getFirmaDirector_DEV() {
        return firmaDirector_DEV;
    }

    public void setFirmaDirector_DEV(String firmaDirector_DEV) {
        this.firmaDirector_DEV = firmaDirector_DEV;
    }
}
