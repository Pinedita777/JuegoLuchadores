/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopeleas;

/**
 *
 * @author APRENDIZ
 */
public class Barbaro extends Luchador {
    
    private String Nombre;
    private int hp;
    private int atk;
    private int def;

    public String getNombre() {
        return Nombre;
    }

    @Override
    public void atacar(Luchador oponente) {
        
        System.out.println("El Barbaro hace un ataque con su gran hacha...");
        super.atacar(oponente);
        int dañoInflingido = this.getAtk() - oponente.getDef();
        int nuevoHp = oponente.getHp() - dañoInflingido;
        oponente.setHp(nuevoHp);
        System.out.println("El oponente ha perdido "+ dañoInflingido +" de vida");
        
    }
    @Override
    public void ataqueEspecial(Luchador oponente){
        System.out.println(this.Nombre+"Entra en frenesi y realiza varios ataques en cadena");
        super.ataqueEspecial(oponente);
        int nuevoHp = oponente.getHp() - this.atk * 3;
         System.out.println("El oponente ha perdido"+nuevoHp+" de vida");
        
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Barbaro(String Nombre, int hp, int atk, int def) {
        this.Nombre = Nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    
    public void GritoDeGuerra() {
        System.out.println("Escapando...");
    }

    
    public void Atacar() {
        System.out.println("Atacando...");
    }

    
    public void DobleAtaque() {
        System.out.println("Doble Ataque...");
    }

    
    public void ReforzarDefensa() {
        System.out.println("Reforzando defensa...");
    }

    
    public void Desangrar() {
        System.out.println("Desangrando...");
    }

    
    
    public void mostrar(){
        System.out.println("NOMBRE: "+this.Nombre);
        System.out.println("HP: "+this.hp);
        System.out.println("ATK: "+this.atk);
        System.out.println("DEF: "+this.def);
        
    }
}
