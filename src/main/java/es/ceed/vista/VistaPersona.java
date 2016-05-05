package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

/**
 * Created by carlos on 5/4/16.
 */
public class VistaPersona extends JFrame {

    private JTextField txt_id_persona;
    private JTextField txt_contraseña;
    private JTextField txt_pass;
    private JTextField txt_grupo;
    private JButton btn_entrar;
    private JButton btn_salir;

    public VistaPersona(){
        super("Vista persona");
        init();
    }

    private void init() {

        JPanel pnl_top = new JPanel(new GridLayout(2,4,10,10));
        txt_id_persona = new JTextField();
        txt_contraseña = new JTextField();
        txt_pass = new JTextField();
        txt_grupo = new JTextField();
        btn_entrar = new JButton("Entrar");
        btn_salir = new JButton("Salir");

        pnl_top.add(new JLabel("idPersona"));
        pnl_top.add(txt_id_persona);
        pnl_top.add(new JLabel("Pass"));
        pnl_top.add(txt_pass);
        pnl_top.add(new JLabel("Contraseña"));
        pnl_top.add(txt_contraseña);
        pnl_top.add(new JLabel("Grupo"));
        pnl_top.add(txt_grupo);

        JPanel pnl_bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnl_bottom.add(btn_entrar);
        pnl_bottom.add(btn_salir);


        this.setLayout(new FlowLayout());
        this.add(pnl_top);
        this.add(pnl_bottom);

        this.setPreferredSize(new Dimension(450,150));
        this.setResizable(false);
        this.setLocationRelativeTo(null); //centrar
        pack();

    }

    public JButton getBtn_entrar() {
        return btn_entrar;
    }

    public JButton getBtn_salir() {
        return btn_salir;
    }

    public JTextField getTxt_contraseña() {
        return txt_contraseña;
    }

    public JTextField getTxt_pass() {
        return txt_pass;
    }

    public JTextField getTxt_grupo() {
        return txt_grupo;
    }

    public JTextField getTxt_id_persona() {

        return txt_id_persona;
    }
}
