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
public class Cliente extends Pessoa {
    
    private ArrayList<Endereco> enderecos = new ArrayList();
    
    private String email;
    
    /**
     * @return the enderecos
     */
    public ArrayList<Endereco> getEndereco() {
        return enderecos;
    }

    /**
     * @param enderecos the endereco to set
     * @throws java.lang.Exception
     */
    public void setEndereco(ArrayList<Endereco> enderecos) throws Exception {
        if (enderecos.isEmpty()) {
            throw new Exception("A pessoa deve ter ao menos um endereço");
        }
        this.enderecos = enderecos;
    }

    /**
     * @param endereco the endereco to add to enderecos
     */
    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    /**
     * @param key the index of the endereco to remove from enderecos
     */
    public void addEndereco(int key) {
        this.enderecos.remove(key);
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     * @throws java.lang.Exception
     */
    public void setEmail(String email) throws Exception {
        if (email.isEmpty()) {
            throw new Exception("O email não pode ser vazio");
        }
        this.email = email;
    }
}
