package model;

public class Roupa_Tamanho {

    private int id_roupa;
    private int id_tamanho;

    
    public Roupa_Tamanho(){
        
    }
    public Roupa_Tamanho(int id_roupa, int id_tamanho) {
        this.id_roupa = id_roupa;
        this.id_tamanho = id_tamanho;
    }

    public int getId_roupa() {
        return id_roupa;
    }

    public void setId_roupa(int id_roupa) {
        this.id_roupa = id_roupa;
    }

    public int getId_tamanho() {
        return id_tamanho;
    }

    public void setId_tamanho(int id_tamanho) {
        this.id_tamanho = id_tamanho;
    }

    
    
}
