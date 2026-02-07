public class Ladron extends PERSONAJE {
	
	//Ladron tiene referencia en PERSONAJE
	
    private boolean invisible;
    
    public Ladron(String nombre) {
        super(nombre);
        this.invisible = false;
    }
    
    //Cogemos el nombre de la clase ladron, y su estado de invisibilidad.
    
    public Ladron(String nombre, boolean invisibleInicial) {
        super(nombre);
        this.invisible = invisibleInicial;
    }

}