package juegopeleas;

public class Nigromante extends Luchador {
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
    public void atacar(Luchador oponente) {
        
        System.out.println(this.Nombre+" hace un ataque con su guadaña...");
        super.atacar(oponente);
        int dañoInflingido = this.getAtk() - oponente.getDef();
        int nuevoHp = oponente.getHp() - dañoInflingido;
        oponente.setHp(nuevoHp);
        System.out.println("El oponente ha perdido "+ dañoInflingido +" de vida");
        
    }

    public void reducirMana( ){
        int reduccion;
        reduccion = this.mana - 20;
        setMana(reduccion);
        }

    @Override
    public void mostrar(){
        System.out.println("NOMBRE:"+this.Nombre);
        System.out.println("HP: "+this.hp);
        System.out.println("ATK: "+this.atk);
        System.out.println("MANA: "+this.mana);
    }

    @Override
    public void ataqueEspecial(Luchador oponente){
        System.out.println(this.Nombre+" Lanza rafaga de sangre");
        int dañoInflingido = (this.atk + 100);
        int nuevoDaño = oponente.getHp() - dañoInflingido;
        oponente.setHp(nuevoDaño);
        int nuevoHp = this.hp + 50;
        setHp(nuevoHp);
        this.reducirMana(); 
        System.out.println("El oponente pierde "+dañoInflingido+" de vida y el nigromante absorbe 50 de vida del daño hecho");
    }

    @Override
    public void Atributo(){
        if (this.hp<1000){
        System.out.println(this.Nombre+" usa su magia oscura he invoca el resguardo mortal");
        int nuevoHp = this.hp + 100;
        setHp(nuevoHp);
        int nuevoDef = this.def + 20;
        setDef(nuevoDef);
        System.out.println("La salud del nigromante sube "+ nuevoHp+" y su defensa sube "+ nuevoDef);
        }else if (this.hp==1000) {
            System.out.println("Salud al maximo imposible usar invocacion");
        }
    }

    @Override
    public void Pasivo(){
        System.out.println(this.Nombre+" Usa pacto de sangre y obtiene una armadura de hueso");
        int nuevoDef = this.def + 50;
        setDef(nuevoDef);
        int nuevoAtk = this.atk + 20;
        setAtk(nuevoAtk);
        int nuevoDaño = this.hp - 50;
        setHp(nuevoDaño);
        System.out.println(this.Nombre+" refuerza su ataque y su defensa a cambio de 50 de su sangre");
    }
}
