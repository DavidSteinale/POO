package ex01;

public class Ex01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("David Alexandre", "(41)98840335");

        pessoa.setEndereço("rua julia skora, 185");

        System.out.printf("Nome: %s e telefone %s \n", pessoa.getNome(), pessoa.getTelefone());
        System.out.println("Endereço: " + pessoa.getEndereço());
    }

}
