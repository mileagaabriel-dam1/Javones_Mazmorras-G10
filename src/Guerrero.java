public class Guerrero extends PERSONAJE {
	
	//Se muestra que Guerrero tiene referencia en PERSONAJE
	
    private PERSONAJE compañeroProtegido;
    
    public Guerrero(String nombre) {
        super(nombre);
        this.compañeroProtegido = null;
    }
    
    //Cogemos la clase, su nombre y le ponemos el estado actual de 
    
    // Método para proteger a un compañero
    public void proteger(PERSONAJE compañero) {
        // Si ya está protegiendo a alguien, primero lo deja de proteger
        if (this.compañeroProtegido != null) {
            dejarDeProteger();
        }
 