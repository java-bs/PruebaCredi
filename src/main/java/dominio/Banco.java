package dominio;

public class Banco {
    private static Banco instancia;  
    private final String codigo;

    private Banco(String codigo) {
        this.codigo = codigo;
    }
    
    public static Banco obtenerBanco(){
        if(instancia == null){
            instancia = new Banco("SNZ");
            return instancia;
        } else {
            return instancia;
        }    
    }

    // setter no se puede 
    public String getCodigo() {
        return codigo;
    }
    
    public static String convertirAString() {
        return "Banco " + instancia.codigo;
    }
    
    public static Banco obtener(String codigo){
         if(instancia == null){
            return instancia = new Banco(codigo);
        }else{
            return instancia;
        }
    }
    
}
