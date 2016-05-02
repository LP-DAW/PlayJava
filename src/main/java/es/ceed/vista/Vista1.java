/**
 * Created by carlos on 4/21/16.
 */

package es.ceed.vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Vista1 extends JFrame {
    public Vista1() {
        super("Control Acceso");
        init();
    }

    private void init() {
        //labels
        JLabel lbl_info = new JLabel("");

        //JText
        JTextField txt_user = new JTextField("admin",10);
        JPasswordField txt_password = new JPasswordField("1234",10);

        //JButton
        JButton btn_entrar = new JButton("Entrar");
        JButton btn_salir = new JButton("Salir");


        //panels
        JPanel pnl_top = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        pnl_top.add(new JLabel("Usuario"));
        pnl_top.add(txt_user);
        pnl_top.add(new JLabel("Contraseña"));
        pnl_top.add(txt_password);

        JPanel pnl_middle = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        pnl_middle.add(btn_entrar);
        pnl_middle.add(btn_salir);

        JPanel pnl_bottom = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        pnl_bottom.add(lbl_info);

        //window
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        add(pnl_top);
        add(pnl_middle);
        add(pnl_bottom);

        //this.setSize(200,300);
        this.setPreferredSize(new Dimension(450,150));
        this.setResizable(false);
        this.setLocationRelativeTo(null); //centrar
        pack();
    }






}


