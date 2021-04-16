package gen.my.expressions;

import gen.my.base.Base;

import java.util.List;

public class Delete extends Expression  {
    private Base parameter;
    private String name;

    public Delete(Base parameter, String name) {
        this.parameter = parameter;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ".delete(" + parameter.toString() + ")";
    }
}
