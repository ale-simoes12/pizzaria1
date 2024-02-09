package controller;

import view.FrmPrincipal;
import view.Pedidos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Pizza;
import model.FrangoCatupiry;
import model.FrangoCheddar;
import model.Atum;
import model.Calabresa;
import model.Portuguesa;
import model.Queijo;
import model.Cliente;
import model.Pedido;

/**
 *
 * @author unifpvideira
 */
public class Controller {
    
    private FrmPrincipal view;
    private int num = 0;
    private Pedidos pj = new Pedidos();

    public Controller(FrmPrincipal view) {
        this.view = view;
    }

    public void concluiPedido(ArrayList<Pizza> pizzas){
        num +=1;
        String nome = view.getNome().getText();
        String endereco = view.getEndereco().getText();
        String tel = view.getTel().getText();
        Cliente c = new Cliente(nome, endereco, tel);
        Pedido p = new Pedido(c, pizzas, num);
        ControllerPedidos con = new ControllerPedidos(pj);
        String txtAnt = con.getViewP().getHistorico().getText();
        if(txtAnt.equals("")){
            con.getViewP().getHistorico().setText(p.salvaPedido());
        }
        else{
            con.getViewP().getHistorico().setText(txtAnt + "\n\n" + p.salvaPedido());
        }
        view.getSabores().clear();
        view.getTxtPedido().setText("");
        view.getNome().setText("");
        view.getEndereco().setText("");
        view.getTel().setText("");
        JOptionPane.showMessageDialog(view, "Pedido número: " + num);
    }
    
    public void exibiPJ(){
        pj.setVisible(true);
    }

    public Pizza frangoCatu(){
        String nome = view.getNome().getText();
        String endereco = view.getEndereco().getText();
        String tel = view.getTel().getText();
        String tamanho = view.getTamanho().getSelectedItem().toString();
        String txtAnt = view.getTxtPedido().getText();
        if(txtAnt.equals("")){
            view.getTxtPedido().setText(nome + " " + endereco + " " + tel + "\n" + "Frango com Catupiry " + tamanho + " 22");
        }
        else{
            view.getTxtPedido().setText(txtAnt + "\n" + "Frango com Catupiry " + tamanho + " 22");
        }
        
        Pizza p = new FrangoCatupiry(tamanho);
        return p;
    }
    public Pizza frangoChe(){
        String nome = view.getNome().getText();
        String endereco = view.getEndereco().getText();
        String tel = view.getTel().getText();
        String tamanho = view.getTamanho().getSelectedItem().toString();
        String txtAnt = view.getTxtPedido().getText();
        if(txtAnt.equals("")){
            view.getTxtPedido().setText(nome + " " + endereco + " " + tel + "\n" + "Frango com Cheddar " + tamanho + " 22");
        }
        else{
            view.getTxtPedido().setText(txtAnt + "\n" + "Frango com Cheddar " + tamanho + " 22");
        }
        Pizza p = new FrangoCheddar(tamanho);
        return p;
    }
    public Pizza queijo(){
        String nome = view.getNome().getText();
        String endereco = view.getEndereco().getText();
        String tel = view.getTel().getText();
        String tamanho = view.getTamanho().getSelectedItem().toString();
        String txtAnt = view.getTxtPedido().getText();
        if(txtAnt.equals("")){
            view.getTxtPedido().setText(nome + " " + endereco + " " + tel + "\n" + "Queijo " + tamanho + " 17");
        }
        else{
            view.getTxtPedido().setText(txtAnt + "\n" + "Queijo " + tamanho + " 17");
        }
        Pizza p = new Queijo(tamanho);
        return p;
    }
    public Pizza portuguesa(){
        String nome = view.getNome().getText();
        String endereco = view.getEndereco().getText();
        String tel = view.getTel().getText();
        String tamanho = view.getTamanho().getSelectedItem().toString();
        String txtAnt = view.getTxtPedido().getText();
        if(txtAnt.equals("")){
            view.getTxtPedido().setText(nome + " " + endereco + " " + tel + "\n" + "Portuguesa " + tamanho + " 24");
        }
        else{
            view.getTxtPedido().setText(txtAnt + "\n" + "Portuguesa " + tamanho + " 24");
        }
        Pizza p = new Portuguesa(tamanho);
        return p;
    }
    public Pizza atum(){
        String nome = view.getNome().getText();
        String endereco = view.getEndereco().getText();
        String tel = view.getTel().getText();
        String tamanho = view.getTamanho().getSelectedItem().toString();
        String txtAnt = view.getTxtPedido().getText();
        if(txtAnt.equals("")){
            view.getTxtPedido().setText(nome + " " + endereco + " " + tel + "\n" + "Atum " + tamanho + " 19");
        }
        else{
            view.getTxtPedido().setText(txtAnt + "\n" + "Atum " + tamanho + " 19");
        }
        Pizza p = new Atum(tamanho);
        return p;
    }
    public Pizza calabresa(){
        String nome = view.getNome().getText();
        String endereco = view.getEndereco().getText();
        String tel = view.getTel().getText();
        String tamanho = view.getTamanho().getSelectedItem().toString();
        String txtAnt = view.getTxtPedido().getText();
        if(txtAnt.equals("")){
            view.getTxtPedido().setText(nome + " " + endereco + " " + tel + "\n" + "Calabresa " + tamanho + " 18");
        }
        else{
            view.getTxtPedido().setText(txtAnt + "\n" + "Calabresa " + tamanho + " 18");
        }
        Pizza p = new Calabresa(tamanho);
        return p;
    }
    public void opCatu(){
        FrangoCatupiry c = new FrangoCatupiry("");
        c.montarPizza();
        String ingredientes = "Ingredientes\n";
        for (String i : c.getIngredientes()){
            ingredientes += i + "\n";
        }
        JOptionPane.showMessageDialog(view, ingredientes);
    }
    public void opChe(){
        Pizza c = new FrangoCheddar("");
        c.montarPizza();
        String ingredientes = "Ingredientes\n";
        for (String i : c.getIngredientes()){
            ingredientes += i + "\n";
        }
        JOptionPane.showMessageDialog(view, ingredientes);
    }
    public void opAtum(){
        Pizza c = new Atum("");
        c.montarPizza();
        String ingredientes = "Ingredientes\n";
        for (String i : c.getIngredientes()){
            ingredientes += i + "\n";
        }
        JOptionPane.showMessageDialog(view, ingredientes);
    }
    public void opCalabresa(){
        Pizza c = new Calabresa("");
        c.montarPizza();
        String ingredientes = "Ingredientes\n";
        for (String i : c.getIngredientes()){
            ingredientes += i + "\n";
        }
        JOptionPane.showMessageDialog(view, ingredientes);
    }
    public void opPortuguesa(){
        Pizza c = new Portuguesa("");
        c.montarPizza();
        String ingredientes = "Ingredientes\n";
        for (String i : c.getIngredientes()){
            ingredientes += i + "\n";
        }
        JOptionPane.showMessageDialog(view, ingredientes);
    }
    public void opQueijo(){
        Pizza c = new Queijo("");
        c.montarPizza();
        String ingredientes = "Ingredientes\n";
        for (String i : c.getIngredientes()){
            ingredientes += i + "\n";
        }
        JOptionPane.showMessageDialog(view, ingredientes);
    }
}
