/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_carlosbonilla;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author calot
 */
public class Lab3P2_CarlosBonilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemones = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("Bienvenido a Pokemon Olancho");
        ArrayList<Integer> numeroSerieBolas = new ArrayList();
        ArrayList<Integer> numeroSeriePoke = new ArrayList();
        do {
            int aguaSpeed=0;
            int fuerzaFire=0;
            boolean puedeNadar=false;
            int dominioGrass=0;
            String habitat="";
            int NSerie;
            String naturalezaPoke="";
            int elegirPoke;
            boolean serieValida;
            System.out.println("1. crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar todos los pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    do {
                        System.out.println("Que tipo de pokemon desea crear?");
                    System.out.println("1. tipo fuego");
                    System.out.println("2. tipo agua");
                    System.out.println("3. tipo hierba");
                    elegirPoke=sc.nextInt();
                        if (elegirPoke>3&&elegirPoke<1) {
                            System.out.println("Elegir una opcion valida");
                        }
                    } while (elegirPoke>3&&elegirPoke<1);
                    
                    do {
                        System.out.println("Elegir el numero de la pokedex que este pokemon va a tomar");
                        serieValida=true;
                        NSerie = sc.nextInt();
                        for (int i = 0; i < numeroSeriePoke.size(); i++) {
                            if (NSerie == numeroSeriePoke.get(i)) {
                                serieValida = false;
                            }
                        }
                        if (serieValida == false) {
                            System.out.println("El numero de serie ya pertenece a otro pokemon");
                        }
                    } while (serieValida = false);
                    System.out.println("Ingrese el nombre del pokemon");
                    String nombrePoke = input.nextLine();
                    System.out.println("Ingrese la naturaleza del pokemon (ej:timido, energetico, misterioso");
                    naturalezaPoke = input.nextLine();
                    if (elegirPoke == 1) {
                        System.out.println("Ingrese el nivel de potencia de las llamas de este pokemon");
                        fuerzaFire=sc.nextInt();
                    } else if (elegirPoke == 2) {
                        System.out.println("Ingrese la velocidad acuatica de este pokemon");
                        aguaSpeed = sc.nextInt();
                        System.out.println("Puede este pokemon estar fuera del agua sin morir? S/N");
                        String fueraDelAgua = input.nextLine();
                        if (fueraDelAgua.charAt(0) == 's' || fueraDelAgua.charAt(0) == 'S') {
                            puedeNadar = true;
                        } else {
                            puedeNadar = false;
                        }
                    } else if (elegirPoke == 3) {
                        System.out.println("Ingrese el habitad de este pokemon");
                        habitat = input.nextLine();
                        do {
                            System.out.println("Ingrese el nivel de dominio sobre la hierba que tiene este pokemon (0-100");
                            dominioGrass = sc.nextInt();
                            if (dominioGrass > 100 || dominioGrass < 0) {
                                System.out.println("Ingrese un valor entre 0 a 100");
                            }
                        } while (dominioGrass > 100 || dominioGrass < 0);
                    }
                    if (elegirPoke == 1) {
                        Pokemon pokemon=new FireType(fuerzaFire,NSerie,nombrePoke,naturalezaPoke);
                        pokemones.add(pokemon);
                    } else if (elegirPoke == 2) {
                        Pokemon pokemon=new WaterType(aguaSpeed,puedeNadar,NSerie,nombrePoke,naturalezaPoke);
                        pokemones.add(pokemon);
                    } else if (elegirPoke == 3) {
                        Pokemon pokemon=new GrassType(dominioGrass,habitat,NSerie,nombrePoke,naturalezaPoke);
                        pokemones.add(pokemon);
                    }
                    System.out.println("Su pokemon a sido añadido con exito,Intenta atraparlo!");
                    break;
                case 2:
                    System.out.println("Ingrese el nivel de efectividad de la pokebola (del 1 al 3, si se elige un valor mayor a 3, este sera tomado como 3, si es menor a 1 sera tomado como 1");
                    int probabilidad=sc.nextInt();
                    if(probabilidad>3){
                        probabilidad=2;
                    }else if(probabilidad<1){
                        probabilidad = 0;
                    } else {
                        probabilidad -= 1;
                    }
                    do {
                        System.out.println("Ingrese el numero de serie de la pokebola");
                        serieValida=true;
                        NSerie = sc.nextInt();
                        for (int i = 0; i < numeroSerieBolas.size(); i++) {
                            if (NSerie == numeroSerieBolas.get(i)) {
                                serieValida = false;
                            }
                        }
                        if (serieValida == false) {
                            System.out.println("El numero de serie ya pertenece a otra pokebola");
                        }
                    } while (serieValida = false);
                    numeroSerieBolas.add(NSerie);
                    System.out.println("Ingrese el color de la pokebola");
                    String color = input.nextLine();
                    Pokebola pokeball = new Pokebola(probabilidad, color, NSerie);

                    break;
                case 3:
                    System.out.println("POKEMONES TIPO FUEGO");
                    for (Pokemon p : pokemones) {
                        if (p instanceof FireType) {
                            System.out.println(p);
                        }
                    }
                    for (Pokemon p : pokemones) {
                        if (p instanceof WaterType) {
                            System.out.println(p);
                        }
                    }
                    for (Pokemon p : pokemones) {
                        if (p instanceof GrassType) {
                            System.out.println(p);
                        }
                    }
                    break;
            }
        } while (menu != 0);

    }

}
