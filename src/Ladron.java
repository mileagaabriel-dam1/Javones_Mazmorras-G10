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

    public void robar() {
        if (invisible) {
            System.out.println(getNombre() + " Estas robando, estas invisible, pero ten cuidado!");
            System.out.println("Felicidades, has robado sin ser detectado");
        } else {
            System.out.println(getNombre() + "Recuerda que eres visible!, decides robar.");
            System.out.println("Te han atrapado, ser visible no es nada facil.");
        }
    }

}