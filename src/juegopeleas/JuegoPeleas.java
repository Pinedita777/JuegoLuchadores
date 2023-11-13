/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegopeleas;

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
        // TODO code application logic here
        int DT=0;
        Clerigo Cl= new Clerigo("Pedro",160,80,70,150);
        
        Mago Ma= new Mago("Gandalf",140,120,50,200);
      
        Barbaro Ba= new Barbaro("Kratos",200,100,100);
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Selecciona tu Rol...");
        System.out.println("1. Clerigo ");
        System.out.println("2. Mago ");
        System.out.println("3. Barbaro ");
        System.out.println("4. Nigromante ");
        int Luchador1 = sc.nextInt();
        
        System.out.println("Selecciona tu contrincante");
        System.out.println("1. Clerigo");
        System.out.println("2. Mago");
        System.out.println("3. Barbaro");
        System.out.println("4. Nigromante");
        int Luchador2 = sc.nextInt();
        
        switch (Luchador1) {
            case 1:
                // Lógica del Luchador 1
                switch (Luchador2) {
                    case 1:
                    
                        // Lógica de enfrentamiento entre Clerigo y Clerigo
                        while (Cl.getHp()>0 && Cl.getHp()>0) {
                            
                        }
                        break;
                    case 2:
                        // Lógica de enfrentamiento entre Clerigo y Mago
                        break;
                    case 3:
                        //logica de enfrentamiento entre Clerigo y barbaro
                    case 4:
                        //logica de enfrentamiento entre Clerigo y nigromante
                        break;
                    default:
                        System.out.println("Selección inválida para el Jugador");
                        break;
                         }
                break;
            case 2:
                // Lógica del Luchador2
                switch (Luchador1) {
                    case 1:
                        // Lógica de enfrentamiento entre Mago y Clerigo
                        break;
                    case 2:
                        // Lógica de enfrentamiento entre Mago y Mago
                        break;
                    case 3:
                        //logica de enfrentamiento entre Mago y Barbaro
                        break;
                    case 4:
                        //logica de enfrentamiento entre Mago y nigromante
                        break;
                    default:
                        System.out.println("Seleccion invalida para el contrincante.");
                        break;
                }
            case 3:
                switch (Luchador1) {
                    case 1:
                        //logica Barbaro y Clerigo
                        break;
                    case 2:
                        //logica Barbaro y Mago
                        break;
                    case 3:
                        // logica Barbaro y Barbaro
                        break;
                    case 4:
                        //logica Barbaro y Nigromante  
                        break;                
                    default:
                        break;
                } 
                
                break;

            case 4:
                switch (Luchador2) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            default:
                System.out.println("Seleccion invalida para el primer luchador.");
                break;}
        
        
        
        
       
    }
    
}
