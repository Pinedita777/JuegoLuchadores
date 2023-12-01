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

        
        
         

        // Elegir quien empieza primero
        

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

        //Realizar enfrentamiento

        enfrentarLuchadores(personajePrincipal, oponente);  

    }

    private static Luchador seleccionarLuchador(int seleccion) {
        switch (seleccion) {
            case 1:
                return new Clerigo("Juana De arco", 1000, 150, 100, 180);
            case 2:
                return new Mago("Gandalf", 1000, 180, 100, 250);
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
    private static void enfrentarLuchadores(Luchador personaje1, Luchador personaje2) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Enfrentamiento!");
        System.out.println("Selecciona el ataque de "+personaje1.getClass().getSimpleName() + ":");
        System.out.println("1. Ataque basico");
        System.out.println("2. Ataque especial");

        int seleccionAtaque2 = scanner.nextInt();
        realizarAtaque(personaje2, personaje1, seleccionAtaque2);
        
       
    }
     
    private static void realizarAtaque(Luchador atacante, Luchador objetivo, int seleccionAtaque){
        while (atacante.getHp()>0 && objetivo.getHp()>0) {

         int dl1=0, dl2=0;

        dl1 =(int)(Math.random()*(20-1+1))+1;
        dl2 =(int)(Math.random()*(20-1+1))+1;

        System.out.println("Tiro de dados para turno.....");
        System.out.println("Dado de personaje 1: "+dl1);
        System.out.println("Dado de personaje 2: "+dl2);
        System.out.println(" ");

        if (dl1>dl2) {
           
           System.out.println("Gano el turno el personaje 1");

        switch (seleccionAtaque) {
            case 1:
                atacante.atacar(objetivo);
                break;
            case 2:
                atacante.ataqueEspecial(objetivo);
                break;
            default:
                break;
        }
    }
    else if(dl2>dl1){
    System.out.println("Gano el turno el personaje 2 ");
     Luchador temp = atacante;
            atacante = objetivo;
            objetivo = temp;

            switch (seleccionAtaque) {
            case 1:
                atacante.atacar(objetivo);
                break;
            case 2:
                atacante.ataqueEspecial(objetivo);
                break;
            default:
                break;
        }

    }

        
           
            
        
    }
}
    
}
