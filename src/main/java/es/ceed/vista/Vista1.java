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


        //this.setSize(200,300);
        this.setPreferredSize(new Dimension(450,150));
        this.setResizable(false);
        this.setLocationRelativeTo(null); //centrar
        pack();
    }






}


