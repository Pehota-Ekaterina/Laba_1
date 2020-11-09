package Menu;

import Instruments.Nutritious;

public class Burger extends Product {

    public Burger(String size) {
        super("Гамбургер");
        this.param = size;
        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Burger)) return false;
        return param.equals(((Burger) object).param);
    }

}
