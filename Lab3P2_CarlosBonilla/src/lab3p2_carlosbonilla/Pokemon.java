/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carlosbonilla;

/**
 *
 * @author calot
 */
import java.util.Random;

public class Pokemon {

    protected int entrada;
    protected String name;
    protected boolean estado;
    protected Pokebola atrapadoCon;
    protected String naturaleza;

    public Pokemon(int entrada, String name, String naturaleza) {

        this.name = name;
        this.estado = false;
        this.atrapadoCon = null;
        this.entrada = entrada;
        this.naturaleza = naturaleza;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setAtrapadoCon(Pokebola atrapadoCon) {
        this.atrapadoCon = atrapadoCon;
    }

    public String getName() {
        return name;
    }

    public int getEntrada() {
        return entrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public boolean isEstado() {
        return estado;
    }

    public Pokebola getAtrapadoCon() {
        return atrapadoCon;
    }

    @Override
    public String toString() {
        return "";
    }

    public boolean Capturar(Pokebola pokeball) {
        Random captura = new Random();
        int capturado = captura.nextInt(2);
        if (pokeball.getProbabilidad() >= capturado) {
            System.out.println(this.getName() + "a sido capturado con exito!");
            this.setAtrapadoCon(pokeball);
            return true;
        } else {
            System.out.println("La pokebola no a tenido efecto!");
            return false;
        }

    }
}
