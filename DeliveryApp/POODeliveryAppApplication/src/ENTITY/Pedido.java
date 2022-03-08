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
    
    
    private CardapioEnum teste;

    private String op, nomePrato;
    private double valor, taxa;
    private int qtdPrato;
    private int numeroPedido = random.nextInt(1000);
    private boolean status = false;

    public void addPedido() throws InterruptedException {

        do {

            System.out.println();
            System.out.print("Informe o nome do prato:");
            this.nomePrato = scanner.nextLine();
            // this.nomePrato = scanner.nextLine().toUpperCase();

            switch (this.nomePrato) {
                case "Burguer":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_BURGUER * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_BURGUER);
                    status = true;
                    taxaEntrega(1f);
                    break;
                case "Pizza":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_PIZZA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_PIZZA);
                    taxaEntrega(1f);
                    break;
                case "Fogazza":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_FOGAZZA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_FOGAZZA);
                    taxaEntrega(1f);
                    break;
                case "Pasta":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_PASTA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_PASTA);
                    taxaEntrega(2f);
                    break;
                case "Lasanha":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_LASANHA * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_LASANHA);
                    taxaEntrega(2f);
                    break;
                case "Polpetone":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_POLPETONE * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_POLPETONE);
                    taxaEntrega(2f);
                    break;
                case "Refrigerante":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_REFRIGERANTE * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_REFRIGERANTE);
                    taxaEntrega(1f);
                    break;
                case "Suco":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_SUCO * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_SUCO);
                    taxaEntrega(1f);
                    break;
                case "Vinho":
                    System.out.print("Informe que quantidade:");
                    this.qtdPrato = scanner.nextInt();
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_VINHO * this.qtdPrato));
                    resumoPedido.add(this.nomePrato);
                    qtdItem.add(this.qtdPrato);
                    valorUnidDePedido.add(VALOR_VINHO);
                    taxaEntrega(1f);
                    break;
                default:
                    System.out.println("Nome do prato inexistente!!!");

            }
            System.out.println("");
            System.out.print("Deseja lançar mais itens? S/N.");
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
       /* } else {
            System.out.println("Até mais");
        }*/
    }

    @Override
    public void taxaEntrega(double tipoRefeição) {
        taxa += tipoRefeição;

    }

}
