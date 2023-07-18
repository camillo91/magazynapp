package CLASS;


import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


// model tabeli do wyswietlania obrazow produktow w jtable
public class MyTableModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public MyTableModel(){}
    
    public MyTableModel(Object[][] data, String[] columnsName){
        this.columns = columnsName;
        this.rows = data;
    }
    
    public Class getColumnClass(int col)
    {
        // indeks kolumny obrazu to 4
        if(col == 4){ return Icon.class; }
        
        else{
            return getValueAt(0, col).getClass();
        }
    }
    
    @Override
    public int getRowCount() {
    
        return this.rows.length;
        
    }

    @Override
    public int getColumnCount() {
    
        return this.columns.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        return this.rows[rowIndex][columnIndex];
        
    }
    
    @Override
    public String getColumnName(int col){
        
        return this.columns[col];
        
    }
    
}
