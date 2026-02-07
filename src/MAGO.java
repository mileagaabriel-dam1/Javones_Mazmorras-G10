public class MAGO extends PERSONAJE {
	
	//Esto es lo que hace es indicar que "MAGO" tiene referencia en "PERSONAJE"

	private int mana;
    
    // Constructor
    public MAGO(String nombre) {
        super(nombre);
        this.mana = 100;
        
    }
    //Cogemos el "MAGO" de PERSONAJE, el nombre y le asignamos un valor a mana.
    
    public MAGO(String nombre, int manaInicial) {
        super(nombre);
        this.mana = manaInicial;
    }
    
    public void lanzarHechizo(int costeMana) {
        if (costeMana <= mana) {
            mana -= costeMana;
            System.out.println(getNombre() + " lanza un hechizo que consume " + costeMana + " puntos de maná.");
            System.out.println("Maná restante: " + mana);
        } else {
            System.out.println(getNombre() + " intenta lanzar un hechizo pero no tiene suficiente maná.");
            System.out.println("Maná necesario: " + costeMana + ", Maná disponible: " + mana);
        }
    }
    
    //La parte de los hechizos, si hay suficiente mana, se gastara, sino la hay se mostrara por pantalla la que se necesita.
