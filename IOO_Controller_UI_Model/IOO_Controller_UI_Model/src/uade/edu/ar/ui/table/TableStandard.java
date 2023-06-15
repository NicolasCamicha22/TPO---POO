package uade.edu.ar.ui.table;

import uade.edu.ar.controller.Controller;
import uade.edu.ar.dto.ModelDto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TableStandard extends JFrame implements ActionListener {

    private Object[][] data;
    private String[] columnNames = {"ID","Name"};
    private DefaultTableModel tableModel;
    private JTable table;
    private Controller controller;

    public TableStandard(String title) throws Exception {
        super(title);
        setBounds(10,10,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controller = Controller.getInstances();
        data = convertDtoToData(controller.getAll());
        tableModel = new DefaultTableModel(data, columnNames);
        table = new JTable(tableModel);
        table.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(380,280));
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        add(panel,BorderLayout.CENTER);
    }


    public Object[][] convertDtoToData(List<ModelDto> list) {
        Object[][] data = new Object[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getIdModel();
            data[i][1] = list.get(i).getNameModel();
        }
        return data;
    }

    public void actionPerformed(ActionEvent ae) {

    }
    public static void main(String[] args) throws Exception {
        TableStandard myApp = new TableStandard("Table model");
        myApp.setVisible(true);
    }
}
