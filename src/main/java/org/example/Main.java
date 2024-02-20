package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Restaurante> restaurantes = new ArrayList<>();

        while (true) {
        System.out.println("Menu principal " +
                "\n 1 - Cadastrar Restaurante " +
                "\n 2 - Listar Restaurantes" +
                "\n 3 - Cadastrar Item no menu de um Restaurante" +
                "\n 4 - Sair");
        String option = scanner.nextLine();

        if (option.equals("1")) {
            System.out.println("Digite o nome do restaurante:");
            String nomeRestaurante = scanner.nextLine();

            System.out.println("Digite a avaliacao do restaurante:");
            Double avaliacaoRestaurante = Double.parseDouble(scanner.nextLine());

            Restaurante restaurante = new Restaurante();
            restaurante.nome = nomeRestaurante;
            restaurante.avaliacao = avaliacaoRestaurante;
            restaurantes.add(restaurante);
            System.out.println("Restaurante" + " " + nomeRestaurante + " " + "cadastrado com sucesso!");

        } else if (option.equals("2")) {
            System.out.println("Restaurantes cadastrados:");

            for (Integer i = 0; i < restaurantes.size(); i++) {
                System.out.println(i + ". " +  restaurantes.get(i).nome);
                restaurantes.get(i).imprimirMenu();

            }
        } else if (option.equals("3")) {
            System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
            Integer escolha = Integer.parseInt(scanner.nextLine());
            Restaurante restauranteEscolhido = restaurantes.get(escolha);

            System.out.println("Digite o nome do item: ");
            String nomeItem = scanner.nextLine();

            System.out.println("Digite o preco do item: ");
            Double precoItem = Double.parseDouble(scanner.nextLine());

            Item item = new Item();
            item.nome = nomeItem;
            item.preco = precoItem;
            restauranteEscolhido.adicionarItem(item);
            System.out.println("Item " + item.nome + " adicionado ao menu do restaurante " + restauranteEscolhido.nome );

        } else if (option.equals("4")) {
            System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
            break;

        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }

        }
    }
}
