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
    public void GritoDeGuerra() {
        System.out.println("*Grito De Guerra*...");  
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
    
    public void mostrar(){
        System.out.println("NOMBRE: "+this.Nombre);
        System.out.println("HP: " +this.hp);
        System.out.println("ATK: " +this.atk);
        System.out.println("DEF: "+this.def);
        System.out.println("DES: "+this.mana);
    }

    public int DadoTurno(){
        int resul = (int)(Math.random()*(20-1+1));
        return resul;
    }

    public void enfrentarse1(){
        int turnoClerigo=DadoTurno();
        int turnoclerigo=DadoTurno();

        Clerigo Cl1 = new Clerigo(Nombre, 160, 80, 70, 150);
        Clerigo Cl2 = new Clerigo(Nombre, 160, 80, 70, 150);

        System.out.println("Dado Jugador: "+turnoClerigo);
        System.out.println("Dado Enemigo: "+turnoclerigo);
    if (turnoClerigo>turnoclerigo) {
         Cl2.hp=Cl2.hp-(Cl1.atk-Cl2.def);
         Cl2.mostrar();
         }
    else if (turnoClerigo<turnoclerigo) {
         Cl1.hp=Cl1.hp-(Cl2.atk-Cl1.def);
         Cl1.mostrar();
    }    
    }
    
     public void enfrentarse2(){
        int turnoClerigo=DadoTurno();
        int turnoMago=DadoTurno();
     }
}
