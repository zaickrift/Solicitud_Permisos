package com.gestion.permisos.entidades;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="solCometidos")
public class SolCometido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_SC;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechIniSolCom;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechFinSolCom;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechSolCom;
    private String lugarCom_SC;
    @NotNull
    private int horaSalidaCom_SC;
    @NotNull
    private int horaLlegadaCom_SC;
    private boolean conDerechoViatico_SC;
    private boolean solicitaAnticipo_SC;
    @NotEmpty
    private String patente_SC;
    @NotEmpty
    private String medioMov_SC;
    @Transient
    private MultipartFile fichaPdfCom_SC;
    @NotEmpty
    private String nombreFichaCom_SC;
    @NotEmpty
    private String motivoCom_SC;
    private boolean anexo_SC;
    @NotEmpty
    private String desAnexo_SC;
    @NotEmpty
    private String firmaFuncionario_SC;
    @NotEmpty
    private String firmaDirector_SC;
    @NotEmpty
    private String firmaAdminM_SC;


    public SolCometido() {
    }

    public Long getId_SC() {
        return id_SC;
    }

    public void setId_SC(Long id_SC) {
        this.id_SC = id_SC;
    }

    public Date getFechIniSolCom() {
        return fechIniSolCom;
    }

    public void setFechIniSolCom(Date fechIniSolCom) {
        this.fechIniSolCom = fechIniSolCom;
    }

    public Date getFechFinSolCom() {
        return fechFinSolCom;
    }

    public void setFechFinSolCom(Date fechFinSolCom) {
        this.fechFinSolCom = fechFinSolCom;
    }

    public Date getFechSolCom() {
        return fechSolCom;
    }

    public void setFechSolCom(Date fechSolCom) {
        this.fechSolCom = fechSolCom;
    }

    public String getLugarCom_SC() {
        return lugarCom_SC;
    }

    public void setLugarCom_SC(String lugarCom_SC) {
        this.lugarCom_SC = lugarCom_SC;
    }

    public int getHoraSalidaCom_SC() {
        return horaSalidaCom_SC;
    }

    public void setHoraSalidaCom_SC(int horaSalidaCom_SC) {
        this.horaSalidaCom_SC = horaSalidaCom_SC;
    }

    public int getHoraLlegadaCom_SC() {
        return horaLlegadaCom_SC;
    }

    public void setHoraLlegadaCom_SC(int horaLlegadaCom_SC) {
        this.horaLlegadaCom_SC = horaLlegadaCom_SC;
    }

    public boolean isConDerechoViatico_SC() {
        return conDerechoViatico_SC;
    }

    public void setConDerechoViatico_SC(boolean conDerechoViatico_SC) {
        this.conDerechoViatico_SC = conDerechoViatico_SC;
    }

    public boolean isSolicitaAnticipo_SC() {
        return solicitaAnticipo_SC;
    }

    public void setSolicitaAnticipo_SC(boolean solicitaAnticipo_SC) {
        this.solicitaAnticipo_SC = solicitaAnticipo_SC;
    }

    public String getPatente_SC() {
        return patente_SC;
    }

    public void setPatente_SC(String patente_SC) {
        this.patente_SC = patente_SC;
    }

    public String getMedioMov_SC() {
        return medioMov_SC;
    }

    public void setMedioMov_SC(String medioMov_SC) {
        this.medioMov_SC = medioMov_SC;
    }

    public MultipartFile getFichaPdfCom_SC() {
        return fichaPdfCom_SC;
    }

    public void setFichaPdfCom_SC(MultipartFile fichaPdfCom_SC) {
        this.fichaPdfCom_SC = fichaPdfCom_SC;
    }

    public String getNombreFichaCom_SC() {
        return nombreFichaCom_SC;
    }

    public void setNombreFichaCom_SC(String nombreFichaCom_SC) {
        this.nombreFichaCom_SC = nombreFichaCom_SC;
    }

    public String getMotivoCom_SC() {
        return motivoCom_SC;
    }

    public void setMotivoCom_SC(String motivoCom_SC) {
        this.motivoCom_SC = motivoCom_SC;
    }

    public boolean isAnexo_SC() {
        return anexo_SC;
    }

    public void setAnexo_SC(boolean anexo_SC) {
        this.anexo_SC = anexo_SC;
    }

    public String getDesAnexo_SC() {
        return desAnexo_SC;
    }

    public void setDesAnexo_SC(String desAnexo_SC) {
        this.desAnexo_SC = desAnexo_SC;
    }

    public String getFirmaFuncionario_SC() {
        return firmaFuncionario_SC;
    }

    public void setFirmaFuncionario_SC(String firmaFuncionario_SC) {
        this.firmaFuncionario_SC = firmaFuncionario_SC;
    }

    public String getFirmaDirector_SC() {
        return firmaDirector_SC;
    }

    public void setFirmaDirector_SC(String firmaDirector_SC) {
        this.firmaDirector_SC = firmaDirector_SC;
    }

    public String getFirmaAdminM_SC() {
        return firmaAdminM_SC;
    }

    public void setFirmaAdminM_SC(String firmaAdminM_SC) {
        this.firmaAdminM_SC = firmaAdminM_SC;
    }
}
