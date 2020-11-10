package Menu;

import Instruments.Nutritious;

public class Lemonade extends Product {

    public Lemonade(String taste) {
        super("Лимонад");
        this.param = taste;

        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Lemonade)) return false;
        return param.equals(((Lemonade) object).param);
    }
}
