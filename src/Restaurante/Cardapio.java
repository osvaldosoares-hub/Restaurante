package Restaurante;



public class Cardapio {
    private String produto;
    private String imagem;
    private double valor; 
    private String descricao;
    private int id;
    

    public Cardapio(String produto ,String imagem, double valor,String decricao ,int id){
        this.produto=produto;
        this.imagem = imagem;
        this.valor =valor;
        this.descricao= decricao;
        this.id=id;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getId() {
        return id;
    }
    public String getImagem() {
        return imagem;
    }
    public String getProduto() {
        return produto;
    }
    public double getValor() {
        return valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
   


}
