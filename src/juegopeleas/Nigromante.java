package juegopeleas;

public class Nigromante implements Magias {
    private String Nombre;
    private int hp;
    private int atk;
    private int def;
    private int mana;
    
    public Nigromante(String nombre, int hp, int atk, int def, int mana) {
        Nombre = nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.mana = mana;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
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
    public void Curar() {
        
        System.out.println( "Curar");
    }
    @Override
    public void Drenar() {
        
        System.out.println("Drenar");
    }
    @Override
    public void AtaqueHielo() {
        
         System.out.println();
    }
    @Override
    public void AtaqueFuego() {
        
         System.out.println();
    }
    @Override
    public void BurbujaDefensa() {
        
        System.out.println();
    }
    public void mostrar(){
        System.out.println("NOMBRE:"+this.Nombre);
        System.out.println("HP: "+this.hp);
        System.out.println("ATK: "+this.atk);
        System.out.println("DEF: "+this.def);
        System.out.println("DES: "+this.mana);
    }

    
}
