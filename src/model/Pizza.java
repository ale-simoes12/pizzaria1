package model;

import java.util.ArrayList;

/**
 *
 * @author unifpvideira
 */
public class Pizza {
    private String tamanho;
    private double preco;
    private ArrayList<String> ingredientes;
    private String sabor;

    public void montarPizza(){
    }

    public Pizza(String tamanho){
        this.tamanho = tamanho;
        String a = "";
        this.ingredientes = new ArrayList<String>();
        this.ingredientes.add(a);
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the ingredientes
     */
    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
