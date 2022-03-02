/**
 * CLASSE ONDE CONSTA AS VARIAVEIS DO FORNECEDOR E SEU SET E GET
 */
package DTO;

public class FornecedorDTO {

    private String razaoSocial;
    private String endereco;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
}
