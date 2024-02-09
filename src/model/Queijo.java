package model;

/**
 *
 * @author unifpvideira
 */
public class Queijo extends Pizza {
    

    public Queijo(String tamanho){
        super(tamanho);
        setSabor("Queijo");
        setPreco(17);
    }
    
    @Override
    public void montarPizza(){
    
        getIngredientes().add("Massa");
        getIngredientes().add("Molho de Tomate");
        getIngredientes().add("Muçarela");
    }
}
