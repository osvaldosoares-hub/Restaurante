import java.util.Scanner;


import Pessoas.PessoaF;
import Pessoas.PessoaJ;
import Pessoas.Pessoas;
import Restaurante.Cardapio;
import Restaurante.ListaRestaurante;
import Restaurante.Restaurante;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoas p1 = new PessoaF();
        p1.setNome("valdim");
        p1.setPassoword("nicole A mulher mais linda do mundo");
        p1.setEmail("valdim@gmail.com.br");
        p1.setTelefone(99999999);
        //p1.setDateNascimento(26042001);

        PessoaJ pj =new PessoaJ();
        pj.setNome("nicole");
        pj.setPassoword("nicole A mulher mais gostosa do mundo");
        pj.setEmail("nicole@gmail.com.br");
        pj.setTelefone(88888888);

        PessoaJ pj1 =new PessoaJ();
        pj1.setNome("valdim");
        pj1.setPassoword("nicole A mulher mais gostosa do mundo");
        pj1.setEmail("valdimn@gmail.com.br");
        pj1.setTelefone(11111111);

        PessoaJ pj2 =new PessoaJ();
        pj2.setNome("igor");
        pj2.setPassoword("nicole A mulher mais gostosa do mundo");
        pj2.setEmail("igor@gmail.com.br");
        pj2.setTelefone(99999999);
        PessoaJ pj3 =new PessoaJ();
        pj3.setNome("virg");
        pj3.setPassoword("nicole A mulher mais gostosa do mundo");
        pj3.setEmail("nicole@gmail.com.br");
        pj3.setTelefone(22222222);
        PessoaJ pj4 =new PessoaJ();
        pj4.setNome("dorgival");
        pj4.setPassoword("nicole A mulher mais gostosa do mundo");
        pj4.setEmail("nicole@gmail.com.br");
        pj4.setTelefone(45555555);
        ListaRestaurante l = new ListaRestaurante();

        Scanner sc1 = new Scanner(System.in);
        

        Restaurante r1 = new Restaurante("trash","lagoa seca","boa pra crl",123);
        Restaurante r2 = new Restaurante("venezza","lagoa seca","boa pra crl",123);
        l.PegarRestaurante(r1);
        l.PegarRestaurante(r2);

        l.MostraRestaurante();



        Cardapio c1 = new Cardapio("sushi", "um sushizao", 3000, "é de ouro",123231);
        Cardapio c2 = new Cardapio("hamburguer", "hamburguer", 10, "é de ouro",122133);
        Cardapio c3 = new Cardapio("pizza", "pizza", 30, "é de ouro",122222);
        Cardapio c4 = new Cardapio("coxinha", "coxinha", 5, "é de ouro",133333);
        Cardapio c5 = new Cardapio("bigbig", "chiclete", 0.5, "é de ouro",111111);
        r1.PegarCardapio(c1);
        r1.PegarCardapio(c2);
        r1.PegarCardapio(c3);
        r1.PegarCardapio(c4);
        r1.PegarCardapio(c5);
        



        Cardapio c6 = new Cardapio("Hambuguer artesanal", "Hambuguer artesanal", 3000, "é de ouro",123231);
        Cardapio c7 = new Cardapio("hamburguer", "hamburguer", 10, "é de ouro",122133);
        Cardapio c8 = new Cardapio("pizza", "pizza", 300, "é de ouro",122222);
        Cardapio c9 = new Cardapio("coxinha", "coxinha", 5, "é de ouro",133333);
        Cardapio c0 = new Cardapio("bigbig", "chiclete", 0.5, "é de ouro",111111);
        r2.PegarCardapio(c6);
        r2.PegarCardapio(c7);
        r2.PegarCardapio(c8);
        r2.PegarCardapio(c9);
        r2.PegarCardapio(c0);




        //pj.MostraRestaurante(r1);
        System.out.println();
        pj1.MostraRestaurante(r2);
        /*pj2.MostraRestaurante(r1);
        pj3.MostraRestaurante(r1);
        pj4.MostraRestaurante(r1);
        */
       
        /*System.out.println("fale o restaurante");
        String nomedoRestaurante = sc1.nextLine();
        if(nomedoRestaurante.equals(r1.getNome())){
            
            pj.MostraRestaurante(r1);
            System.out.println();
           
           



            
            //p2.setPedidos(pedir);
            
        }else{
           
            pj.MostraRestaurante(r2);
           
            //p2.setPedidos(pedir);
           
        }*/
        //sc1.close();

       pj.imprimir();
       pj1.imprimir();
       pj2.imprimir();
       pj3.imprimir();
       pj4.imprimir();

        
       


    }
}
