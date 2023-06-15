package uade.edu.ar.ui.table;

import uade.edu.ar.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomTable extends JFrame implements ActionListener {

    private CustomTableModel tableModel;
    private JTable table;
    private Controller controller;

    public CustomTable(String title) throws Exception {
        super(title);
        setBounds(10,10,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controller = Controller.getInstances();
        tableModel = new CustomTableModel(controller.getAll());
        table = new JTable(tableModel);
        table.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(380,280));
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        add(panel,BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent ae) {

    }
    public static void main(String[] args) throws Exception {
        CustomTable myApp = new CustomTable("Custom Table Model");
        myApp.setVisible(true);
    }
}
