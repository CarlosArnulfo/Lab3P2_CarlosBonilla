/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_carlosbonilla;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
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
        ArrayList<Pokebola> pokeballs = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("Bienvenido a Pokemon Olancho");
        ArrayList<Integer> numeroSerieBolas = new ArrayList();
        ArrayList<Integer> numeroSeriePoke = new ArrayList();
        do {
            int aguaSpeed = 0;
            int fuerzaFire = 0;
            boolean puedeNadar = false;
            int dominioGrass = 0;
            String habitat = "";
            int NSerie;
            String naturalezaPoke = "";
            int elegirPoke;
            boolean serieValida;
            System.out.println("1. Crear Pokemon");
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
                        elegirPoke = sc.nextInt();
                        if (elegirPoke > 3 && elegirPoke < 1) {
                            System.out.println("Elegir una opcion valida");
                        }
                    } while (elegirPoke > 3 && elegirPoke < 1);

                    do {
                        System.out.println("Elegir el numero de la pokedex que este pokemon va a tomar");
                        serieValida = true;
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
                        fuerzaFire = sc.nextInt();
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
                        Pokemon pokemon = new FireType(fuerzaFire, NSerie, nombrePoke, naturalezaPoke);
                        pokemones.add(pokemon);
                    } else if (elegirPoke == 2) {
                        Pokemon pokemon = new WaterType(aguaSpeed, puedeNadar, NSerie, nombrePoke, naturalezaPoke);
                        pokemones.add(pokemon);
                    } else if (elegirPoke == 3) {
                        Pokemon pokemon = new GrassType(dominioGrass, habitat, NSerie, nombrePoke, naturalezaPoke);
                        pokemones.add(pokemon);
                    }
                    System.out.println("Su pokemon a sido añadido con exito,Intenta atraparlo!");
                    break;
                case 2:
                    System.out.println("Ingrese el nivel de efectividad de la pokebola (del 1 al 3, si se elige un valor mayor a 3, este sera tomado como 3, si es menor a 1 sera tomado como 1");
                    int probabilidad = sc.nextInt();
                    if (probabilidad > 3) {
                        probabilidad = 2;
                    } else if (probabilidad < 1) {
                        probabilidad = 0;
                    } else {
                        probabilidad -= 1;
                    }
                    do {
                        System.out.println("Ingrese el numero de serie de la pokebola");
                        serieValida = true;
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
                    pokeballs.add(pokeball);

                    break;
                case 3:
                    System.out.println("POKEMONES TIPO FUEGO");
                    for (int i = 0; i < pokemones.size(); i++) {
                        if (pokemones.get(i) instanceof FireType) {
                            System.out.println(i + ". " + pokemones.get(i));
                        }
                    }
                    System.out.println("");
                    System.out.println("POKEMONES TIPO AGUA:");
                    for (int i = 0; i < pokemones.size(); i++) {
                        if (pokemones.get(i) instanceof FireType) {
                            System.out.println(i + ". " + pokemones.get(i));
                        }
                    }
                    System.out.println("");
                    System.out.println("POKEMONES TIPO HIERBA:");
                    for (int i = 0; i < pokemones.size(); i++) {
                        if (pokemones.get(i) instanceof FireType) {
                            System.out.println(i + ". " + pokemones.get(i));
                        }
                    }
                    break;
                case 4:
                    do {
                        System.out.println("Que tipo de pokemon desea eliminar?");
                        System.out.println("1. tipo fuego");
                        System.out.println("2. tipo agua");
                        System.out.println("3. tipo hierba");
                        elegirPoke = sc.nextInt();
                        if (elegirPoke > 3 && elegirPoke < 1) {
                            System.out.println("Elegir una opcion valida");
                        }
                    } while (elegirPoke > 3 && elegirPoke < 1);
                    if (elegirPoke == 1) {
                        for (int i = 0; i < pokemones.size(); i++) {
                            if (pokemones.get(i) instanceof FireType) {
                                System.out.println(i + ". " + pokemones.get(i));
                            }
                        }
                    }
                    if (elegirPoke == 2) {
                        for (int i = 0; i < pokemones.size(); i++) {
                            if (pokemones.get(i) instanceof FireType) {
                                System.out.println(i + ". " + pokemones.get(i));
                            }
                        }
                    }
                    if (elegirPoke == 3) {
                        for (int i = 0; i < pokemones.size(); i++) {
                            if (pokemones.get(i) instanceof FireType) {
                                System.out.println(i + ". " + pokemones.get(i));
                            }
                        }
                    }
                    System.out.println("Elija el pokemon que quiera eliminar");
                    int elegirPokemon = sc.nextInt();
                    if (elegirPoke == 1) {
                        if (pokemones.get(elegirPokemon) instanceof FireType && elegirPokemon < pokemones.size() && elegirPokemon >= 0) {
                            pokemones.remove(elegirPokemon);
                        } else {
                            System.out.println("Ese pokemon no es tipo fuego");
                        }

                    }
                    if (elegirPoke == 2) {
                        if (pokemones.get(elegirPokemon) instanceof WaterType && elegirPokemon < pokemones.size() && elegirPokemon >= 0) {
                            pokemones.remove(elegirPokemon);
                        } else {
                            System.out.println("Ese pokemon no es tipo agua");
                        }

                    }
                    if (elegirPoke == 3) {
                        if (pokemones.get(elegirPokemon) instanceof GrassType && elegirPokemon < pokemones.size() && elegirPokemon >= 0) {
                            pokemones.remove(elegirPokemon);
                        } else {
                            System.out.println("Ese pokemon no es tipo hierba");
                        }

                    }
                    break;
                case 5:
                    int elegirBola = 0;
                    if (pokeballs.size() != 0 && pokemones.size() != 0) {
                        Random faust = new Random();
                        int pokemonAAtrapar = faust.nextInt(pokemones.size());
                        System.out.println("Un " + pokemones.get(pokemonAAtrapar).getName() + " salvaje a aparecido!");
                        System.out.println("Que vas a hacer?");
                        do {
                            System.out.println("0. Huir");
                            System.out.println("1. Atraparlo");
                            elegirBola=sc.nextInt();
                        } while (elegirBola != 0 && elegirBola != 1);
                        switch (elegirBola) {
                            case 0:
                                System.out.println("Has huido del enfrentamiento");
                                break;
                            case 1:
                                System.out.println("Que pokebola vas a usar?");
                                for (int i = 0; i < pokeballs.size(); i++) {
                                    System.out.println(i+". "+pokeballs.get(i));
                                }
                                int pokebolaAUsar=sc.nextInt();
                                if (pokebolaAUsar<0||pokebolaAUsar>pokeballs.size()) {
                                    System.out.println("Ese valor no es valido");
                                }else{
                                    pokemones.get(pokemonAAtrapar).Capturar(pokeballs.get(pokebolaAUsar));
                                    pokeballs.remove(pokebolaAUsar);
                                }
                                break;

                        }

                    } else {
                        System.out.println("no tiene suficientes pokebolas o pokemones para realizar esta accion");
                        System.out.println("(pro tip: intenta usar las opciones de crear mas pokemones y mas pokebolas para volver aqui a usarlos)");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el pokemon al que le quiere cambiar atributos");
                    int pokemonCambioAtributos=sc.nextInt();
                    if (pokemonCambioAtributos>pokemones.size()||pokemonCambioAtributos<0) {
                        System.out.println("Ese valor no es valido");
                    }else{
                        if (pokemones.get(pokemonCambioAtributos).isEstado()==false) {
                            System.out.println("Ese pokemon no a sido capturado");
                        }else{
                            System.out.println("Elija que atributos quiere cambiar al pokemon");
                            System.out.println("1. Nombre");
                            System.out.println("2. entrada en la pokedex");
                            if (pokemones.get(pokemonCambioAtributos) instanceof FireType) {
                                System.out.println("3. potencia de llamas");
                            } else if (pokemones.get(pokemonCambioAtributos) instanceof WaterType) {
                                System.out.println("3. si puede o no vivir fuera del agua");
                            }else if (pokemones.get(pokemonCambioAtributos) instanceof GrassType) {
                                System.out.println("3. habitat");
                            }
                            int elegirQueCambiar=sc.nextInt();
                            switch(elegirQueCambiar){
                                case 1:
                                    System.out.println("Ingrese el nombre nuevo de su pokemon");
                                    String nombreNuevo = input.nextLine();
                                    pokemones.get(pokemonCambioAtributos).setName(nombreNuevo);
                                    break;
                                case 2:
                                    int nuevaEntrada;
                                    boolean verificarNuevaEntrada = true;
                                    do {
                                        verificarNuevaEntrada = true;
                                        System.out.println("Ingrese la nueva entrada de la pokedex que quiere que tenga este pokemon");
                                        nuevaEntrada = sc.nextInt();
                                        for (int i = 0; i < numeroSeriePoke.size(); i++) {
                                            if (nuevaEntrada == numeroSeriePoke.get(i)) {
                                                verificarNuevaEntrada = false;
                                            }
                                        }
                                        if (verificarNuevaEntrada == false) {
                                            System.out.println("El numero de serie ya pertenece a otro pokemon");
                                        }
                                    } while (verificarNuevaEntrada = false);

                                    break;
                                case 3:
                                    System.out.println("Opcion en mantenimiento, desgraciadamente el tiempo de desarrollo dado por nintendo no fue el suficiente para poder completar esta parte del juego");
                                    System.out.println("street fighter y tekken >>>>>> bodrio kombat");
                                    break;
                            }
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese un valor valido");
                            
            }
        } while (menu != 0);
        System.out.println("Muerte a Gamefreak");
    }

}
