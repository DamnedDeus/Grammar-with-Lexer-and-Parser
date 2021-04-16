package java;

public class Column {
    private Table root;
    private String name;
    private Integer number;
    public Column(Table root, String name, Integer number){
        this.root = root;
        this.name = name;
        this.number = number;
        int rez = root.addColumn(this);
        if (rez == 0)
            System.out.println("Error creating Column");
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
