public class PERSONAJE {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean protegido;
    private Inventario inventario;
    
    public PERSONAJE(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntosVida = 100;
        this.protegido = false;
        this.inventario = new Inventario();
    }
    // Método para mostrar información del personaje
    public void mostrarInfo() {
        System.out.println("Informacion del PERSONAJE:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Puntos de Vida: " + this.puntosVida);
        System.out.println("Protegido: " + (this.protegido ? "Sí" : "No"));
    }
    
    //Se muestra por pantalla el nombre, nivel, la vida actual y si esta protegido o no
    
    public void bajarVida(int cantidad) {
        if (this.protegido) {
            cantidad = cantidad / 2;
            System.out.println(nombre + " está protegido. Daño reducido a la mitad: " + cantidad);
        }
    //En caso de que le ataquen si esta protegido el daño se reduce a la mitad
        
        this.puntosVida -= cantidad;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
        
        System.out.println(nombre + " ha recibido " + cantidad + " puntos de daño. Vida restante: " + this.puntosVida);
    }
    public void curar(int cantidad) {
        this.puntosVida += cantidad;
        System.out.println(nombre + " ha sido curado por " + cantidad + " puntos. Vida actual: " + this.puntosVida);
        
    }
    
    //Si se le decide curar, mostrarlo por pantalla y la vida que se ha recuperado.
    
    public Inventario getInventario() {
        return this.inventario;
    }
    
    //Mirar el inventario
    
    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.inventario.agregarEquipamiento(equipamiento);
    }

    //Agregar equipamiento al inventario
    
    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
        System.out.println(nombre + " está " + (protegido ? "protegido" : "desprotegido"));
    }

    //Aqui se cambia el estado del personaje
    
    public boolean estaProtegido() {
        return this.protegido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

}

//Declaramos la vida, nivel, nombre, etc.