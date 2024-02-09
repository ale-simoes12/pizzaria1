package model;

/**
 *
 * @author unifpvideira
 */
public class Portuguesa extends Pizza {
    

    public Portuguesa(String tamanho){
        super(tamanho);
        setSabor("Portuguesa");
        setPreco(24);
    }
    
    @Override
    public void montarPizza(){
    
        getIngredientes().add("Massa");
        getIngredientes().add("Molho de Tomate");
        getIngredientes().add("Muçarela");
        getIngredientes().add("Presunto");
        getIngredientes().add("Palmito");
        getIngredientes().add("Ovo cozido");
    }
}
