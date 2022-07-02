import java.util.Scanner;

import Pedidos.Pedidos;
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

        
        

        Restaurante r1 = new Restaurante("nordeste","lagoa seca","boa pra crl",123);
        Restaurante r2 = new Restaurante("venezza","lagoa seca","boa pra crl",123);
        l.PegarRestaurante(r1);
        l.PegarRestaurante(r2);

        l.MostraRestaurante();



        Cardapio c1 = new Cardapio("pamonha", "pamonha", 3000, "pamonha hmmm",123231);
        Cardapio c2 = new Cardapio("pe de muleke", "pe de muleke", 10, "pe de muleke dilicia",122133);
        Cardapio c3 = new Cardapio("vatapa", "vatapa", 30, "vatapa com pimenta",122222);
        Cardapio c4 = new Cardapio("coxinha", "coxinha", 5, "é de ouro",133333);
        Cardapio c5 = new Cardapio("paçoca", "paçoca", 0.5, "paçoquinhaaaa",111111);
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




        
        System.out.println();
        Scanner sc1 = new Scanner(System.in);
        
        /* pedidos do primeiro cliente pj */
        System.out.println("pedido da primeira pessoa PJ");
        System.out.println();
        System.out.println(pj.getNome());
        System.out.println();
        Pedidos pedir = new Pedidos();
        System.out.println("fale o restaurante");
        String nomedoRestaurante;
        nomedoRestaurante = sc1.next();
       

        
        if(nomedoRestaurante.equals(r1.getNome())){
            
           
           
            System.out.println();
            System.out.println("quer fazer o pedido ?");
            System.out.println();

           
            String  pedido;
            int qtd=0;
            String op;
            do{
                pj.MostraRestaurante(r1);
                pedido= sc1.next();
                pedir.PegarPedidos(r1, pedido);
                System.out.println();
                System.out.println("quer pedir mais alguma coisa ?(S/N)");
                op=sc1.next();
                qtd++;
                
            }while(op.equals("s") || op.equals("S"));
            
            
            pj.setQtd(qtd);
            pj.setPedidos(pedir);
            pj.MostrarPedido();
            
                   
        }else if(nomedoRestaurante.equals(r2.getNome())){
           
            pj.MostraRestaurante(r2);
            System.out.println();
           
            System.out.println();
            System.out.println("quer fazer o pedido ?");
            System.out.println();

            
            String  pedido;
            int qtd=0;
            String op;
            do{
                pj.MostraRestaurante(r2);
                pedido= sc1.next();
                pedir.PegarPedidos(r2, pedido);
                System.out.println();
                System.out.println("quer pedir mais alguma coisa ?(S/N)");
                op=sc1.next();
                qtd++;
            }while(op.equals("s") || op.equals("S"));
            
            pj.setQtd(qtd);
            pj.setPedidos(pedir);
            pj.MostrarPedido();
            
        }else{
            System.out.println("errou o nome");
        }
        
        
        System.out.println("pedido da seg pessoa PJ");
        System.out.println();
        System.out.println(pj1.getNome());
        System.out.println();
        String nomedoRestaurante1 = sc1.next();
       
        if(nomedoRestaurante1.equals(r1.getNome())){
            
           
           
            System.out.println();
            System.out.println("quer fazer o pedido ?");
            System.out.println();

            
            String  pedido;
            int qtd=0;
            String op;
            do{
                pj1.MostraRestaurante(r1);
                pedido= sc1.next();
                pedir.PegarPedidos(r1, pedido);
                System.out.println();
                System.out.println("quer pedir mais alguma coisa ?(S/N)");
                op=sc1.next();
                qtd++;
            }while(op.equals("s") || op.equals("S"));
            
            
            pj1.setQtd(qtd);
            pj1.setPedidos(pedir);
            pj1.MostrarPedido();
            
                   
        }else if(nomedoRestaurante1.equals(r2.getNome())){
           
            pj1.MostraRestaurante(r2);
            System.out.println();
           
            System.out.println();
            System.out.println("quer fazer o pedido ?");
            System.out.println();

            
            String  pedido;
            int qtd=0;
            String op;
            do{
                pj1.MostraRestaurante(r2);
                pedido= sc1.next();
                pedir.PegarPedidos(r2, pedido);
                System.out.println();
                System.out.println("quer pedir mais alguma coisa ?(S/N)");
                op=sc1.next();
                qtd++;
            }while(op.equals("s") || op.equals("S"));
           
            pj1.setQtd(qtd);
            pj1.setPedidos(pedir);
            pj1.MostrarPedido();
            
        }else{
            System.out.println("errou o nome");
        }   
        
            
        sc1.close();

        
       Pessoas p = new Pessoas();
       p.PegarPessoa(pj);
       p.PegarPessoa(pj1);
       p.QuemMaisPediu();


    }
}
