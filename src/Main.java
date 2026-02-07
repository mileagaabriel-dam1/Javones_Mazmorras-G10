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
        
        scanner.close();
    }
    
    private static PERSONAJE seleccionarPersonaje(Scanner scanner, PERSONAJE[] personajes) {
        System.out.println("Estos son los personajes disponibles: ");
        for (int i = 0; i < personajes.length; i++) {
            System.out.println((i+1) + ". " + personajes[i].getNombre() + 
                             " (" + personajes[i].getClass().getSimpleName() + ")");
        }
        System.out.print("Elige un personaje (1-" + personajes.length + "): ");
        int seleccion = scanner.nextInt() - 1;
        
        if (seleccion >= 0 && seleccion < personajes.length) {
            System.out.println("Has seleccionado: " + personajes[seleccion].getNombre() + "adelante");
            return personajes[seleccion];
        }
        System.out.println("Esto creo que te lo has inventado eh");
        return null;
    }
    
    private static void accionesEspeciales(Scanner scanner, PERSONAJE personaje) {
        System.out.println("Acciones especiales disponibles");
        
        if (personaje instanceof MAGO) {
            MAGO mago = (MAGO) personaje;
            System.out.println("1. Lanzar hechizo");
            System.out.println("2. Recargar maná");
            System.out.print("Opción: ");
            int op = scanner.nextInt();
            
            //Opciones para el mago "League of Legends"
            
            
            if (op == 1) {
                System.out.print("Coste de maná: ");
                int coste = scanner.nextInt();
                mago.lanzarHechizo(coste);
            } else if (op == 2) {
                System.out.print("Cantidad a recargar: ");
                int cantidad = scanner.nextInt();
                mago.recargarMana(cantidad);
            }
            
            //Dependiendo de la seleccion o se gastara mana o se recargara
            
        } else if (personaje instanceof Guerrero) {
            Guerrero guerrero = (Guerrero) personaje;
            System.out.println("1. Proteger a alguien");
            System.out.println("2. Dejar de proteger");
            System.out.print("Opción: ");
            int op = scanner.nextInt();
            
            //Ponemos las opciones del guerrero
            
            if (op == 1) {
                PERSONAJE protegido = new PERSONAJE("Aliado");
                guerrero.proteger(protegido);
            } else if (op == 2) {
                guerrero.dejarDeProteger();
            }
            
            //En caso de que se escoja la opcion 1 sera aliado, sino se dejara de proteger.
            
        } else if (personaje instanceof Ladron) {
            Ladron ladron = (Ladron) personaje;
            System.out.println("1. Robar");
            System.out.println("2. Hacerse invisible");
            System.out.println("3. Hacerse visible");
            System.out.print("Opción: ");
            int op = scanner.nextInt();
            
            //Opciones para el ladron
            
            if (op == 1) {
                ladron.robar();
            } else if (op == 2) {
                ladron.hacerseInvisible();
            } else if (op == 3) {
                ladron.hacerseVisible();
                
                //Robar, invisible, visible... etc
            }
        }
    }
}