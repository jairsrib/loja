/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno.saolucas
 */
public class Tamanho {
    private int id_tamanho;
    private String sigla;
    private String descricao;

    // Construtor
    public Tamanho(int id_tamanho, String sigla, String descricao) {
        this.id_tamanho = id_tamanho;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public Tamanho() {

    }

    // Getters e Setters
    public int getIdTamanho() {
        return id_tamanho;
    }

    public void setIdTamanho(int idTamanho) {
        this.id_tamanho = idTamanho;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
