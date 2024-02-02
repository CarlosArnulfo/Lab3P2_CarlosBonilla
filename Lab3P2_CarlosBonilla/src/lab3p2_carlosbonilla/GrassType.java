/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carlosbonilla;

/**
 *
 * @author calot
 */
public class GrassType extends Pokemon{
    int dominioGrass;
    String habitat;
    public GrassType(int dominioGrass,String habitat,int entrada, String name, String naturaleza) {
        super(entrada, name, naturaleza);
        this.dominioGrass = dominioGrass;
        this. habitat=habitat;
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

    public int getDominioGrass() {
        return dominioGrass;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setDominioGrass(int dominioGrass) {
        this.dominioGrass = dominioGrass;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
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
    return "\nNumero de la Pokedex: "+entrada+" | Nombre: "+name+" | naturaleza: "+naturaleza+" | Ha sido atrapado? "+estado+" | habitat: "+habitat+" | nivel de dominio de la hierba: "+dominioGrass;
}
}
