package Instruments;

import Menu.*;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    public int compare(Product pr0, Product pr1){

        if (pr0 == null)
            return -1;
        if (pr1 == null)
            return 1;

        return -pr0.getCalories().compareTo(pr1.getCalories());
    }
}
