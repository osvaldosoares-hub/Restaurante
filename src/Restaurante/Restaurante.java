package Restaurante;

import java.util.ArrayList;

public class Restaurante {
    private String end;
    private String nome;
    private String descricao;
    private int id;
    private ArrayList<Cardapio> cardapio = new ArrayList<Cardapio>();

    public Restaurante(String nome, String end, String descricao, int id){
        this.nome=nome;
        this.end =end;
        this.descricao= descricao;
        this.id=id;
    }
    public Restaurante(){
        
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getEnd() {
        return end;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public ArrayList<Cardapio> getCardapio() {
        return cardapio;
    }
    public void PegarCardapio(Cardapio cardapio){
        this.cardapio.add(cardapio);
    }
    public void MostrarCardapio(){
        System.out.println();
        System.out.println("Cardapio: ");
        System.out.println();
        for (Cardapio c : cardapio) {
            System.out.println(c.getImagem() +" "+ c.getProduto()+" " +c.getDescricao() + " " + c.getValor());
            System.out.println();
        }

    }
    
}
