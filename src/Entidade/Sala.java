/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author jona_
 */
public class Sala {
     private int id;
    private String nome;
    private String lotacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id+1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }
    
    
    
    
    
}
