package ex03;


public class Veiculo {

    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int velMaxima;
    private double valorFipe;

    public String detalhe() {
        return "Veiculo{" + "modelo=" + this.modelo
                + ", marca=" + this.marca
                + ", ano=" + this.ano + '}';
    }

    public void addVel(int vel) {
        if (vel >= this.velMaxima) {
            System.out.println("Velocidade acima do valor permitido para o veiculo!!");
        } else {
            System.out.println("Estou acelerando " + vel + " km/h.");
        }
        System.out.println("-------------------------------");
    }

    public void frear() {
        System.out.println("Estou freando o veiculo " + this.modelo);
        System.out.println("-------------------------------");

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }
    
    
}
