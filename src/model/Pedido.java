package model;

import java.util.ArrayList;

/**
 *
 * @author unifpvideira
 */
public class Pedido {
    
    private Cliente cliente;
    private int num;
    private ArrayList<Pizza> pizzas;

    public Pedido(Cliente c, ArrayList<Pizza> p, int num){
        this.num = num;
        this.cliente = c;
        this.pizzas = p;
    }

    public String salvaPedido(){
        String ret = num + " " + cliente.getNome();
        for(Pizza i : pizzas){
            ret += "\n" + i.getSabor() + " " + i.getTamanho() + " " + i.getPreco();
        }
        return ret;
    }
}
