/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopeleas;

/**
 *
 * @author APRENDIZ
 */
public class Mago extends Luchador {
    
    private String Nombre;
    private int hp;
    @Override
    public void atacar(Luchador oponente) {
        
        super.atacar(oponente);
    }
    private int atk;
    private int def;
    private int mana;

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

    public Mago(String Nombre, int hp, int atk, int def, int mana) {
        this.Nombre = Nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.mana = mana;
    }

    
    public void Curar() {
        System.out.println("Curando...");
        this.hp +=25;
        this.mana-=10;

    }

    
    public void Drenar() {
    }

    
    public void AtaqueHielo() {
        System.out.println("Ataque de hielo...");
        
    }

    
    public void AtaqueFuego() {
        System.out.println("Ataque de fuego...");
    }

    
    public void BurbujaDefensa() {
        System.out.println("Burbuja de defensa activada...");
    }
    public void mostrar(){
        System.out.println("NOMBRE:"+this.Nombre);
        System.out.println("HP: "+this.hp);
        System.out.println("ATK: "+this.atk);
        System.out.println("DEF: "+this.def);
        System.out.println("MANA: "+this.mana);
    }
    
}
