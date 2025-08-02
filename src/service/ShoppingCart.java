package service;
import model.Food;
import model.Discountable;

public class ShoppingCart {
    protected Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getPriceWithoutSale() {
        double price = 0;
        for (Food item : items) {
            price += item.getAmount() * item.getPrice();
        }
        return price;
    }

    public double getPriceWithSale() {
        double price = 0;
        for (Food item : items) {
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            price += item.getAmount() * item.getPrice() * (100 - discount) / 100;
        }
        return price;
    }

    public double getPriceIsVegetarianWithoutSale() {
        double price = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                price += item.getAmount() * item.getPrice();
            }
        }
        return price;
    }


}
