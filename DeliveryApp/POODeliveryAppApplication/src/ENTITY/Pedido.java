package ENTITY;

import ENUM.CardapioEnum;
import INTERFACE.ITaxaEntrega;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Pedido extends Cardapio implements ITaxaEntrega {

    Scanner scanner = new Scanner(System.in);
    Util util = new Util();
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

    public void addPedido() throws InterruptedException{

        do {

            System.out.println();
            System.out.print("Informe o nome do prato:");
            this.setNomePrato(scanner.nextLine());
            // this.nomePrato = scanner.nextLine().toUpperCase();

            switch (this.nomePrato) {
                case "Burguer":

                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_BURGUER * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_BURGUER);
                    this.setStatus(true);
                    taxaEntrega(1f);
                    break;
                case "Pizza":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_PIZZA * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_PIZZA);
                    taxaEntrega(1f);
                    break;
                case "Fogazza":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_FOGAZZA * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_FOGAZZA);
                    taxaEntrega(1f);
                    break;
                case "Pasta":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_PASTA * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_PASTA);
                    taxaEntrega(2f);
                    break;
                case "Lasanha":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_LASANHA * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_LASANHA);
                    taxaEntrega(2f);
                    break;
                case "Polpetone":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_POLPETONE * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_POLPETONE);
                    taxaEntrega(2f);
                    break;
                case "Refrigerante":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_REFRIGERANTE * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_REFRIGERANTE);
                    taxaEntrega(1f);
                    break;
                case "Suco":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_SUCO * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_SUCO);
                    taxaEntrega(1f);
                    break;
                case "Vinho":
                    System.out.print("Informe que quantidade:");
                    this.setQtdPrato(scanner.nextInt());
                    scanner.nextLine();
                    cestaDePedido.add(Double.valueOf(VALOR_VINHO * this.getQtdPrato()));
                    resumoPedido.add(util.preencheComEspaco(this.getNomePrato(), " ", 15, 1));
                    qtdItem.add(this.getQtdPrato());
                    valorUnidDePedido.add(VALOR_VINHO);
                    taxaEntrega(1f);
                    break;
                default:
                    System.out.println("Nome do prato inexistente!!!");

            }
            System.out.println("");
            System.out.print("Deseja lançar mais itens? S/N.");
            this.setOp(scanner.nextLine());
        } while (this.getOp().equalsIgnoreCase("s"));

        // SOMA O PRECO FINAL DO PEDIDO
        for (int x = 0; x < cestaDePedido.size(); x++) {
            valor += cestaDePedido.get(x);
            this.setTaxa(taxa);

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
        System.out.printf("         Valor.............: %.2f \n", this.getValor());
        System.out.printf("         Taxa de entrega...: %.2f \n", this.getTaxa());
        System.out.printf("         Valor total.......: %.2f \n", (this.getValor() + this.getTaxa()));
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
        System.out.printf("             NÚMERO DO PEDIDO: %s \n \n", this.getNumeroPedido());
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

        this.setValor(0);
        this.setTaxa(0);
        /* } else {
            System.out.println("Até mais");
        }*/
    }

    @Override
    public void taxaEntrega(double tipoRefeição) {
        taxa += tipoRefeição;

    }

    public Util getUtil() {
        return util;
    }

    public void setUtil(Util util) {
        this.util = util;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getQtdPrato() {
        return qtdPrato;
    }

    public void setQtdPrato(int qtdPrato) {
        this.qtdPrato = qtdPrato;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String[] getCardapio() {
        return cardapio;
    }

    public void setCardapio(String[] cardapio) {
        this.cardapio = cardapio;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
