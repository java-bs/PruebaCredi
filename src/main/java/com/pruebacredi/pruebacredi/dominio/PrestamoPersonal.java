package com.pruebacredi.pruebacredi.dominio;

import java.math.BigDecimal;

public class PrestamoPersonal extends Prestamo{

    private String situacionVeraz;
    
    public PrestamoPersonal(Banco banco, BigDecimal monto, int cantidadCuotas) {
        super(banco, monto, cantidadCuotas);
    }    

 
    @Override
    public void imprimirDatos(){
        System.out.println("Impresión: " + "monto del préstamo = " + monto +
                ", plazo = " + plazoEnMeses + ", cantidad de cuotas = " + 
                cantidadCuotas + ", Fecha Acreditacion: " + fechaAcreditacion + 
                ". Color de impresión: " + COLORDEFAULT );
        
    };
}
