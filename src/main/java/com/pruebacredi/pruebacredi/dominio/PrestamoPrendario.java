
package com.pruebacredi.pruebacredi.dominio;

import java.math.BigDecimal;

public class PrestamoPrendario extends Prestamo implements ImprimirDatos{
    
    private Garantia garantia;

    public PrestamoPrendario(Banco banco, BigDecimal monto, int cantidadCuotas) {
        super(banco, monto, cantidadCuotas);
    }    

    public Garantia getGarantia() {
        return garantia;
    }

    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Impresión: PRESTAMO PRENDARIO");       
    };


    
    
}
