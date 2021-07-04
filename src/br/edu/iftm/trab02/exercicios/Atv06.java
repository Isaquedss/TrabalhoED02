package br.edu.iftm.trab02.exercicios;

import br.edu.iftm.trab02.testes.Fila;

public class Atv06 {
    public static void main(String[] args) {
        System.out.println("Atividade 06: ");

        Fila<Object> fila = new Fila<Object>(7);

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(5);
        fila.enfileirar(2);
        fila.enfileirar(4);
        fila.enfileirar(6);

        System.out.println("Fila Ordenada: " + fila.toString());
        fila.filaInversa();
        System.out.println("Fila invertida: " + fila.toString());
    }
}
