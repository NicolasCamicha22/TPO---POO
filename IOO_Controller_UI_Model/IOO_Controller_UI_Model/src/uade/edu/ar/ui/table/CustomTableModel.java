package uade.edu.ar.ui.table;

import uade.edu.ar.dto.ModelDto;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CustomTableModel extends AbstractTableModel {

    private String[] columnNames = {"ID","Name"};
    private List<ModelDto> dtoArrayList;

    public CustomTableModel(List<ModelDto> list){
        this.dtoArrayList = list;
    }

    public int getColumnCount() {
        return columnNames.length;
    }
    public int getRowCount() {
        int size;
        if (dtoArrayList == null) {
            size = 0;
        }
        else {
            size = dtoArrayList.size();
        }
        return size;
    }

    public Object getValueAt(int row, int col) {
        Object temp = null;
        if (col == 0) {
            temp = dtoArrayList.get(row).getIdModel();
        }
        else if (col == 1) {
            temp = dtoArrayList.get(row).getNameModel();
        }
        return temp;
    }
    // needed to show column names in JTable
    public String getColumnName(int col) {
        return columnNames[col];
    }
    public Class getColumnClass(int col) {
        return String.class;
        }
}

