package dominio;

import java.util.Date;

public class DocumentoDigital {
    public String nombre;
    public Date fechaDeCarga;    
    public Byte imagen;

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeCarga() {
        return fechaDeCarga;
    }

    public Byte getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeCarga(Date fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public void setImagen(Byte imagen) {
        this.imagen = imagen;
    }

    
    
}
