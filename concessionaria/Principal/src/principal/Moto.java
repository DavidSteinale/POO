package principal;

import java.math.BigDecimal;

public class Moto extends Veiculo implements IProcessos {

    private int qtdCilindradas;

    public Moto() {

    }

    public Moto(String fabricante, String modelo, String ano, String tipoCombutivel, BigDecimal preco, int qtdCilindradas) {
        super(fabricante, modelo, ano, tipoCombutivel, preco);
        this.setQtdCilindradas(qtdCilindradas);
    }

    @Override
    public String toString() {
        return "Moto{" + "Fabricante = " + this.getFabricante()
                + ", Modelo = " + this.getModelo()
                + ", Ano = " + this.getAno()
                + ", Tipo de Combustivel = " + this.getTipoCombutivel()
                + ", Ano = " + this.getPreco()
                + ", qtd Cilindradas= " + this.getQtdCilindradas()
                + '}';
    }

    //METODOS
    @Override
    public void compra() {
    }

    @Override
    public void venda() {
    }

    @Override
    public void orcamento() {
    }

    // METODOS MODIFICADORES
    public int getQtdCilindradas() {
        return qtdCilindradas;
    }

    public void setQtdCilindradas(int qtdCilindradas) {
        this.qtdCilindradas = qtdCilindradas;
    }

}
