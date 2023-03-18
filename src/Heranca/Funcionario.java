/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa {

    private Endereco endereco;

    private double salario;

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     * @throws java.lang.Exception
     */
    public void setSalario(double salario) throws Exception {
        if (salario < 1000) {
            throw new Exception("O salário não deve ser menor que um salário mínimo.");
        }
        this.salario = salario;
    }
}
