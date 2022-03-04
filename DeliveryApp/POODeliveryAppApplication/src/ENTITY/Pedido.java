package ENTITY;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Double> cestaDePedido = new ArrayList<Double>();

    private String op;
    private double valor;

    public void addPedido() {
        //  cestaDePedido.add(Double.valueOf(10));

        do {
            System.out.println("Informe o nome do prato:");
            String nomePrato = scanner.nextLine();

            switch (nomePrato) {
                case "burguer":
                    cestaDePedido.add(Double.valueOf(30));
                    break;
                default:
                    System.out.println("Opção inválida " + nomePrato);

            }
            //cestaDePedido.add(Double.valueOf(30));
            System.out.println("Deseja lançar mais itens? s/n.");
            op = scanner.nextLine();
        } while (op == "s" && op == "S");

        for (int x = 0; x < cestaDePedido.size(); x++) {
            valor += cestaDePedido.get(x);

        }
        System.out.println("Valor total é: " + valor);
    }

}
