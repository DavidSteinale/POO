package enums;

public enum TipoJornadaEmpregado {
    
    PERIODO_COMPLETO("Período Completo"),
    MEIO_PERIODO("Meio Período");
    
    private final String descricao;

    TipoJornadaEmpregado(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
