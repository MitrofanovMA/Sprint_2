package model;

import model.constants.Colour;
import model.constants.Discount;

public abstract class Food implements Discountable{
    private int amount;
    private double price;
    private boolean isVegetarian;
    private String colour;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;


    }

    @Override
    public double getDiscount(){
        if (colour == Colour.RED){
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

}
