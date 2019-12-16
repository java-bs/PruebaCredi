package com.pruebacredi.pruebacredi;

import dominio.Banco;
import dominio.Cliente;
import dominio.Prestamo;
import dominio.PrestamoPersonal;
import dominio.PrestamoPrendario;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
      //  System.out.println("Hola Mundo!");
      
     Banco bancoSaenz = Banco.obtenerBanco();
     System.out.println("Banco : " + Banco.convertirAString());
      
     Banco.obtener("Banco 1");
     System.out.println("Banco: " + Banco.convertirAString());

     Banco.obtener("Banco 2");
     System.out.println("Banco " + Banco.convertirAString());
      
     BigDecimal elMonto = new BigDecimal("15500.20"); 
     Prestamo miPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 12);             
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
     
     PrestamoPersonal miPrestamoPersonal = new PrestamoPersonal(bancoSaenz, elMonto, 12);
     miPrestamoPersonal.getMonto();
    // miPrestamoPersonal.getMonto();
     
     Prestamo[] prestamoDelCliente = {miPrestamo, miPrestamoPersonal};
     cliente.setPrestamo(prestamoDelCliente);
     //cliente.getPrestamo()[1]= miPrestamo;
     
     System.out.println("Cliente creado : " + cliente.toString());
     System.out.println("Prestamo creado: " + miPrestamo.toString());
     
     

     
   }
    
}
