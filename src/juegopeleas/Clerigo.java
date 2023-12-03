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
        System.out.println(this.Nombre+" hace un ataque con su mazo...");
        super.atacar(oponente);
        int dañoInflingido = this.getAtk() - oponente.getDef();
        int nuevoHp = oponente.getHp() - dañoInflingido;
        oponente.setHp(nuevoHp);
        System.out.println("El oponente ha perdido "+ dañoInflingido +" de vida");
        
    }
    @Override
    public void ataqueEspecial(Luchador oponente){
        System.out.println(this.Nombre+" invoca la ira sagrada");
        super.ataqueEspecial(oponente);
        int dañoInflingido = (this.atk * 2);
        int nuevoHp = oponente.getHp() - dañoInflingido;
         System.out.println("El oponente ha perdido "+ dañoInflingido +" de vida");
        oponente.setHp(nuevoHp);
        this.reducirMana();
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
    public void mostrar(){
        System.out.println("NOMBRE: "+this.Nombre);
        System.out.println("HP: " +this.hp);
        System.out.println("ATK: " +this.atk);
        System.out.println("MANA: "+this.mana);
    }

    public void reducirMana( ){
        int reduccion;
        reduccion = this.mana - 20;
        setMana(reduccion);
        }
    
    @Override
    public void Atributo(){
        if (this.hp<1000) {
            System.out.println(this.Nombre+" Realiza una sanacion forticiada");
            int nuevoHp = this.hp +80;
            setHp(nuevoHp);
            int nuevoDef = this.def +10;
            setDef(nuevoDef);
            this.reducirMana();
        }else if (this.hp == 1000) {
            System.out.println("Salud al maximo no se puede sanar");
        }
    }
    @Override
    public void Pasivo(){
        int dadoDaño = 0;
        dadoDaño = (int)(Math.random()*(20-1+1))+1;
        if (dadoDaño >= 10) {
            
        System.out.println(this.Nombre+" Invoca la Ira de los abernos");
        int nuevoAtk = this.atk + 60;
        setAtk(nuevoAtk);
        int nuevoMana = this.mana - 40;
        setMana(nuevoMana);
        System.out.println("EL daño de "+this.Nombre+" sube un total de "+nuevoAtk);
        System.out.println(nuevoMana+" Mana gastado");
        } else {
            System.out.println("Fallo la invocacion");
        }
    }
     
}
