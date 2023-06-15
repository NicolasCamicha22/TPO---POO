package uade.edu.ar.ui.menu;

import uade.edu.ar.ui.table.CustomTable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu2 extends JFrame implements ActionListener {

    public Menu2(String title) {
        super(title);
        setBounds(40,40,600,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu file = new JMenu("File");
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);
        file.add(quit);
        menuBar.add(file);
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(this);
        file.add(open);
        JMenuItem table = new JMenuItem("Table");
        table.addActionListener(this);
        file.add(table);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        if (choice.equals("Quit")) {
            System.exit(0);
        }
        else if (choice.equals("Open")) {
            JOptionPane.showMessageDialog(this,"You hit Open");
        }else if (choice.equals("Table")) {
            CustomTable myApp;
            try {
                myApp = new CustomTable("Tabla Custom");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            myApp.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Menu2 menu = new Menu2("Menu Dialog");
        menu.setVisible(true);
    }

}
