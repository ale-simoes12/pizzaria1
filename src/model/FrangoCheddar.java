package model;

/**
 *
 * @author unifpvideira
 */
public class FrangoCheddar extends PizzaFrango {
    

    public FrangoCheddar(String tamanho){
        super(tamanho);
        setSabor("Frango com Cheddar");
        setPreco(22);
    }

    @Override
    public void montarPizza(){
    
        getIngredientes().add("Massa");
        getIngredientes().add("Molho de Tomate");
        getIngredientes().add("Frango desfiado");
        getIngredientes().add("Cheddar");
    }
}
