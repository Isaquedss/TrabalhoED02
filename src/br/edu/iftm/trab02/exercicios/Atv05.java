package br.edu.iftm.trab02.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import br.edu.iftm.trab02.testes.Produto;

public class Atv05 {
    public static void main(String[] args) {

        System.out.println("Atividade 05:");

        Queue<Produto> filaComPrioridade = new PriorityQueue<Produto>(new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return Float.valueOf(p2.getPreco()).compareTo(p1.getPreco());
            }

        });

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto(389, "Celular", 3500, 12);
        Produto produto2 = new Produto(124, "Refrigerador", 5290, 5);
        Produto produto3 = new Produto(387, "Fogão", 1190, 3);
        Produto produto4 = new Produto(222, "Notebook", 2490, 8);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        for (int i = 0; i < produtos.size(); i++) {
            filaComPrioridade.offer(produtos.get(i));
        }

        System.out.println("Os produtos que foram separados para entrega foram: \n");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
        System.out.println();

        System.out.println("A ordem dos produtos priorizados na entrega são: \n");
        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }
    }
}
