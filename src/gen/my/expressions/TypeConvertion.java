package gen.my.expressions;

public class TypeConvertion extends Expression {
    private String type, variable;

    public TypeConvertion(String type, String variable) {
        this.type = type;
        this.variable = variable;
    }

    @Override
    public String toString() {
        if (type.equals("Integer"))
            return "Math.round(" + variable + ")";
        else if (type.equals("Float"))
            return "Float.valueOf(" + variable + ")";
        else if (type.equals("String"))
            return "(" + variable + ").toString()";
        else if (type.equals("Table") || type.equals("Row") || type.equals("Column"))
            return "(" + type + ") " + variable;
        else try {
                throw  new Exception("wrong type");
            } catch (Exception e) {
                e.printStackTrace();
            }
        return "we have exception, we dont need return, come on";
    }
}
