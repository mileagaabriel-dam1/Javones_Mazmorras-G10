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
    
}
