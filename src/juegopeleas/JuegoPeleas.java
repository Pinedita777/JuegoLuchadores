/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegopeleas;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class JuegoPeleas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        System.out.println("Bienvenido al juego de luchadores");

        Scanner sc = new Scanner(System.in);

        System.out.println("Elige tu personaje...");

        System.out.println("1. Clerigo");
        System.out.println("2. Mago");
        System.out.println("3. Barbaro");
        System.out.println("4. Nigromante");

        int seleccionPrincipal = sc.nextInt();
        Luchador personajePrincipal = seleccionarLuchador(seleccionPrincipal);

        System.out.println("Selecciona tu oponente...");
        System.out.println("1. Clerigo");
        System.out.println("2. Mago");
        System.out.println("3. Barbaro");
        System.out.println("4. Nigromante");

        int seleccionOponente = sc.nextInt();
        Luchador oponente = seleccionarLuchador(seleccionOponente);

        // Realizar enfrentamiento
        enfrentarLuchadores(personajePrincipal, oponente, sc);

        sc.close();
    }

    private static Luchador seleccionarLuchador(int seleccion) {
        switch (seleccion) {
            case 1:
                return new Clerigo("Juana De arco", 1000, 150, 100, 180);
            case 2:
                return new Mago("Gandalf", 1000, 180, 100, 260);
            case 3:
                return new Barbaro("Kratos", 1000, 200, 100);
            case 4:
                return new Nigromante("Geralt", 1000, 200, 100, 200);
            default:
                System.out.println("Selección no válida.");
                break;
        }
        return null;
    }

    private static void enfrentarLuchadores(Luchador personaje1, Luchador personaje2, Scanner scanner) {
        System.out.println("¡Enfrentamiento!");
        
        while (personaje1.getHp() > 0 && personaje2.getHp() > 0) {
            // Turno del personaje 1
            realizarTurno(personaje1, personaje2, scanner);

            // Verificar si el oponente ha sido derrotado después del turno del personaje 1
            if (personaje2.getHp() <= 0) {
                System.out.println(personaje2.getClass().getSimpleName() + " ha sido derrotado. ¡Victoria para "
                        + personaje1.getClass().getSimpleName() + "!");
                break;
            }

            // Turno del personaje 2
            realizarTurno(personaje2, personaje1, scanner);

            // Verificar si el oponente ha sido derrotado después del turno del personaje 2
            if (personaje1.getHp() <= 0) {
                System.out.println(personaje1.getClass().getSimpleName() + " ha sido derrotado. ¡Victoria para "
                        + personaje2.getClass().getSimpleName() + "!");
                break;
            }
        }
    }

    private static void realizarTurno(Luchador atacante, Luchador objetivo, Scanner scanner) {
        System.out.println("Turno de " + atacante.getClass().getSimpleName() + ". Elige el ataque:");
        System.out.println("1. Ataque normal");
        System.out.println("2. Ataque especial");
        System.out.println("3. Atributo");
        System.out.println("4. Pasivo");
    
        int seleccionAtaque = scanner.nextInt();
    
        
        if (seleccionAtaque == 1) {
            atacante.atacar(objetivo);
            System.out.println(" ");
            objetivo.mostrar();
        } else if (seleccionAtaque == 2) {
            atacante.ataqueEspecial(objetivo);
            System.out.println(" ");
            objetivo.mostrar();
        }else if (seleccionAtaque == 3) {
            atacante.Atributo();
            System.out.println(" ");
            atacante.mostrar();
        } else if (seleccionAtaque == 4) {
            atacante.Pasivo();
            System.out.println(" ");
            atacante.mostrar();
        }
        else {
            System.out.println("Selección no válida.");
        }
    }
}
