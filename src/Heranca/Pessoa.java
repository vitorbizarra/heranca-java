/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Pessoa {

    private String nome;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @throws java.lang.Exception
     */
    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("O nome não pode estar vazio");
        }

        this.nome = nome;
    }
}
