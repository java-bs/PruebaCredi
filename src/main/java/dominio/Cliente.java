package dominio;

public class Cliente {
    
    public int dni = 0;
    public String nombreApellido;
    public double ingresos;
    public int prestamo[];
    public int cuentaBancaria;
    public byte dniDigitalizado;
    public String domicilio;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }  

    public int[] getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int[] prestamo) {
        this.prestamo = prestamo;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public byte getDniDigitalizado() {
        return dniDigitalizado;
    }

    public void setDniDigitalizado(byte dniDigitalizado) {
        this.dniDigitalizado = dniDigitalizado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }    
         
    public void cambiarDomicilio(String nuevoDomicilio){               
    }
    
    public void actualizarIngresos(byte nuevoDocumento, double nuevoMonto){      
    } 
    
}
