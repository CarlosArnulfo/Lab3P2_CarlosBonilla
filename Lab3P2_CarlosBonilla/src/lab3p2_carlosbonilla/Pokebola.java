/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carlosbonilla;

/**
 *
 * @author calot
 */
public class Pokebola {
    protected int probabilidad;
    protected String color;
    protected int serie;

    public Pokebola(int probabilidad, String color, int serie) {
        this.probabilidad = probabilidad;
        this.color = color;
        this.serie = serie;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public String getColor() {
        return color;
    }

    public int getSerie() {
        return serie;
    }
    @Override
    public String toString(){
        return "Pokebola de serie: "+serie+" | Probabilidad de atrapar: "+probabilidad+1+" | color "+color+" | ";
               
    }
}
