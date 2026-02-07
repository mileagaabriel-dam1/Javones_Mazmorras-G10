import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Javones y Mazmorras");
        
        // Crear personajes disponibles
        PERSONAJE[] personajes = {
            new PERSONAJE("Aragorn"),
            new MAGO("Gandalf"),
            new Guerrero("Conan"),
            new Ladron("Lupin")
        };
        
        PERSONAJE personajeActual = null;
        int opcion;
        
        do {
            System.out.println("Menu");
            System.out.println("1. Seleccionar personaje");
            System.out.println("2. Ver info del personaje");
            System.out.println("3. Ver inventario");
            System.out.println("4. Acciones especiales");
            System.out.println("5. Listar todos los personajes");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    personajeActual = seleccionarPersonaje(scanner, personajes);
                    break;
                case 2:
                    if (personajeActual != null) {
                        personajeActual.mostrarInfo();
                    } else {
                        System.out.println("Selecciona un personaje primero");
                    }
                    break;
                case 3:
                    if (personajeActual != null) {
                        personajeActual.getInventario().mostrarInventario();
                    } else {
                        System.out.println("Selecciona un personaje primero");
                    }
                    break;
                case 4:
                    if (personajeActual != null) {
                        accionesEspeciales(scanner, personajeActual);
                    } else {
                        System.out.println("Selecciona un personaje primero");
                    }
                    break;
                case 5:
                    for (int i = 0; i < personajes.length; i++) {
                        System.out.println((i+1) + ". " + personajes[i].getNombre() + 
                                         " (" + personajes[i].getClass().getSimpleName() + ")");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esta opcion no es valida");
            }
        } while (opcion != 0);
      