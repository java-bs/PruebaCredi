package com.pruebacredi.pruebacredi.dominio;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    
     public String toString() {            
        String cadena = "Cliente{" + "dni=" + dni + ", nombreApellido=" + nombreApellido +
                ", ingresos=" + ingresos + ", prestamo=" + prestamo +
                ", cuentaBancaria=" + cuentaBancaria + ", documentoDigital=" + 
                documentoDigital + ", domicilio=" + domicilio + ", nombre=" + nombre + '}';
        return cadena;        
    }    

    public void imprimirDatos(){
       System.out.println("Cliente{" + "dni=" + dni + ", nombreApellido=" + nombreApellido);
     //  for ( int i=0; i<this.prestamo.length; i++ ) {
     
     LocalDate date = LocalDate.now();
          List<Prestamo> li = Arrays.asList(prestamo);
         
     List<Prestamo> listaFiltrada = li.stream()
        //  .filter(pres -> pres.getFechaAcreditacion().isAfter(LocalDate.of(2019, 2, 11)))            
            .filter(pres -> pres.getFechaAcreditacion() != null)            
            .filter(pres -> pres.getFechaAcreditacion().isBefore(date))            
            .collect(Collectors.toList());
     
      listaFiltrada.sort(Comparator.comparing(Prestamo::getFechaAcreditacion));
       for (Prestamo prestamo : listaFiltrada) {
         prestamo.imprimirDatos();          
       }                                

    //   for (Prestamo prestamo : this.prestamo) {
    //     prestamo.imprimirDatos();          
    // }                
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
    
}
