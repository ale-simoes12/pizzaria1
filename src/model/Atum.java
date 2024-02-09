package model;

/**
 *
 * @author unifpvideira
 */
public class Atum extends Pizza {
    

    public Atum(String tamanho){
        super(tamanho);
        setSabor("Atum");
        setPreco(19);
    }
    
    @Override
    public void montarPizza(){
    
        getIngredientes().add("Massa");
        getIngredientes().add("Molho de Tomate");
        getIngredientes().add("Atum");
        getIngredientes().add("Cebola");
    }
}
