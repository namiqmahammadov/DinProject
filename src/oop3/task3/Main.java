package oop3.task3;

import oop3.task2.Animal;
import oop3.task2.Elephant;
import oop3.task2.Leon;
import oop3.task2.Monkey;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("t1", 120.0);
        Product product2 = new Product("t2", 121.0);
        Product product3 = new Product("t3", 123.0);
        CartItem cartItem1 = new CartItem(product1, 3);
        CartItem cartItem2 = new CartItem(product2, 4);
        CartItem cartItem3 = new CartItem(product3, 5);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(cartItem1);
        shoppingCart.addItem(cartItem2);
        shoppingCart.addItem(cartItem2);
        System.out.println(shoppingCart.getTotalPrice());
        shoppingCart.removeItem("t1");
    }
}
