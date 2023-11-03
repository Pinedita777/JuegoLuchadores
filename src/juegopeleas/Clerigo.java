/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopeleas;

/**
 *
 * @author APRENDIZ
 */
public class Clerigo implements Skills,Magias {
    
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
    

    @Override
    public void Escapar() {
        System.out.println("Escapando...");  
    }

    @Override
    public void Atacar() {
        System.out.println("Atacando...");    
    }

    @Override
    public void DobleAtaque() {
        System.out.println("Doble Ataque...");   
    }

    @Override
    public void ReforzarDefensa() {
        System.out.println("Reforzando Defensa...");
    }

    @Override
    public void Desangrar() {
        System.out.println("Desangrando...");
    }

    @Override
    public void Curar() {
        System.out.println("Curando...");   
    }

    @Override
    public void Drenar() {
        System.out.println("Drenando..."); 
    }

    @Override
    public void AtaqueHielo() {
        System.out.println("Ataque de hielo...");
    }

    @Override
    public void AtaqueFuego() {
        System.out.println("Ataque de fuego...");
    }

    @Override
    public void BurbujaDefensa() {
        System.out.println("Burbuja de Defensa Activada...");
    }

    @Override
    public void Frenesi() {
        System.out.println("Frenesi activado...");
    }
    
}
