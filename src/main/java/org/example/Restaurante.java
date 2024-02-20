package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Restaurante {
    String nome;

    Double avaliacao;

    ArrayList<Item> cardapio = new ArrayList<>();


    void getNome(String nome) {
        System.out.println("Nome" + nome);
    }

    void adicionarItem(Item item) {
        cardapio.add(item);
    }

    void imprimirMenu() {
        for (Item item : cardapio) {
            System.out.println(item.nome + ':' + item.preco);
        }
    }
}

