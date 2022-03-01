package principal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro[] carro = new Carro[4];
        Moto[] moto = new Moto[4];

        carro[0] = new Carro("Fiat", "Cronos", "2019/2020", "Flex", BigDecimal.valueOf(69000), 4, true);
        carro[1] = new Carro("Kia", "Sorento", "2018/2019", "Flex", BigDecimal.valueOf(45000), 4, true);
        carro[2] = new Carro("Nissan", "Frontier", "2015/2016", "Diesel", BigDecimal.valueOf(40000), 2, true);

        moto[0] = new Moto("Honda", "CG 160", "2015/2016", "Gasolina", BigDecimal.valueOf(4500), 80);
        moto[1] = new Moto("Honda", "Hornet", "2010/2011", "Gasolina", BigDecimal.valueOf(2700), 175);
        moto[2] = new Moto("Yamaha", "Fazer 250", "2015/2016", "Flex", BigDecimal.valueOf(8500), 95);

        int op = -1;
        int op2;
        
        
        do {
            System.out.println("---MENU---");
            System.out.println(" 1 - Compra");
            System.out.println(" 2 - Lista de veiculos para venda");
            System.out.println(" 3 - Venda");
            System.out.println(" 4 - Orçamento");
            System.out.println(" 0 - Sair");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("---MENU DE COMPRAS---");
                    System.out.println(" 1 - Carro");
                    System.out.println(" 2 - Moto");
                    op2 = scanner.nextInt();
                    switch (op2) {
                        case 1:
                            carro[3] = new Carro();
                            carro[3].compra();
                            break;
                        case 2:
                            moto[3] = new Moto();
                            moto[3].compra();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("======VEICULOS À VENDAS=====");
                    System.out.println("---CARROS---");
                    for (int x = 0; x < carro.length; x++) {
                        System.out.println(carro[x].toString());
                    }
                    System.out.println("---MOTOS---");
                    for (int y = 0; y < moto.length; y++) {
                        System.out.println(moto[y].toString());
                    }
                    break;
                case 3:
                    System.out.println("---VENDAS---");
                    System.out.println(" 1 - Carro");
                    System.out.println(" 2 - Moto");
                    op2 = scanner.nextInt();
                    switch (op2) {
                        case 1:
                            carro[0].venda();
                            break;
                        case 2:
                            moto[0].venda();
                            break;
                case 4:
                    System.out.println("---MANUTENÇÃO---");
                    System.out.println(" 1 - Carro");
                    System.out.println(" 2 - Moto");
                    op2 = scanner.nextInt();
                    switch (op2) {
                        case 1:
                            System.out.print("Informe o tipo de combutivel:");
                            String tipoComb = scanner.next();
                            
                            carro[0].orcamento(tipoComb);
                            break;
                        case 2:
                            System.out.print("Informe o km:");
                            float km = scanner.nextFloat();
                            moto[0].orcamento(km);
                            break;
                    }
                    
            }
        } while (op != 0);
    }
}
