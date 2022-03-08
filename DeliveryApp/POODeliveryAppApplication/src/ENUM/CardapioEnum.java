package ENUM;

public enum CardapioEnum {

    LANCHES("Lanches"),
    COMIDA("Comida"),
    BEBIDAS("Bebidas"),
    BURGUER("Burguer"),
    PIZZA("Pizza"),
    FOGAZZA("Fogazza"),
    PASTA("Pasta"),
    LASANHA("Lasanha"),
    POLPETONE("Popetone"),
    REFRIGERANTE("Refrigerante"),
    SUCO("Suco"),
    VINHO("Vinho");
    
    final double VALOR_BURGUER = 30f;

    private String descricao;

    CardapioEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
