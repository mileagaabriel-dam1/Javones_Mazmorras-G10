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

}
