package Menu;

import Instruments.Nutritious;

public class IceCream extends Product {

    public IceCream(String sirop) {
        super("Мороженное");
        this.param = sirop;
        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof IceCream)) return false;
        return param.equals(((IceCream) object).param);
    }
}
