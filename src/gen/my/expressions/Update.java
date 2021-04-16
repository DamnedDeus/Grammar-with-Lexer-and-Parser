package gen.my.expressions;

import gen.my.base.Base;

import java.util.List;

public class Update extends Expression  {
    private List<Base> parameters;
    private String name;

    public Update(List<Base> parameters, String name) {
        this.parameters = parameters;
        this.name = name;
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
        return name + ".update(" + params + ")";
    }
}
