public class MAGO extends PERSONAJE {
	
	//Esto es lo que hace es indicar que "MAGO" tiene referencia en "PERSONAJE"

	private int mana;
    
    // Constructor
    public MAGO(String nombre) {
        super(nombre);
        this.mana = 100;
        
    }
    //Cogemos el "MAGO" de PERSONAJE, el nombre y le asignamos un valor a mana.
 