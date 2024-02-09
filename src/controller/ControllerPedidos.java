package controller;

import view.Pedidos;

/**
 *
 * @author unifpvideira
 */
public class ControllerPedidos {
    
    private Pedidos viewP;

    public ControllerPedidos(Pedidos viewP) {
        this.viewP = viewP;
    }

    /**
     * @return the viewP
     */
    public Pedidos getViewP() {
        return viewP;
    }

    /**
     * @param viewP the viewP to set
     */
    public void setViewP(Pedidos viewP) {
        this.viewP = viewP;
    }
}
