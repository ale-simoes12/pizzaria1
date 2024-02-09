package model;

/**
 *
 * @author unifpvideira
 */
public class Calabresa extends Pizza {
    

    public Calabresa(String tamanho){
        super(tamanho);
        setSabor("Calabresa");
        setPreco(18);
    }
    
    @Override
    public void montarPizza(){
    
        getIngredientes().add("Massa");
        getIngredientes().add("Molho de Tomate");
        getIngredientes().add("Calabresa");
        getIngredientes().add("Cebola");
    }
}
