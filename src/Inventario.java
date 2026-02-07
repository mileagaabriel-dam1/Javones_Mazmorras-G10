import java.util.ArrayList;

public class Inventario {

	    private ArrayList<Equipamiento> equipamientos;
	    //Array private para los equipamientos
	
	    public Inventario() {
	        this.equipamientos = new ArrayList<>();
	    }
	    //Creamos arraylist para los equipamientos

	    //Codigo para añadir equipamiento al inventario
	    public void agregarEquipamiento(Equipamiento equipamiento) {
	        this.equipamientos.add(equipamiento);
	        System.out.println("Equipamiento agregado: " + equipamiento.getNombre());
	    }
	    
	    //Codigo para mostrar el contenido del inventario
	    public void mostrarInventario() {
	        System.out.println("INVENTARIO: ");
	        
	        if (equipamientos.isEmpty()) {
	            System.out.println("El inventario está vacío.");
	            
	            //Se mostrara inventario vacio en caso de que lo este
	            
	        } else {
	            System.out.println("Objetos en el inventario (" + equipamientos.size() + "):");
	            for (int i = 0; i < equipamientos.size(); i++) {
	                Equipamiento item = equipamientos.get(i);
	                System.out.println((i + 1) + ". " + item.getNombre() + " - Tipo: " + item.getTipo());
	            }
	            
	            //Si el iventario contiene equipamientos, mostrarlos por pantalla.
	        }
	    }
	    
	    public ArrayList<Equipamiento> getEquipamientos() {
	        return equipamientos;
	        
	        //Esto es un array para recibir los equipamientos ordenados en el inventario
	    }
	}

