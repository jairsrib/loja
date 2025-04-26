package model;

public class Compra {

    private int id_roupa;
    private int id_cliente;
    private int quantidade;

    public Compra(int id_roupa, int id_cliente, int quantidade) {
        this.id_roupa = id_roupa;
        this.id_cliente = id_cliente;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Compra() {

    }

    public int getId_roupa() {
        return id_roupa;
    }

    public void setId_roupa(int id_roupa) {
        this.id_roupa = id_roupa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
