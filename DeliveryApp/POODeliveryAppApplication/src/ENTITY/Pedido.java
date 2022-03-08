package ENTITY;

import ENUM.CardapioEnum;
import INTERFACE.ITaxaEntrega;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pedido extends Cardapio implements ITaxaEntrega {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    ArrayList<Double> cestaDePedido = new ArrayList<Double>();
    ArrayList<Double> valorUnidDePedido = new ArrayList<Double>();
    ArrayList<String> resumoPedido = new ArrayList<String>();
    ArrayList<Integer> qtdItem = new ArrayList<Integer>();

    private String op, nomePrato;
    private double valor, taxa;
    private int qtdPrato;
    private int numeroPedido = random.nextInt(1000);

    public void addPedido() throws InterruptedException {

        do {
            try {
                System.out.println();
                System.out.print("Informe o nome do prato:");
                this.nomePrato = scanner.nextLine();
                // this.nomePrato = scanner.nextLine().toUpperCase();
            } catch (Exception e) {
                System.out.println("prato invalidao" + e);
            }

            System.out.print("Informe que quantidade:");
            this.qtdPrato = scanner.nextInt();
            scanner.nextLine();

            switch (this.nomePrato) {
                case "Burguer":
                    cestaDePedido.add(Double.valueOf(VALOR_BURGUER * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_BURGUER);
                    taxaEntrega(1f);
                    break;
                case "Pizza":
                    cestaDePedido.add(Double.valueOf(VALOR_PIZZA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_PIZZA);
                    taxaEntrega(1f);
                    break;
                case "Fogazza":
                    cestaDePedido.add(Double.valueOf(VALOR_FOGAZZA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_FOGAZZA);
                    taxaEntrega(1f);
                    break;
                case "Pasta":
                    cestaDePedido.add(Double.valueOf(VALOR_PASTA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_PASTA);
                    taxaEntrega(1f);
                    break;
                case "Lasanha":
                    cestaDePedido.add(Double.valueOf(VALOR_LASANHA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_LASANHA);
                    taxaEntrega(1f);
                    break;
                case "Polpetone":
                    cestaDePedido.add(Double.valueOf(VALOR_POLPETONE * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_POLPETONE);
                    taxaEntrega(1f);
                    break;
                case "Refrigerante":
                    cestaDePedido.add(Double.valueOf(VALOR_REFRIGERANTE * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_REFRIGERANTE);
                    taxaEntrega(2f);
                    break;
                case "Suco":
                    cestaDePedido.add(Double.valueOf(VALOR_SUCO * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_SUCO);
                    taxaEntrega(2f);
                    break;
                case "Vinho":
                    cestaDePedido.add(Double.valueOf(VALOR_VINHO * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_VINHO);
                    taxaEntrega(2f);
                    break;
                default:
                    System.out.println("Opção inválida");

            }
            System.out.println("");
            System.out.print("Deseja lançar mais itens? s/n.");
            op = scanner.nextLine();
        } while (op.equals("s") || op.equals('S'));

        // SOMA O PRECO FINAL DO PEDIDO
        for (int x = 0; x < cestaDePedido.size(); x++) {
            valor += cestaDePedido.get(x);

        }
                
        System.out.println();
        System.out.println("+-------------------------------------------+");
        System.out.println("               RESUMO DO PEDIDO              ");
        System.out.println("+-------------------------------------------+");
        System.out.println("  Item                    Qtd     Valor unid ");
        System.out.println("+-------------------------------------------+");
        for (int x = 0; x < resumoPedido.size(); x++) {
            System.out.printf("  %s " + "         %d           %.2f \n", resumoPedido.get(x), qtdItem.get(x), valorUnidDePedido.get(x));
        }

        System.out.println();
        System.out.printf("         Valor.............: %.2f \n", valor);
        System.out.printf("         Taxa de entrega...: %.2f \n", taxa);
        System.out.printf("         Valor total.......: %.2f \n", (valor + taxa));
        System.out.println("+-------------------------------------------+");
        
        System.out.println();
        System.out.println("AGUARDE PROCESSANDO PAGAMENTO...");
        Thread.sleep(2000);
        System.out.println("PAGAMENTO REALIZADO COM SUCESSO...");
        Thread.sleep(2000);        
        System.out.println("AGUARDE PROCESSANDO O PEDIDO....");
        Thread.sleep(2000);
        System.out.println();
        
        System.out.println("+-------------------------------------------+");
        System.out.printf("             NÚMERO DO PEDIDO: %s \n \n", numeroPedido);
        System.out.println("    Obrigado Pelo Pedido - Conte Conosco!");
        System.out.println();
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println();

        for (int x = 0; x < cestaDePedido.size(); x++) {
            cestaDePedido.remove(x);
            resumoPedido.remove(x);
            qtdItem.remove(x);
            valorUnidDePedido.remove(x);
        }

        valor = 0;
        taxa = 0;
    }

    @Override
    public void taxaEntrega(double tipoRefeição) {
        taxa += tipoRefeição;

    }

}
