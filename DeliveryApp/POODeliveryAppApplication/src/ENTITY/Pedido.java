package ENTITY;

import INTERFACE.ITaxaEntrega;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido extends Cardapio implements ITaxaEntrega {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Double> cestaDePedido = new ArrayList<Double>();

    private String op, nomePrato;
    private double valor,taxa;
    private int qtdPrato;
    

    public void addPedido() {

        do {
            System.out.println();
            System.out.print("Informe o nome do prato:");
            this.nomePrato = scanner.nextLine();

            System.out.print("Informe que quantidade:");
            this.qtdPrato = scanner.nextInt();
            scanner.nextLine();

            switch (this.nomePrato) {
                case "Burguer":
                    cestaDePedido.add(Double.valueOf(VALOR_BURGUER * this.qtdPrato));
                    taxaEntrega(1f);
                    break;
                case "Pizza":
                    cestaDePedido.add(Double.valueOf(VALOR_PIZZA * this.qtdPrato));
                    taxaEntrega(1f);
                    break;
                case "Fogassa":
                    cestaDePedido.add(Double.valueOf(VALOR_FOGAZZA * this.qtdPrato));
                    taxaEntrega(1f);
                    break;
                case "Pasta":
                    cestaDePedido.add(Double.valueOf(VALOR_PASTA * this.qtdPrato));
                    taxaEntrega(1f);
                    break;
                case "Lasanha":
                    cestaDePedido.add(Double.valueOf(VALOR_LASANHA * this.qtdPrato));
                    taxaEntrega(1f);
                    break;
                case "Polpetone":
                    cestaDePedido.add(Double.valueOf(VALOR_POLPETONE * this.qtdPrato));
                    taxaEntrega(1f);
                    break;
                case "Refrigerante":
                    cestaDePedido.add(Double.valueOf(VALOR_REFRIGERANTE * this.qtdPrato));
                    taxaEntrega(2f);
                    break;
                case "Suco":
                    cestaDePedido.add(Double.valueOf(VALOR_SUCO * this.qtdPrato));
                    taxaEntrega(2f);
                    break;
                case "Vinho":
                    cestaDePedido.add(Double.valueOf(VALOR_VINHO * this.qtdPrato));
                    taxaEntrega(2f);
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
        System.out.println("+-------------------------------------------+");
        System.out.printf("       Valor.............: %.2f \n", valor);      
        System.out.printf("       Taxa de entrega...: %.2f \n",taxa);
        System.out.printf("       Valor total.......: %.2f \n",(valor+taxa));
        System.out.println("+-------------------------------------------+");
        valor = 0;
    }   

    @Override
    public void taxaEntrega(double tipoRefeição) {
       taxa += tipoRefeição;
        
    }

}
