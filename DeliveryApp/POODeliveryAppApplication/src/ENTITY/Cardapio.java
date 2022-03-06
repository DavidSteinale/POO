package ENTITY;

import ENUM.CardapioEnum;

public class Cardapio {

    String[] cardapio = new String[9];
    private CardapioEnum cardapioEnum;
    
    final double VALOR_BURGUER = 30f;
    final double VALOR_PIZZA = 45f;
    final double VALOR_FOGAZZA = 20f;
    final double VALOR_REFRIGERANTE = 5f;
    final double VALOR_SUCO = 7f;
    final double VALOR_VINHO = 50f;
    final double VALOR_PASTA = 30f;
    final double VALOR_LASANHA = 70f;
    final double VALOR_POLPETONE = 50f;

    public void cardapio() {
        String[] cardapio = {CardapioEnum.BURGUER.getDescricao() + "  - R$ 30,00",
                             CardapioEnum.PIZZA.getDescricao() + "    - R$ 45,00 ",
                             CardapioEnum.FOGAZZA.getDescricao() + "  - R$ 20,00",
                             CardapioEnum.PASTA.getDescricao() +   "    - R$ 30,00",
                             CardapioEnum.LASANHA.getDescricao() +  "  - R$ 70,00",
                             CardapioEnum.POLPETONE.getDescricao() +" - R$ 50,00",
                             CardapioEnum.REFRIGERANTE.getDescricao() + "- R$ 5,00",
                             CardapioEnum.SUCO.getDescricao() + "        - R$ 7,00",
                             CardapioEnum.VINHO.getDescricao() + "       - R$ 50,00"       
                            };
        System.out.println();
        System.out.println("»»»»»» CARDÁPIO ««««««");
        System.out.println();
        System.out.println("═══ " + CardapioEnum.LANCHES + " ═══");
        System.out.println();
        System.out.println(cardapio[0]);
        System.out.println(cardapio[1]);
        System.out.println(cardapio[2]);
        System.out.println();
        System.out.println("═══ " + CardapioEnum.COMIDA + " ═══");
        System.out.println();
        System.out.println(cardapio[3]);
        System.out.println(cardapio[4]);
        System.out.println(cardapio[5]);
        System.out.println();
        System.out.println("═══ " + CardapioEnum.BEBIDAS + " ═══");
        System.out.println();
        System.out.println(cardapio[6]);
        System.out.println(cardapio[7]);
        System.out.println(cardapio[8]);
        System.out.println("══════════════════════════════════════════");
    }

}
