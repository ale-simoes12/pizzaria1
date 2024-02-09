package model;

/**
 *
 * @author unifpvideira
 */
public class FrangoCatupiry extends PizzaFrango {
    

    public FrangoCatupiry(String tamanho){
        super(tamanho);
        setSabor("Frango com Catupiry");
        setPreco(22);
    }

    @Override
    public void montarPizza(){
        getIngredientes().add("Massa");
        getIngredientes().add("Molho de Tomate");
        getIngredientes().add("Frango desfiado");
        getIngredientes().add("Catupiry");
    }
}
