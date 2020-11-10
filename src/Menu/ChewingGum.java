package Menu;

import Instruments.Nutritious;

public class ChewingGum extends Product {

    public ChewingGum(String flavour) {
        super("Жевательная резинка");
        this.param = flavour;

        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof ChewingGum)) return false;
        return param.equals(((ChewingGum) object).param);
    }
}
