package br.edu.iftm.trab02.exercicios;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Atv03 {
    public static void main(String[] args) {
        System.out.println("Atividade 03");

        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(8);
        inteiros.add(4);
        inteiros.add(5);
        inteiros.add(8);
        inteiros.add(5);
        inteiros.add(7);
        inteiros.add(7);

        System.out.println("Números de séries duplicados: " + inteiros.toString()); // Simulação de que a lista fosse
                                                                                    // uma adição de números de séries
                                                                                    // de produtos em um sistema
        System.out.println("Números de séries duplicados removidos: " + removerElementos(inteiros));
    }

    public static Set<Integer> removerElementos(ArrayList<Integer> inteiros) { // Removendo elementos repetidos
        Set<Integer> listaNaoRepetida = new LinkedHashSet<>(inteiros);
        return listaNaoRepetida;
    }
}
