package ex02;

public class Livro {

    private String titulo;
    private String nomeLeitor;
    private int qtdPagTotal;
    private int qtdPagLidas;
    private float porcentagem;

    
    // CONSTRUTOR
    public Livro() {
        this.qtdPagTotal = 0;
        this.qtdPagLidas = 0;
    }
    
    //METODOS
    
    public float progresso(){
        this.porcentagem = ((float)qtdPagLidas*100)/(float)qtdPagTotal;
        return this.porcentagem;
    }
    
    
    // METODOS DE MODIFICAÇÂO

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public int getQtdPagTotal() {
        return qtdPagTotal;
    }

    public void setQtdPagTotal(int qtdPagTotal) {
        this.qtdPagTotal = qtdPagTotal;
    }

    public int getQtdPagLidas() {
        return qtdPagLidas;
    }

    public void setQtdPagLidas(int qtdPagLidas) {
        this.qtdPagLidas = qtdPagLidas;
    }
    
    
    
    
}
