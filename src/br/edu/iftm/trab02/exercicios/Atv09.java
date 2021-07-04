package br.edu.iftm.trab02.exercicios;

import java.util.Stack;

public class Atv09 {
    public static void main(String[] args) {
        System.out.println("Exercício 09");

        Stack<Integer> pilha = new Stack<>();

        pilha.add(100);
        pilha.add(101);
        pilha.add(102);
        pilha.add(103);
        pilha.add(104);

        System.out.println("Pilha ordenada: " + pilha.toString());
        invertePilha(pilha);
        System.out.println("Pilha invertida: " + pilha.toString());

    }

    public static Stack<Integer> invertePilha(Stack<Integer> pilha) {

        Stack<Integer> pilhaInvertida = new Stack<>();

        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilhaInvertida.add(pilha.get(i));
        }
        pilha.clear();
        for (int i = 0; i < pilhaInvertida.size(); i++) {
            pilha.add(pilhaInvertida.get(i));
        }
        return pilha;
    }
}
