/**
 * Created by carlos on 4/21/16.
 */

package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

public class Vista2 extends JFrame {
    public Vista2() {
        super("Examen");
        init();
    }

    private void init() {
        //labels
        JLabel lbl_info = new JLabel("");

        //JText
        JTextField txt_id_ex = new JTextField("e1",20);
        JTextField txt_nom_ex = new JTextField("Examen1",20);
        JTextField txt_id_curso = new JTextField("c1",20);
        JTextField txt_nom_curso = new JTextField("Curso 1",20);


        //JButton
        JButton btn_grabar = new JButton("Grabar");
        JButton btn_salir = new JButton("Salir");


        //panels


        JPanel pnl_1 = new JPanel(new GridLayout(4,1));
        pnl_1.add(new JLabel("Id Examen"));
        pnl_1.add(new JLabel("Nombre examen"));
        pnl_1.add(new JLabel("Id Curso"));
        pnl_1.add(new JLabel("Nombre curso"));

        JPanel pnl_2 = new JPanel(new GridLayout(4,1));
        pnl_2.add(txt_id_ex);
        pnl_2.add(txt_nom_ex);
        pnl_2.add(txt_id_curso);
        pnl_2.add(txt_nom_curso);

        JPanel pnl_button = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        pnl_button.add(btn_grabar);
        pnl_button.add(btn_salir);

        JPanel pnl_bottom = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        pnl_bottom.add(lbl_info);

        //window
        this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        add(pnl_1);
        add(pnl_2);
        add(pnl_button);
        add(pnl_bottom);

        //this.setSize(200,300);
        this.setPreferredSize(new Dimension(350,250));
        this.setResizable(true);
        this.setLocationRelativeTo(null); //centrar
        pack();
    }






}


