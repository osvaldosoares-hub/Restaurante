package Pessoas;



import java.util.Date;
import java.util.Scanner;

import Pedidos.Pedidos;

import Restaurante.Restaurante;

public  class Pessoas {
    private String nome;
    private String email;
    private Date dateNascimento;
    private int telefone;
    private String passoword; 
    private int id;
    private Pedidos pedidos = new Pedidos();
    static int qtd;

    public static int getQtd() {
        return qtd;
    }
    public static void setQtd(int qtd) {
        Pessoas.qtd = qtd;
    }
    
    public String getNome() {
        return nome;
    }
    public Date getDateNascimento() {
        return dateNascimento;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    public String getPassoword() {
        return passoword;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setDateNascimento(Date dateNascimento) {
        this.dateNascimento = dateNascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void MostraRestaurante(Restaurante r1){
        r1.MostrarCardapio();
        
        System.out.println();
        System.out.println("quer fazer o pedido ?");
        System.out.println();

        Scanner sc1 = new Scanner(System.in);
        String  pedido= sc1.next();
        
        if(pedidos.PegarPedidos(r1, pedido)==1){
            Pessoas.qtd++;
        }else{
            System.out.println("deu erro =(");
        }
        sc1.close();
        
        
    }

    public int MostrarPedidos(){
        pedidos.MostrarPedidos();
        return 1;
    }
   
    
    
    
    
    


}
