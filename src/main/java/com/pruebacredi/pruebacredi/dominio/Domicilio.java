package com.pruebacredi.pruebacredi.dominio;

public class Domicilio {
    public String calle;
    public int numero;    
    public String piso;
    public String provincia;

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
