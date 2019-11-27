package dominio;

public class DocumentoDigital {
    public String nombre;
    public int fechaDeCarga;    
    public Byte imagen;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeCarga() {
        return fechaDeCarga;
    }

    public Byte getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeCarga(int fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public void setImagen(Byte imagen) {
        this.imagen = imagen;
    }

    
    
}
