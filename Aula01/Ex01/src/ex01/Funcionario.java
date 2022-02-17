package ex01;

public class Funcionario {

    private String nome;
    private String sobreNome;
    private String cidade;
    private String uf;
    private int horasTrabalhadas;
    private float valorPorHora;

    public Funcionario(String nome, String sobreNome, int horasTrabalhadas, float valorPorHora) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.setHorasTrabalhadas(horasTrabalhadas);
        this.valorPorHora = valorPorHora;
    }

    public void qtdHoras(int horas) {
        this.setHorasTrabalhadas(this.horasTrabalhadas += horas);
        System.out.println("»»»»»»»»»»»»»»");
        System.out.println("Total de horas Trabalhadas de " + this.getNome() + " " + this.getSobreNome() +" "+ this.getHorasTrabalhadas() + "." );
        System.out.println("»»»»»»»»»»»»»»");
    }

    public void novoValorPorHora(float valor) {
        this.setValorPorHora(valor);
        System.out.println("»»»»»»»»»»»»»»");
        System.out.printf("Novo Valor por hora trabalhada: %.2f \n", this.getValorPorHora());
        System.out.println("»»»»»»»»»»»»»»");
        System.out.println();
    }

    public void novoSalario(int horas, float valorPorHora) {
        float salario = this.getHorasTrabalhadas() * this.getValorPorHora();
        System.out.print(this.getNome() + " " + this.getSobreNome());
        System.out.printf(" seu novo Salário é : %.2f", salario);
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

}
