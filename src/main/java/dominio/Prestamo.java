
package dominio;

import java.math.BigDecimal;

public abstract class Prestamo implements ImprimirDatos {
    public BigDecimal monto;
    public int plazoEnMeses;    
    public int cantidadCuotas;
    public BigDecimal tasa;
    public byte [] documentos;
    public Banco banco;

   
    @Override
    public String toString() {
        return "Prestamo{" + "monto=" + monto + ", plazoEnMeses=" + plazoEnMeses +
               ", cantidadCuotas=" + cantidadCuotas + ", tasa=" + tasa + 
               ", documentos=" + documentos + '}';
    }

    @Override
    public void imprimirDatos(){
        System.out.println("Impresión: " + "monto del préstamo = " + monto +
                ", plazo = " + plazoEnMeses + ", cantidad de cuotas = " + 
                cantidadCuotas + ". Color de impresión: " + COLORDEFAULT );
        
    };
    
    public Prestamo(Banco banco, BigDecimal monto, int cantidadCuotas) {
        this.banco = banco;
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;
    }
    
    public BigDecimal getMonto() {
        return monto;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public byte[] getDocumentos() {
        return documentos;
    }

 //   private void setMonto(BigDecimal monto) {
 //       this.monto = monto;
 //   }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

//    public void setCantidadCuotas(int cantidadCuotas) {
//        this.cantidadCuotas = cantidadCuotas;
//    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public void setDocumentos(byte[] documentos) {
        this.documentos = documentos;
    }
    
    public boolean cancelarCuotas(int cantidad){               
        boolean proceso = false;
        return proceso;
    }
     
    public void cancelarPrestamo(){               
    }
    
}
