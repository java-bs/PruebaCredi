package dominio;
import java.math.BigDecimal;
import java.util.Arrays;

public class Cliente {
    
    private int dni = 0;
    private String nombreApellido;
    private BigDecimal ingresos;
    private Prestamo[] prestamo;
    private int cuentaBancaria;
    private DocumentoDigital[] documentoDigital;
    private Domicilio domicilio;
    private String nombre;

    public Cliente(){
        System.out.println("Creación Cliente");
    }
    
    
    public String toString(){
        return " DNI: " + this.dni +
           " // Nombre y Apellido: " + this.nombreApellido +
           " // Ingresos: " +  this.ingresos +
           " // Cuenta bancaria: " + this.cuentaBancaria +
           " // Documentos: " + this.documentoDigital +
           " // Domicilio: " + this.domicilio +
           " // Prestamo : " + this.prestamo;
    }
    
    public Cliente(String nombreNuevo){
        System.out.println("Creación Cliente: " +  nombreNuevo);
        this.nombre = nombreNuevo;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public DocumentoDigital[] getDocumentoDigital() {
        return documentoDigital;
    }

    public void setDocumentoDigital(DocumentoDigital[] documentoDigital) {
        this.documentoDigital = documentoDigital;
    }
    
    public Prestamo[] getPrestamo() {
        return prestamo;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setPrestamo(Prestamo[] prestamo) {
        this.prestamo = prestamo;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    public void cambiarDomicilio(String nuevoDomicilio){               
    }
    
    public void actualizarIngresos(byte nuevoDocumento, double nuevoMonto){      
    } 

    public void setPrestamo(Prestamo miPrestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
