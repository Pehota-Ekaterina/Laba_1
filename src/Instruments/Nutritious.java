package Instruments;

import Menu.*;

public interface Nutritious {

    static void calculateCalories(Product product) {

        if(product instanceof Tea){
            if (product.getParam().equals("чёрный"))
                product.setCalories(7);
            else
                product.setCalories(5);
        } else if(product instanceof Pie){
            if (product.getParam().equals("вишнёвая"))
                product.setCalories(10);
            else if (product.getParam().equals("клубничная"))
                product.setCalories(15);
            else
                product.setCalories(5);
        }else if(product instanceof Milk){
            if (product.getParam().equals("1.5%"))
                product.setCalories(10);
            else if (product.getParam().equals("2.5%"))
                product.setCalories(15);
            else
                product.setCalories(20);
        }else if(product instanceof Potatoes){
            if (product.getParam().equals("жареная"))
                product.setCalories(10);
            else if (product.getParam().equals("вареная"))
                product.setCalories(5);
            else
                product.setCalories(15);
        }else  if(product instanceof Burger){
            if (product.getParam().equals("малый"))
                product.setCalories(5);
            else if (product.getParam().equals("средний"))
                product.setCalories(10);
            else
                product.setCalories(15);
        }else if(product instanceof Coffee){
            if (product.getParam().equals("насыщенный"))
                product.setCalories(5);
            else if (product.getParam().equals("горький"))
                product.setCalories(7);
            else
                product.setCalories(9);
        }else if(product instanceof IceCream){
            if (product.getParam().equals("карамель"))
                product.setCalories(5);
            else
                product.setCalories(7);
        }else if(product instanceof ChewingGum){
            if (product.getParam().equals("мята"))
                product.setCalories(5);
            else if (product.getParam().equals("арбуз"))
                product.setCalories(7);
            else
                product.setCalories(2);
        }else if(product instanceof Eggs){
            if (product.getParam().equals("один"))
                product.setCalories(5);
            else if (product.getParam().equals("два"))
                product.setCalories(7);
            else
                product.setCalories(9);
        }else if(product instanceof Lemonade){
            if (product.getParam().equals("лимон"))
                product.setCalories(4);
            else if (product.getParam().equals("апельсин"))
                product.setCalories(7);
            else
                product.setCalories(5);

        }else if(product instanceof  Cake){
            if (product.getParam().equals("шоколадная"))
                product.setCalories(5);
            else if (product.getParam().equals("сливочная"))
                product.setCalories(10);
            else
                product.setCalories(15);
        }else if(product instanceof Beef){
            if (product.getParam().equals("с кровью"))
                product.setCalories(10);
            else if (product.getParam().equals("норма"))
                product.setCalories(15);
            else
                product.setCalories(20);
        }
    }

}
