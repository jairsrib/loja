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
public class Roupa {
    private int id_roupa;
    private String nome;
    private double preco;
    private String cor;
    private String descricao;

    // Construtor
    public Roupa(int id_roupa, String nome, double preco, String cor, String descricao) {
        this.id_roupa = id_roupa;
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.descricao = descricao;
    }

    // Getters e Setters
    public int getIdRoupa() {
        return id_roupa;
    }

    public void setIdRoupa(int idRoupa) {
        this.id_roupa = idRoupa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
