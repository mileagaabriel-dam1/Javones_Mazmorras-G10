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
        
        // Proteger al nuevo compañero
        this.compañeroProtegido = compañero;
        compañero.setProtegido(true);
        
        System.out.println(getNombre() + " ahora está protegiendo a " + compañero.getNombre());
        
        //Si se decide proteger a alguien, mostrar a quien
    }
    
    // Método para dejar de proteger
    public void dejarDeProteger() {
        if (this.compañeroProtegido != null) {
            System.out.println(getNombre() + " deja de proteger a " + compañeroProtegido.getNombre());
            compañeroProtegido.setProtegido(false);
            this.compañeroProtegido = null;
        } else {
            System.out.println(getNombre() + " no estaba protegiendo a nadie.");
        }
    }
    
    //Aqui se hace el codigo para dejar de proteger a alguien si se elige esa opcion, sino protegia a nadie, mostrarlo.
    
    public PERSONAJE estaProtegiendo() {
        return compañeroProtegido;
    }
    
    
    public void mostrarInfo() {
        System.out.println("La informacion del guerrero:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Puntos de Vida: " + getPuntosVida());
        
        
        //Cogemos toda la informacion del guerrero, nombre, su nivel y la vida actual.
        
        if (compañeroProtegido != null) {
            System.out.println("Protegiendo a: " + compañeroProtegido.getNombre());
        } else {
            System.out.println("Protegiendo a: Nadie");
        }
        
        //Se muestra por pantalla si esta protegiendo a alguien, si lo esta, mostrar a quien, sino, indicar que ni protege a nadie.
        
        System.out.println("Estado protección personal: " + (estaProtegido() ? "Sí" : "No"));
        
        //Se muestra por pantalla si el personaje esta protegido o no
    }
}