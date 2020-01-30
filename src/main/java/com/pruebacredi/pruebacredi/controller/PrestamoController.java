package com.pruebacredi.pruebacredi.controller;
import com.pruebacredi.pruebacredi.dominio.Banco;
import com.pruebacredi.pruebacredi.dominio.Prestamo;
import com.pruebacredi.pruebacredi.dominio.PrestamoPersonal;
import com.pruebacredi.pruebacredi.dominio.PrestamoPrendario;
import java.math.BigDecimal;
import java.time.LocalDate;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestamoController {
    @RequestMapping(method = GET, path = "/prestamos/{numero}")
    public List<Prestamo> obtenerPrestamos(@PathVariable Integer numero) {

        Banco bancoSaenz = Banco.obtenerBanco();

        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 6);
        miPrimerPrestamo.setFechaAcreditacion(LocalDate.of(2019, 10, 20));

        Prestamo miSegundoPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 12);

        PrestamoPrendario miPrestamoHipotecario = new PrestamoPrendario(bancoSaenz, elMonto, 30);
        miPrestamoHipotecario.setFechaAcreditacion(LocalDate.of(2020, 11, 1));

        Prestamo[] prestamosDelCliente = {
            miPrimerPrestamo,
            miSegundoPrestamo,
            miPrestamoHipotecario};
        return asList(prestamosDelCliente);
    }

}
