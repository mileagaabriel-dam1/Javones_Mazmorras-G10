public class Equipamiento {

	private String nombre;
    private String tipo;
    
    //Nombre y tipo del equipamiento
    
    public Equipamiento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    //Metodo para recibir el nombre del equipamiento
    
    public String getTipo() {
        return tipo;
    }
    //Y este para recibir el tipo de equipamiento
}
