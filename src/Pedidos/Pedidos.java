package Pedidos;

import java.util.ArrayList;


import Restaurante.Cardapio;
import Restaurante.Restaurante;

public class Pedidos {
    private int id;
    private ArrayList<Cardapio> pedidos =new ArrayList<Cardapio>();
    public Pedidos(){
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Cardapio> getPedidos() {
        return pedidos;
    }
    public int PegarPedidos(Restaurante cardapio,String pedido){
        for (Cardapio r : cardapio.getCardapio()) {
            if(r.getProduto().equals(pedido)){
                this.pedidos.add(r);
                
            }
        }
        return 1;
        
        
    }
    public void MostrarPedidos(){
        System.out.println("seu pedido: ");
        
        for (Cardapio r : pedidos) {      
            System.out.println();
            System.out.println(r.getProduto() + " preço "+ r.getValor()+ " "+ r.getDescricao());
            
        }
    }
}
