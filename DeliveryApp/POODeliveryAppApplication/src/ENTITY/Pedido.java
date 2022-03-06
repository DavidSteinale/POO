package ENTITY;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido extends Cardapio {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Double> cestaDePedido = new ArrayList<Double>();

    private String op;
    private double valor;
    private int qtdPrato;

    public void addPedido() {

        do {
            System.out.print("Informe o nome do prato:");
            String nomePrato = scanner.nextLine();

            System.out.print("Informe que quantidade:");
            qtdPrato = scanner.nextInt();
            scanner.nextLine();

            switch (nomePrato) {
                case "Burguer":
                    cestaDePedido.add(Double.valueOf(VALOR_BURGUER * qtdPrato));
                    break;
                case "Pizza":
                    cestaDePedido.add(Double.valueOf(VALOR_PIZZA * qtdPrato));
                    break;
                case "Fogassa":
                    cestaDePedido.add(Double.valueOf(VALOR_FOGAZZA * qtdPrato));
                    break;
                case "Pasta":
                    cestaDePedido.add(Double.valueOf(VALOR_PASTA * qtdPrato));
                    break;
                case "Lasanha":
                    cestaDePedido.add(Double.valueOf(VALOR_LASANHA * qtdPrato));
                    break;
                case "Polpetone":
                    cestaDePedido.add(Double.valueOf(VALOR_POLPETONE * qtdPrato));
                    break;
                case "Refrigerante":
                    cestaDePedido.add(Double.valueOf(VALOR_REFRIGERANTE * qtdPrato));
                    break;
                case "Suco":
                    cestaDePedido.add(Double.valueOf(VALOR_SUCO * qtdPrato));
                    break;
                case "Vinho":
                    cestaDePedido.add(Double.valueOf(VALOR_VINHO * qtdPrato));
                    break;
                default:
                    System.out.println("Opção inválida");

            }
            System.out.println("");
            System.out.print("Deseja lançar mais itens? s/n.");
            op = scanner.nextLine();
        } while (op.equals("s") || op.equals('S'));

        for (int x = 0; x < cestaDePedido.size(); x++) {
            valor += cestaDePedido.get(x);

        }
        System.out.println("Valor total é: " + valor);
        valor = 0;
    }

}
