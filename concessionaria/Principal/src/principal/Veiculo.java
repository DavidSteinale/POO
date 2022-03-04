package principal;

import java.math.BigDecimal;

public abstract class Veiculo {

    // ****mudar para protected****
    private String fabricante;
    private String modelo;
    private String ano;
    private String tipoCombutivel;
    private BigDecimal preco;

    //CONSTRUTOR
    public Veiculo() {

    }

    public Veiculo(String fabricante, String modelo, String ano, String tipoCombutivel, BigDecimal preco) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombutivel = tipoCombutivel;
        this.preco = preco;
    }
    
    public void orcamento(){     
    }
    
    //METODOS MODIFICADORES
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipoCombutivel() {
        return tipoCombutivel;
    }

    public void setTipoCombutivel(String tipoCombutivel) {
        this.tipoCombutivel = tipoCombutivel;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

}
