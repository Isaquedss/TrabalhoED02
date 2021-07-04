package br.edu.iftm.trab02.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atv02 {
    public static void main(String[] args) {
        System.out.println("Atividade 02");

        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(8);
        inteiros.add(12);
        inteiros.add(3);
        inteiros.add(5);
        inteiros.add(10);
        inteiros.add(7);
        inteiros.add(9);
        inteiros.add(16);
        int xMaior = 4;

        System.out.println("Números pares: " + numerosPares(inteiros));
        System.out.println("Maior valor: " + maiorValor(inteiros));
        System.out.println("Menor valor: " + valorMenor(inteiros));
        System.out.println("A posição do maior valor: " + posicaoMaior(inteiros));
        System.out.println("A posição do menor valor: " + posicaoMenor(inteiros));
        System.out.println("A quantidade de números com valor maior do que x: " + valorMaior(inteiros, xMaior));
        System.out.println("Soma da lista: " + somaLista(inteiros));
    }

    public static int numerosPares(List<Integer> list) {
        int qtdPares = 0;
        int valor = 0;
        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i);
            if (valor % 2 == 0) {
                qtdPares++;
            }
        }
        return qtdPares;
    }

    public static int maiorValor(List<Integer> list) {
        int maiorValor = 0;
        maiorValor = Collections.max(list);
        return maiorValor;
    }

    public static int valorMenor(List<Integer> list) {
        int valorMenor = 0;
        valorMenor = Collections.min(list);
        return valorMenor;
    }

    public static int posicaoMaior(List<Integer> list) {
        int posicaoMaior = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == maiorValor(list)) {
                posicaoMaior = i;
            }
        }
        return posicaoMaior;
    }

    public static int posicaoMenor(List<Integer> list) {
        int posicaoMenor = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == valorMenor(list)) {
                posicaoMenor = i;
            }
        }
        return posicaoMenor;
    }

    public static int valorMaior(List<Integer> list, int xMaior) {
        int valorMaior = 0;
        for (int i = 0; i < list.size(); i++) {
            if (xMaior < list.get(i)) {
                valorMaior++;
            }
        }
        return valorMaior;
    }

    public static int somaLista(List<Integer> list) {
        int soma = 0;

        for (int i = 0; i < list.size(); i++) {
            soma = soma + list.get(i);
        }
        return soma;
    }
}
