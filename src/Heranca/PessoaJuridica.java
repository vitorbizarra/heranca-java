/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author aluno
 */
public class PessoaJuridica extends Cliente {

    private String cnpj;

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     * @throws java.lang.Exception
     */
    public void setCnpj(String cnpj) throws Exception {
        if (cnpj.isEmpty()) {
            throw new Exception("O CNPJ não pode ser vazio");
        }
        this.cnpj = cnpj;
    }

}
