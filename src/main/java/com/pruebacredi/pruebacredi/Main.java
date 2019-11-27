package com.pruebacredi.pruebacredi;

import dominio.Prestamo;

public class Main {

    public static void main(String[] args) {
      //  System.out.println("Hola Mundo!");
      
      Prestamo prestamo1 = new Prestamo();
      prestamo1.cantidadCuotas = 12;
      prestamo1.monto = 15000.20;
      prestamo1.plazoEnMeses = 36;
      prestamo1.tasa = 0.05;  
        
    }
    
}
