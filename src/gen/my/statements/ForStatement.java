package gen.my.statements;

import gen.my.base.Base;
import gen.my.expressions.Condition;
import gen.my.expressions.DefineVar;
import gen.my.expressions.Expression;

import java.util.List;

public class ForStatement extends Statement {

    private DefineVar parameter;
    private List<Base> statements;
    private Condition condition;
    private Expression expression;

    public ForStatement(DefineVar parameter, List<Base> statements, Condition condition, Expression expression) {
        this.parameter = parameter;
        this.statements = statements;
        this.condition = condition;
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Base stat : statements) {
            builder.append(stat.toString());
            if(!stat.toString().endsWith("}"))
                builder.append(";");
        }
        return "for(" + parameter.toString() + ";" + condition.toString() + ";"
                + expression.toString() + "){" + builder + "}";
    }

}
