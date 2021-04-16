package gen.my.statements;

import gen.my.base.Base;

import java.util.List;
import java.util.Locale;


public class FunctionCall extends Statement {

    private List<Base> parameters;
    private String name, className;

    public FunctionCall(List<Base> parameters, String name, String className) {
        this.parameters = parameters;
        this.name = name;
        this.className = className;
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
        return className.toLowerCase(Locale.ROOT) + "."  + name + "(" + params + ")";
    }
}
