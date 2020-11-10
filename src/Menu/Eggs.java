package Menu;

import Instruments.Nutritious;

public class Eggs extends Product {

    public Eggs(String numder) {
        super("Яйца");
        this.param = numder;

        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Eggs)) return false;
        return param.equals(((Eggs) object).param);
    }
}
