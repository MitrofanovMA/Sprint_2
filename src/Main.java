
import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.RED;
import static model.constants.Colour.GREEN;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8,60,GREEN);

        Food[] items = {meat, appleRed, appleGreen};

        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.getPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getPriceIsVegetarianWithoutDiscount());
    }
}