/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author aluno
 */
public class Endereco {

    private String nome;

    private String rua;

    private String numero;

    private String bairro;

    private String cidade;

    private String uf;

    private String pais;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     * @throws java.lang.Exception
     */
    public void setRua(String rua) throws Exception {
        if (rua.isEmpty()) {
            throw new Exception("A rua é obrigatória");
        }
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     * @throws java.lang.Exception
     */
    public void setNumero(String numero) throws Exception {
        if (numero.isEmpty()) {
            throw new Exception("O número é obrigatório");
        }
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) throws Exception {
        if (bairro.isEmpty()) {
            throw new Exception("O bairro é obrigatório");
        }
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     * @throws java.lang.Exception
     */
    public void setCidade(String cidade) throws Exception {
        if (cidade.isEmpty()) {
            throw new Exception("A cidade é obrigatória");
        }
        this.cidade = cidade;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     * @throws java.lang.Exception
     */
    public void setUf(String uf) throws Exception {
        if (uf.isEmpty()) {
            throw new Exception("A UF é obrigatória");
        }
        this.uf = uf;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     * @throws java.lang.Exception
     */
    public void setPais(String pais) throws Exception {
        if (pais.isEmpty()) {
            throw new Exception("O país é obrigatório.");
        }
        this.pais = pais;
    }
}
