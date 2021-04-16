package gen.my.statements;

import gen.my.base.Base;
import gen.my.expressions.Parameter;

import java.util.List;


public class Function extends Statement {
    private List<Parameter> parameters;
    private String name ,type;
    private List<Base> statements;

    public Function() {
    }

    public Function(List<Parameter> parameters, String name, String type, List<Base> statements) {
        this.parameters = parameters;
        this.name = name;
        this.type = type;
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StringBuilder params  = new StringBuilder();
        if(statements != null) {
            for (Base stat: statements) {
                builder.append(stat.toString());
                if(!stat.toString().endsWith("}"))
                    builder.append(";");
            }
        }
        if(parameters != null) {
            for (Base parameter : parameters) {
                params.append(parameter.toString()).append(",");
            }
            params.deleteCharAt(params.length() - 1);
        }
        return "private static " + type + "  " + name + " ( " + params + " ) " + "{ "  + builder + "}";
    }
}
