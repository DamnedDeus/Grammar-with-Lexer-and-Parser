package java;

import java.Row;
import java.Column;
import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Column> columns;
    private List<Row> rows;
    private List<List<String>> cells;
    public Table(){
        columns = new ArrayList<>();
        rows = new ArrayList<>();
        cells = new ArrayList<>();
    }
    public int update(Integer id, String name, String value){
        for( Column column : columns) {
            for( Row row : rows) {
                if(row.getNumber() == id && column.getName().equals(name)) {
                    cells.get(column.getNumber()).set(id, value);
                    return 1;
                }
            }
        }
        return 0;
    }

    public String find(Integer id, String name){
        for( Column column : columns) {
            for( Row row : rows) {
                if(row.getNumber() == id && column.getName().equals(name))
                    return cells.get(column.getNumber()).get(id);
            }
        }
        return "";
    }

    public String find(Integer id, String name, String rez){
        for( Column column : columns) {
            for( Row row : rows) {
                if(row.getNumber() == id && column.getName().equals(name)) {
                    rez = cells.get(column.getNumber()).get(id);
                    return rez;
                }
            }
        }
        return "";
    }

    public int delete(Row row){
        int number = row.getNumber();
        for(int i=0; i < columns.size(); i++){
            cells.get(i).remove(number);
        }
        return 0;
    }
    public int delete(Integer num){
        for(int i=0; i < columns.size(); i++){
            cells.get(i).remove(num);
        }
        return 0;
    }

    public void delete(Column column){
        int number = column.getNumber();
        for(int i=0; i < columns.size(); i++){
            if(columns.get(i).getNumber() == number)
                cells.remove(i);
            else if(columns.get(i).getNumber() > number)
                columns.get(i).setNumber(number - 1);
        }
        columns.remove(number);
    }

    public int addColumn(Column column){
        if (column.getNumber() < columns.size()) {
            List<String> temp = new ArrayList<>();
            for(Row row :rows){
                temp.add("");
            }
            cells.add(column.getNumber(), temp);
            columns.add(column.getNumber(), column);
            return 1;
        }
        return 0;
    }

    public int addRow(Row row){
        if (row.getNumber() < rows.size()) {
            for(int i = 0; i < columns.size(); i++)
                cells.get(i).add(row.getNumber(), "");
            rows.add(row.getNumber(), row);
            return 1;
        }
        return 0;
    }


}
