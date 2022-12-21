package com.gestion.permisos.entidades;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_f;

    @NotEmpty
    private String nombres_f;
    @NotEmpty
    private String apellidos_f;
    @NotEmpty
    private String rut_f;
    @NotEmpty
    private String cargo_f;
    @NotNull
    private int grado_f;
    @NotEmpty
    private String dependencia_f;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nac_f;
    @NotEmpty
    @Email
    private String email_f;
    @NotEmpty
    private String pass_f;
    @NotNull
    private int saldoHoras_f;
    @NotNull
    private int estadoFun_f;

    //Constructor vacio

    public Funcionario() {
    }

    public Long getId_f() {
        return id_f;
    }

    public void setId_f(Long id_f) {
        this.id_f = id_f;
    }

    public String getNombres_f() {
        return nombres_f;
    }

    public void setNombres_f(String nombres_f) {
        this.nombres_f = nombres_f;
    }

    public String getApellidos_f() {
        return apellidos_f;
    }

    public void setApellidos_f(String apellidos_f) {
        this.apellidos_f = apellidos_f;
    }

    public String getRut_f() {
        return rut_f;
    }

    public void setRut_f(String rut_f) {
        this.rut_f = rut_f;
    }

    public String getCargo_f() {
        return cargo_f;
    }

    public void setCargo_f(String cargo_f) {
        this.cargo_f = cargo_f;
    }

    public int getGrado_f() {
        return grado_f;
    }

    public void setGrado_f(int grado_f) {
        this.grado_f = grado_f;
    }

    public String getDependencia_f() {
        return dependencia_f;
    }

    public void setDependencia_f(String dependencia_f) {
        this.dependencia_f = dependencia_f;
    }

    public Date getFecha_nac_f() {
        return fecha_nac_f;
    }

    public void setFecha_nac_f(Date fecha_nac_f) {
        this.fecha_nac_f = fecha_nac_f;
    }

    public String getEmail_f() {
        return email_f;
    }

    public void setEmail_f(String email_f) {
        this.email_f = email_f;
    }

    public String getPass_f() {
        return pass_f;
    }

    public void setPass_f(String pass_f) {
        this.pass_f = pass_f;
    }

    public int getSaldoHoras_f() {
        return saldoHoras_f;
    }

    public void setSaldoHoras_f(int saldoHoras_f) {
        this.saldoHoras_f = saldoHoras_f;
    }

    public int getEstadoFun_f() {
        return estadoFun_f;
    }

    public void setEstadoFun_f(int estadoFun_f) {
        this.estadoFun_f = estadoFun_f;
    }
}