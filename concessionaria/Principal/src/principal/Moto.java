package principal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Moto extends Veiculo implements IProcessos {
    Scanner scanner = new Scanner(System.in);

    private int qtdCilindradas;
    
    private final float VALOR_ABAIXO_125=250f; 
    private final float VALOR_ENTRE_125_250=500f;
    private final float VALOR_ACIMA_250=625f;
   

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
        System.out.print("Qtd de cilindradas:");
        this.setQtdCilindradas(scanner.nextInt());        
        System.out.println(toString());
    }

    @Override
    public void venda() {
        System.out.println("Veiculo vendido com sucesso!!!");
    }

    
    public void orcamento(float km) {
        System.out.println("**********************************************");
        if (km <= 125) {
            System.out.printf("Valor da manutenção: %.2f \n", VALOR_ABAIXO_125);            
        }else if (km > 125 && km <=250){
            System.out.printf("Valor da manutenção: %.2f \n", VALOR_ENTRE_125_250);            
        }else
            System.out.printf("Valor da manutenção: %.2f \n", VALOR_ACIMA_250);            
        System.out.println("**********************************************");
    }

    // METODOS MODIFICADORES
    public int getQtdCilindradas() {
        return qtdCilindradas;
    }

    public void setQtdCilindradas(int qtdCilindradas) {
        this.qtdCilindradas = qtdCilindradas;
    }

    
    

}
