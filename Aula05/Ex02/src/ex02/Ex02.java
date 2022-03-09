package ex02;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BigDecimal rendaMensal = BigDecimal.valueOf(0f);
        String nome;
        String cpf;
        int contador=0;
        
    do{

        System.out.print("Informe o nome: ");
        nome = scanner.next();
        System.out.print("Informe o CPF: ");
        cpf = scanner.next();
        
        try { // TRATA O ERRO AO DIGITAR UMA LETRA NO CAMPO ONDE ESPERA UM NUMERO
            
            System.out.print("Informe a renda mensal: ");
            rendaMensal = BigDecimal.valueOf(scanner.nextDouble());
            
        } catch (InputMismatchException erro) {
            System.out.println("Renda mensal não pode receber texto | " + erro);
            contador++;
        }

        if (!validaCaracter(nome)) { // TRATA SE FOI DIGITADO NUMERO EM VEZ DE LETRA
            System.out.println("Você não pode inserir números no nome.");
        }
        System.out.println();
        System.out.println("CADASTRO REALIZADO COM SUCESSO.");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Renda mensal: " + rendaMensal);

    }while(contador!=3);
    }

    public static boolean validaCaracter(String nome) {
        return nome.matches("[^\\d]+");
    }

}
