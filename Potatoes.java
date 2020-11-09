package Menu;

import Instruments.Nutritious;

public class Potatoes extends Product {

    public Potatoes(String type) {
        super("Картошка");
        this.param = type;
        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Potatoes)) return false;
        return param.equals(((Potatoes) object).param);
    }

}
