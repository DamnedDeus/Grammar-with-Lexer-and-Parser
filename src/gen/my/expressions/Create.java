package gen.my.expressions;

import gen.my.base.Base;

import java.util.List;
import java.util.Locale;

public class Create extends Expression {
    private List<Base> parameters;
    private String type;

    public Create(List<Base> parameters, String type) {
        this.parameters = parameters;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder params = new StringBuilder();
        if(parameters != null) {
            for(Base parameter : parameters) {
                params.append(parameter.toString()).append(",");
            }
            params.deleteCharAt(params.length() - 1);
        }
        return "new " + type + "(" + params + ")";
    }
}


