package dominio;

import java.math.BigDecimal;

public class PrestamoPersonal extends Prestamo{

    private String situacionVeraz;
    
    public PrestamoPersonal(Banco banco, BigDecimal monto, int cantidadCuotas) {
        super(banco, monto, cantidadCuotas);
    }    
 
    
}
