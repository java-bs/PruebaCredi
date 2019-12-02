package com.pruebacredi.pruebacredi;

import dominio.Cliente;
import dominio.Prestamo;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
      //  System.out.println("Hola Mundo!");
      
     Prestamo miPrestamo = new Prestamo();
     miPrestamo.setCantidadCuotas(12);     
     BigDecimal elMonto = new BigDecimal("15500.20");
     miPrestamo.setMonto(elMonto);
     miPrestamo.setPlazoEnMeses(36);     
     BigDecimal laTasa = new BigDecimal("15.50");
     miPrestamo.setTasa(laTasa);
     
     Cliente cliente = new Cliente();     
     cliente.setDni(95713515);
     cliente.setNombreApellido("Catherine Beschorner");
     cliente.setCuentaBancaria(15512145);
     //cliente.setDomicilio(domicilio);
     BigDecimal elIngreso = new BigDecimal(20000);
     cliente.setIngresos(elIngreso);
     //cliente.setPrestamo(miPrestamo);
     //cliente.setDocumentoDigital(documentoDigital); 
     
     System.out.println("Cliente creado : " + cliente.toString());
     System.out.println("Prestamo creado: " + miPrestamo.toString());
   }
    
}
