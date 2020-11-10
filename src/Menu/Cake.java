package Menu;

import Instruments.Nutritious;

public class Cake extends Product {

    public Cake(String icing) {
        super("Пироженое");
        this.param = icing;

        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Cake)) return false;
        return param.equals(((Cake) object).param);
    }
}
