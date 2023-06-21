package Vista;

import Controlador.ControladorSucursal;
import Modelo.Sucursal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SucursalFormView extends JFrame {
    private JLabel lblNumero;
    private JLabel lblDireccion;
    private JLabel lblResponsable;
    private JTextField txtNumero;
    private JTextField txtDireccion;
    private JTextField txtResponsable;
    private JButton btnModificar;

    private List<Sucursal> sucursales;
    private Sucursal sucursalActual;
    private ControladorSucursal controller;

    public SucursalFormView(List<Sucursal> sucursales, ControladorSucursal controller) {
        this.sucursales = sucursales;
        this.controller = controller;
        initComponents();
        bindData();
        initListeners();
    }

    private void initComponents() {
        lblNumero = new JLabel("Número:");
        lblDireccion = new JLabel("Dirección:");
        lblResponsable = new JLabel("Responsable:");
        txtNumero = new JTextField(10);
        txtDireccion = new JTextField(20);
        txtResponsable = new JTextField(20);
        btnModificar = new JButton("Modificar");

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(lblNumero);
        panel.add(txtNumero);
        panel.add(lblDireccion);
        panel.add(txtDireccion);
        panel.add(lblResponsable);
        panel.add(txtResponsable);
        panel.add(btnModificar);

        setLayout(new FlowLayout());
        add(panel);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void bindData() {
        sucursalActual = sucursales.get(0);
        txtNumero.setText(String.valueOf(sucursalActual.getNumero()));
        txtDireccion.setText(sucursalActual.getDireccion());
        txtResponsable.setText(sucursalActual.getResponsableTecnico().getNombre());
    }

    private void initListeners() {
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.modificarSucursal(txtDireccion.getText(), txtResponsable.getText());
            }
        });
    }

    public void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public Sucursal getSucursalActual() {
        getSucursalActual();
        return sucursalActual;
    }
}