package principal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carro extends Veiculo implements IProcessos {

    Scanner scanner = new Scanner(System.in);

    private int qtdPortas;
    private boolean indicadorArbag;

    private final float VALOR_ALCOOL = 250f;
    private final float VALOR_GASOLINA = 500f;
    private final float VALOR_FLEX = 625f;

    //CONSTRUTOR
    public Carro() {

    }

    public Carro(String fabricante, String modelo, String ano, String tipoCombutivel, BigDecimal preco, int qtdPortas, boolean indicadorArbag) {
        super(fabricante, modelo, ano, tipoCombutivel, preco);
        this.setQtdPortas(qtdPortas);
        this.setIndicadorArbag(indicadorArbag);
    }

    @Override
    public String toString() {
        return "Carro{" + "Fabricante = " + this.getFabricante()
                + ", Modelo = " + this.getModelo()
                + ", Ano = " + this.getAno()
                + ", Tipo de Combustivel = " + this.getTipoCombutivel()
                + ", Ano = " + this.getPreco()
                + ", qtd Portas= " + this.getQtdPortas()
                + ", indicador Arbag= " + this.getIndicadorArbag()
                + '}';
    }

    //METODOS
    //METODOS MODIFICADORES
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean getIndicadorArbag() {
        return indicadorArbag;
    }

    public void setIndicadorArbag(boolean indicadorArbag) {
        this.indicadorArbag = indicadorArbag;
    }

    @Override
    public void compra() {
        System.out.print("Fabricante:");
        this.setFabricante(scanner.nextLine());
        System.out.print("Modelo:");
        this.setModelo(scanner.nextLine());
        System.out.print("Ano:");
        this.setAno(scanner.nextLine());
        System.out.print("Tipo de combustivel:");
        this.setTipoCombutivel(scanner.nextLine());
        System.out.print("Valor:");
        this.setPreco(scanner.nextBigDecimal());
        System.out.print("Qtd de portas:");
        this.setQtdPortas(scanner.nextInt());
        System.out.print("Indicador ArBag:");
        this.setIndicadorArbag(scanner.nextBoolean());
        System.out.println(toString());
    }

    @Override
    public void venda() {
        System.out.println("Veiculo vendido com sucesso!!!");
    }

    public void orcamento(String tipoCombustivel) {
        System.out.println("**********************************************");
        if (tipoCombustivel.equals("alcool")) {
            System.out.printf("Valor da manutenção: %.2f \n", VALOR_ALCOOL);
        }
        if (tipoCombustivel.equals("gasolina")) {
            System.out.printf("Valor da manutenção: %.2f \n", VALOR_GASOLINA);
        }
        if (tipoCombustivel.equals("flex")) {
            System.out.printf("Valor da manutenção: %.2f \n", VALOR_FLEX);
        }
        System.out.println("**********************************************");

    }

}
