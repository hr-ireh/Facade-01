package ir.hri.view;

import ir.hri.bl.ProductOrderFacade;

public class App {
    public static void main(String[] args) {
        ProductOrderFacade productOrderFacade = new ProductOrderFacade();
        productOrderFacade.addToCart(1);
        productOrderFacade.addToCart(4);

        productOrderFacade.generateOrder();
    }
}
