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

    //Este codigo se ha hecho para decidir si robar, visible o invisible.
    
    public void hacerseInvisible() {
        if (!invisible) {
            invisible = true;
            System.out.println(getNombre() + " se desvanece en las sombras y se hace invisible.");
        } else {
            System.out.println(getNombre() + " ya está invisible.");
        }
    }
    
    //Metodo para que el ladron se haga invisible.

    public void hacerseVisible() {
        if (invisible) {
            invisible = false;
            System.out.println(getNombre() + " vuelve a ser visible.");
        } else {
            System.out.println(getNombre() + " ya está visible.");
        }
    }

    //En caso de que se quiera hacer visible, hacemos el codigo arriba.
    
    public boolean estaInvisible() {
        return invisible;
    }
    
    //Esto es para saber si esta invisible o no.

    public void mostrarInfo() {
        System.out.println("La informacion del ladron: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Puntos de Vida: " + getPuntosVida());
        System.out.println("Invisible: " + (invisible ? "Sí" : "No"));
        System.out.println("Protegido: " + (estaProtegido() ? "Sí" : "No"));
    }
    
    //Se muestra el nombre, nivel, la vida actual, el estado si esta invisible o no, y si esta protegido por alguien o no lo esta.

}