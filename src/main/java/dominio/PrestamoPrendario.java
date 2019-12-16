
package dominio;

import java.math.BigDecimal;

public class PrestamoPrendario extends Prestamo{
    
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
    
}
