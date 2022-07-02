package Pessoas;



import java.util.ArrayList;
import java.util.Date;


import Restaurante.Restaurante;

public  class Pessoas {
    private String nome;
    private String email;
    private Date dateNascimento;
    private int telefone;
    private String passoword; 
    private int id;
    private ArrayList<PessoaJ> pessoa = new ArrayList<PessoaJ>();
    
    private int qtd=0;

    public  int getQtd() {
        return qtd;
    }
    public  void setQtd(int qtd) {
        this.qtd = qtd;
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
        
       
    }
    public void PegarPessoa(PessoaJ pessoa){
       
        this.pessoa.add(pessoa);
        
    }
    public void QuemMaisPediu(){
        int i,j;
        for( i=0 ; i < pessoa.size();i++){
            PessoaJ p1 = pessoa.get(i);
            for(j=0; j< pessoa.size();j++){
                PessoaJ p2 = pessoa.get(j);
                if(p1.getQtd()>p2.getQtd()){
                    System.out.println(p1.getNome()+" ela(e) q pediu mais");
                }else if(p1.getQtd()<p2.getQtd()){
                    System.out.println(p2.getNome()+" ela(e) q pediu mais");
                }
            }
        }
    }
   
    
    
    
    
    


}
