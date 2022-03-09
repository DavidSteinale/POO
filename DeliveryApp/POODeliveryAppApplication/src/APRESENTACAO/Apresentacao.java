package APRESENTACAO;

import ENTITY.Cardapio;
import ENTITY.Pedido;
import java.util.Scanner;

public class Apresentacao {

    public void bemVindo(){

        Cardapio cardapio = new Cardapio();
        Pedido pedido = new Pedido();

        Scanner scanner = new Scanner(System.in);

        int menu = -1;

        do {

            System.out.println("+-------------------------------------------+");
            System.out.println("|  SEJA BEM VINDO À CANTINA CODIFICHIAMO    |");
            System.out.println("+-------------------------------------------+");
            System.out.println("| 1 - Consultar Cardápio.                   |");
            System.out.println("| 2 - Realizar um pedido.                   |");
            System.out.println("| 0 - Sair.                                 |");
            System.out.println("+-------------------------------------------+");
            System.out.println("");

            System.out.print("Digite uma das opções, por favor:");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    cardapio.cardapio();
                    break;
                case 2:
                    pedido.addPedido();
                    break;
            }

        } while (menu != 0);

    }
}
