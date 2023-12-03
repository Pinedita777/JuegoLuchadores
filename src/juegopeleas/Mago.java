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
    @Override
    public void mostrar(){
        System.out.println("NOMBRE:"+this.Nombre);
        System.out.println("HP: "+this.hp);
        System.out.println("ATK: "+this.atk);
        System.out.println("MANA: "+this.mana);
    }
     @Override
    public void atacar(Luchador oponente) {
        
        System.out.println("Mago hace un hechizo de daño...");
        super.atacar(oponente);
        int dañoInflingido = this.getAtk() - oponente.getDef();
        int nuevoHp = oponente.getHp() - dañoInflingido;
        oponente.setHp(nuevoHp);
        System.out.println("El oponente ha perdido "+ dañoInflingido +" de vida");
        
    }

    @Override
    public void ataqueEspecial(Luchador oponente){
        System.out.println(this.Nombre + " Realiza un Hechizo de fuego ");
        super.ataqueEspecial(oponente);
        int dañoInflingido = (this.atk * 2);
        int nuevoHp = oponente.getHp() - dañoInflingido;
        this.reducirMana();
        System.out.println("El mago ha consumido 20 de su mana " + getMana());
        System.out.println("El oponente ha sido quemado y recibe " + dañoInflingido + " de daño");
        oponente.setHp(nuevoHp);
    }

    public void reducirMana( ){
    int reduccion;
    reduccion = this.mana - 20;
    setMana(reduccion);
    if (this.mana==0) {
        
    }
    }
    @Override
    public void Atributo(){
        if (this.hp<1000) {
        System.out.println(this.Nombre + " Realiza un hechizo de curacion");
        int nuevoHp = this.hp + 100;
        setHp(nuevoHp);
        this.reducirMana();
        }else if (this.hp==1000) {
            System.out.println("Salud al maximo no se puede curar");
        } 
    }
    @Override
    public void Pasivo(){
        if (this.mana<260) {
         System.out.println(this.Nombre+" Ejecuta su afinidad magica"); 
         int nuevoMana = this.mana + 20;
         setMana(nuevoMana);
         int nuevoAtk = this.atk + 10;
         setAtk(nuevoAtk);  
        }else if (this.mana==260){
            System.out.println("El mago no puede ejecutar su afinidad magica todavia");
        }
    }
}
