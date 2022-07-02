package Pessoas;

public class PessoaJ extends Pessoas{
    private String cnpj;

    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public  void imprimir(){
       System.out.println();
       System.out.println( "Pessoa juridica: " +getNome() + "\ntelefone : " +  getTelefone()+ " \n");
       MostrarPedidos();
    }


}
