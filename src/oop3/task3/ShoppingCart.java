package oop3.task3;


import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem cartItem) {
        items.add(cartItem);
        System.out.println("elave olundu ");
    }

    public void removeItem(String name) {
        CartItem itemToRemove = null;
        for (CartItem item : items) {
            if (item.getProduct().getName().equals(name)) {
                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            items.remove(itemToRemove);
            System.out.println("Mehsul silindi: " + name);
        } else {
            System.out.println("Bu adla mehsul tapilmadi.");
        }
    }

    public Double getTotalPrice() {
        double total = 0.0;

        for (CartItem item : items) {
            total += item.getProduct().getPrice();
        }

        return total;
    }
}
