package ENTITY;


package teste;

public class Util {

    public static String preencheCom(String linha_a_preencher, String letra, int tamanho, int direcao) {

       //Enquanto Linha a preencher possuir 2 espaços em branco seguidos, substitui por 1 espaço apenas
        while (linha_a_preencher.contains(" ")) {
            linha_a_preencher = linha_a_preencher.replaceAll(" ", " ").trim();
        }

        //Retira caracteres estranhos
        linha_a_preencher = linha_a_preencher.replaceAll("[./-]", "");

        StringBuffer sb = new StringBuffer(linha_a_preencher);

        if (direcao == 1) {//a Direita
            for (int i = sb.length(); i < tamanho; i++) {
                sb.append(letra);
            }
        }
        return sb.toString();
    }
}

