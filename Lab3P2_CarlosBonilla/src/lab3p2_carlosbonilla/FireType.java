/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carlosbonilla;

/**
 *
 * @author calot
 */
public class FireType extends Pokemon {

    protected int fuegoPower;

    public FireType(int fuegoPower, int entrada, String name, String naturaleza) {
        super(entrada, name, naturaleza);
        this.fuegoPower = fuegoPower;
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

    public void setFuegoPower(int fuegoPower) {
        this.fuegoPower = fuegoPower;
    }

    public int getFuegoPower() {
        return fuegoPower;
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
    return "\nNumero de la Pokedex: "+entrada+" | Nombre: "+name+" | naturaleza: "+naturaleza+" | Ha sido atrapado? "+estado+" | Nivel de poder de llama: "+fuegoPower;
}
}
