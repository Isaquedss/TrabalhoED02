package br.edu.iftm.trab02.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.iftm.trab02.testes.Produto;

public class Atv01 {
    public static void main(String[] args) {
        System.out.println("Atividade 01:\n");

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto(389, "Celular", 3500, 12);
        Produto produto2 = new Produto(124, "Refrigerador", 5290, 5);
        Produto produto3 = new Produto(387, "Fogão", 1190, 3);
        Produto produto4 = new Produto(222, "Notebook", 2490, 8);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        System.out.println("A loja IFTM possui os seguintes itens: \n");

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
        System.out.println();

        System.out.println("O menor valor é: " + menorPreco(produtos));
    }

    public static Float menorPreco(List<Produto> list) {
        Float valor;
        Float valorMenor;
        List<Float> valorBaixo = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i).getPreco();
            valorBaixo.add(valor);
        }
        valorMenor = Collections.min(valorBaixo);
        return valorMenor;
    }

}
