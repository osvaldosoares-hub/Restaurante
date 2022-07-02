package Restaurante;

import java.util.ArrayList;


public class ListaRestaurante {
    
    private ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

   
    public void PegarRestaurante(Restaurante restaurante){
        this.restaurantes.add(restaurante);
    }
    public void MostraRestaurante(){
        System.out.println();
        System.out.println("Restaurante: ");

        for (Restaurante res : restaurantes) {
            System.out.println(res.getNome()+" "+ res.getEnd()+" " + res.getId());
            System.out.println();
        }
    }
}
