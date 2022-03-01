package principal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro[] carroVenda = new Carro[4];
        Moto[] moto = new Moto[3];

        carroVenda[0] = new Carro("Fiat", "Cronos", "2019/2020", "Flex", BigDecimal.valueOf(69000), 4, true);
        carroVenda[1] = new Carro("Kia", "Sorento", "2018/2019", "Flex", BigDecimal.valueOf(45000), 4, true);
        carroVenda[2] = new Carro("Nissan", "Frontier", "2015/2016", "Diesel", BigDecimal.valueOf(40000), 2, true);
        
        moto[0] = new Moto("Honda", "CG 160", "2015/2016", "Gasolina", BigDecimal.valueOf(4500), 80);
        moto[1] = new Moto("Honda", "Hornet", "2010/2011", "Gasolina", BigDecimal.valueOf(2700), 175);
        moto[2] = new Moto("Yamaha", "Fazer 250", "2015/2016", "Flex", BigDecimal.valueOf(8500), 95);

        int op = -1;
        do {
            System.out.println("---MENU---");
            System.out.println(" 1 - Compra");
            System.out.println(" 2 - Venda");
            System.out.println(" 3 - Orçamento");
            System.out.println(" 0 - Sair");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    carroVenda[3].compra();
                    break;
                case 2:
                    System.out.println("======VEICULOS À VENDAS=====");
                    System.out.println("---CARROS---");
                     for (int x = 0; x < carroVenda.length; x++) {
                         System.out.println(carroVenda[x].toString());                        
                    }
                     System.out.println("---MOTOS---");
                     for (int  y= 0; y < carroVenda.length; y++) {
                         System.out.println(moto[y].toString());                        
                    }
                    break;

            }

        } while (op != 0);
    }

}
