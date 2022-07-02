package Pessoas;

import Pedidos.Pedidos;

public class PessoaJ extends Pessoas{
    private String cnpj;
    private Pedidos pedidos =new Pedidos();
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
        }   
    public Pedidos getPedidos() {
            return pedidos;
    
     }
    
       
        public void MostrarPedido(){
            imprimir();
            pedidos.MostrarPedidos();
            System.out.println("------------------");
            
        }
    public  void imprimir(){
       System.out.println();
       System.out.println("------------------");
       System.out.println( "Pessoa juridica: " +getNome() + "\ntelefone : " +  getTelefone()+ " \n");
       
    }


}
