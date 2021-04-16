package java;

public class Row {
    private Table root;
    private Integer number;

    public Row(Table root,Integer number){
        this.root = root;
        this.number = number;
        int rez = root.addRow(this);
        if (rez == 0)
            System.out.println("Error creating Row");
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
