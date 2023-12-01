/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopeleas;

/**
 *
 * @author APRENDIZ
 */
public class Clerigo extends Luchador {
    
    private String Nombre;
    private int hp;
    private int atk;
    private int def;
    private int mana;

    public Clerigo(String Nombre, int hp, int atk, int def, int mana) {
        this.Nombre = Nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.mana = mana;
    }

    @Override
    public void atacar(Luchador oponente) {
        System.out.println("Clerigo hace un ataque con su mazo...");
        super.atacar(oponente);
        int dañoInflingido = this.getAtk() - oponente.getDef();
        int nuevoHp = oponente.getHp() - dañoInflingido;
        oponente.setHp(nuevoHp);
        System.out.println("El oponente ha perdido "+ dañoInflingido +" de vida");
        
    }

    
    public String getNombre() {
        return Nombre;
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

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    

    
    public void DobleAtaque() {
        System.out.println("Doble Ataque...");   
    }

    
    public void ReforzarDefensa() {
        System.out.println("Reforzando Defensa...");
    }

    
    public void Desangrar() {
        System.out.println("Desangrando...");
    }

    
    public void Curar() {
        System.out.println("Curando...");   
    }

    
    public void Drenar() {
        System.out.println("Drenando..."); 
    }

    
    public void AtaqueHielo() {
        System.out.println("Ataque de hielo...");
    }

    
    public void AtaqueFuego() {
        System.out.println("Ataque de fuego...");
    }

    
    public void BurbujaDefensa() {
        System.out.println("Burbuja de Defensa Activada...");
    }

    
    public void Frenesi() {
        System.out.println("Frenesi activado...");
    }
    
    public void mostrar(){
        System.out.println("NOMBRE: "+this.Nombre);
        System.out.println("HP: " +this.hp);
        System.out.println("ATK: " +this.atk);
        System.out.println("DEF: "+this.def);
        System.out.println("MANA: "+this.mana);
    }

    public int DadoTurno(){
        int resul = (int)(Math.random()*(20-1+1));
        return resul;
    }

  
    
     public void enfrentarse2(){
        int turnoClerigo=DadoTurno();
        int turnoMago=DadoTurno();
     }
}
