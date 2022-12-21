package com.gestion.permisos.util.paginacion;

public class PageItem {
    private int numero;
    private Boolean actual;

    public PageItem(int numero, Boolean actual) {
        super();
        this.numero = numero;
        this.actual = actual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getActual() {
        return actual;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }
}
