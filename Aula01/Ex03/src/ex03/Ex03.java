package ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Veiculo carro = new Veiculo();
        
        System.out.print("Informe o modelo do veículo:");
        carro.setModelo(scanner.nextLine());
        
        System.out.print("Informe a marca do veículo:");
        carro.setMarca(scanner.nextLine());
        
        System.out.print("Informe a cor do veívulo:");
        carro.setCor(scanner.nextLine());
        
        System.out.print("Informe o Ano do veiculo:");
        carro.setAno(scanner.nextInt());
        
        System.out.print("Informe a velocidade máxima do veículo:");
        carro.setVelMaxima(scanner.nextInt());
        
        System.out.print("Valor da FIPE:");
        carro.setValorFipe(scanner.nextDouble());
        
        System.out.println("------DETALHES DO VEICULO------");
        System.out.println(carro.detalhe());
        System.out.println("-------------------------------");
        
        carro.addVel(50);
        carro.frear();

    }

}
