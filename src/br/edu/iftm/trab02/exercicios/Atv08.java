package br.edu.iftm.trab02.exercicios;

import java.util.Stack;

import br.edu.iftm.trab02.testes.Fibonacci;

public class Atv08 {
    public static void main(String[] args) {
        System.out.println("Atividade 08");

        Stack<Integer> pilha = new Stack<>();
        Fibonacci fibo = new Fibonacci();

        for (int i = 0; i < 13; i++) {
            pilha.push(fibo.fibonacci(i));
        }

        System.out.println(pilha.toString());
    }
}
