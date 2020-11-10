import Instruments.ProductComparator;
import Menu.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args){

        Product[] breakfast = new Product[3];

        int item = 0;

        for (String arg: args){

            String[] parts = arg.split("/");

            if(parts[0].equals("Tea")){
                breakfast[item] = new Tea(parts[1]);
            }else
            if(parts[0].equals("Pie")){
                breakfast[item] = new Pie(parts[1]);
            }else
            if(parts[0].equals("Milk")){
                breakfast[item] = new Milk(parts[1]);
            }else
            if(parts[0].equals("Potatoes")){
                breakfast[item] = new Potatoes(parts[1]);
            }else
            if(parts[0].equals("Burger")){
                breakfast[item] = new Burger(parts[1]);
            }else
            if(parts[0].equals("Coffee")){
                breakfast[item] = new Coffee(parts[1]);
            }else
            if(parts[0].equals("IceCream")){
                breakfast[item] = new IceCream(parts[1]);
            }else
            if(parts[0].equals("ChewingGum")){
                breakfast[item] = new ChewingGum(parts[1]);
            }else
            if(parts[0].equals("Eggs")){
                breakfast[item] = new Eggs(parts[1]);
            }else
            if(parts[0].equals("Lemonade")){
                breakfast[item] = new Lemonade(parts[1]);
            }else
            if(parts[0].equals("Cake")){
                breakfast[item] = new Cake(parts[1]);
            }else
            if (parts[0].equals("Beef")){
                breakfast[item] = new Beef(parts[1]);
            } else
            if (parts[0].equals("-calories")){
                System.out.println("Общая калорийность завтрака: " + Product.calculate(breakfast));
            }else
            if (parts[0].equals("-sort")){
                Arrays.sort(breakfast, new ProductComparator());
            }

            item++;
        }

        int count = 0;
        Product simple = breakfast[0];
        for(Product product: breakfast) {
            if(simple.equals(product)) {
                count += 1;
            }
        }
        System.out.println(count);

        for(Product product: breakfast){
            System.out.println(product.getName() + " " + product.getParam() + " " + product.getCalories());
        }

    }
}
