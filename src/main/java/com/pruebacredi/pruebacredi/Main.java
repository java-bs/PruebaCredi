package com.pruebacredi.pruebacredi;

import com.pruebacredi.pruebacredi.dominio.Banco;
import com.pruebacredi.pruebacredi.dominio.Cliente;
import com.pruebacredi.pruebacredi.dominio.Prestamo;
import com.pruebacredi.pruebacredi.dominio.PrestamoPersonal;
import com.pruebacredi.pruebacredi.dominio.PrestamoPrendario;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
        
@SpringBootApplication
@ComponentScan(basePackages= {"com.pruebacredi.pruebacredi"})
public class Main {
     
   public static void main(String[] parametros) {       
        SpringApplication.run(Main.class, parametros);
        

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
     miPrestamo.setFechaAcreditacion(LocalDate.of(2019, 7, 29));
     miPrestamo.setFechaAdjudicacion(LocalDate.of(2019, 7, 30));
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
    // miPrestamoPersonal.setFechaAcreditacion(LocalDate.of(2019, 9, 14));
     miPrestamoPersonal.setFechaAdjudicacion(LocalDate.of(2019, 9, 18));
     
    // miPrestamoPersonal.getMonto();
    
     BigDecimal elMonto2 = new BigDecimal(24000); 
     PrestamoPrendario miPrestamoPrendario = new PrestamoPrendario(bancoSaenz, elMonto2, 18);
     miPrestamoPrendario.setFechaAcreditacion(LocalDate.of(2020, 2, 11));
     miPrestamoPrendario.setFechaAdjudicacion(LocalDate.of(2019, 2, 8));
               
     Prestamo[] prestamoDelCliente = {miPrestamo, miPrestamoPersonal, miPrestamoPrendario};
     cliente.setPrestamo(prestamoDelCliente);
     //cliente.getPrestamo()[1]= miPrestamo;
     
     System.out.println("Cliente creado : " + cliente.toString());
     //System.out.println("Prestamo creado: " + miPrestamo.toString());
              
     ArrayList<Prestamo> arrayList = new ArrayList();
     arrayList.add(miPrestamo);
     arrayList.add(miPrestamoPersonal);
     arrayList.add(miPrestamoPrendario);        
     cliente.imprimirDatos();
     
     //FuzzyScore m = new FuzzyScore(Locale.US, Locale.US);
     //FuzzyScore g = score.fuzzyScore("Hello", "Hel", Locale.US);
     //System.out.println(g);
     
     FuzzyScore fuzzyScore = new FuzzyScore(Locale.US);
     Integer puntos = fuzzyScore.fuzzyScore("Programación", "Programsion");
     System.out.println(puntos);
     }
    
    
}
