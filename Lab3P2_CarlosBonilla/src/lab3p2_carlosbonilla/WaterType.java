/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carlosbonilla;

/**
 *
 * @author calot
 */
public class WaterType extends Pokemon{
    int aguaSpeed;
    boolean puedeNadar;

    public WaterType(int aguaSpeed, boolean puedeNadar, int entrada, String name, String naturaleza) {
        super(entrada, name, naturaleza);
        this.aguaSpeed = aguaSpeed;
        this.puedeNadar = puedeNadar;
    }

    public void setAguaSpeed(int aguaSpeed) {
        this.aguaSpeed = aguaSpeed;
    }

    public void setPuedeNadar(boolean puedeNadar) {
        this.puedeNadar = puedeNadar;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setAtrapadoCon(Pokebola atrapadoCon) {
        this.atrapadoCon = atrapadoCon;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public int getAguaSpeed() {
        return aguaSpeed;
    }

    public boolean isPuedeNadar() {
        return puedeNadar;
    }

    public int getEntrada() {
        return entrada;
    }

    public String getName() {
        return name;
    }

    public boolean isEstado() {
        return estado;
    }

    public Pokebola getAtrapadoCon() {
        return atrapadoCon;
    }

    public String getNaturaleza() {
        return naturaleza;
    }
    
    @Override
    public String toString(){
    return "\nNumero de la Pokedex: "+entrada+" | Nombre: "+name+" | naturaleza: "+naturaleza+" | Ha sido atrapado? "+estado+" | Puede nadar? "+puedeNadar+" | Velocidad acuatica: "+aguaSpeed;
}
    
}   

