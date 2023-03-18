/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author aluno
 */
public class ClienteFisico extends Cliente {

    private String cpf;

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     * @throws java.lang.Exception
     */
    public void setCpf(String cpf) throws Exception {
        if (cpf.isEmpty()) {
            throw new Exception("O CPF não pode estar vazio");
        }
        this.cpf = cpf;
    }
}
