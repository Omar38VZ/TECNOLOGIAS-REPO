public class Tripulacion {
    private String piloto; 
    private String codigo;

    public Tripulacion(String codigo, String piloto) {
        this.codigo = codigo;
        this.piloto = piloto;
    }
    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    } 
    @Override 
    public String toString(){ 
        return piloto + "(" + codigo + ")"; 
    }
    
}
