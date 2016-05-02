/**
 * Created by carlos on 4/21/16.
 */

package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

public class Vista3 extends JFrame {
    public Vista3() {
        super("Examen");
        init();
    }

    private void init() {
        JLabel lbl_informa = new JLabel("Pulse para guardar los datos");

        JButton jbtGrMysql = new JButton("Mysql");
        JButton jbtGrDB4o = new JButton("DB4");
        JButton jbtSalir = new JButton("Salir");

        int filas = 1;
        int columnas = 3;
        int espacioFilas = 5;
        JPanel jpPanel1 = new JPanel(new FlowLayout());
        JPanel jpPanel2 = new JPanel(new FlowLayout(filas, columnas, espacioFilas));

        jpPanel1.add(lbl_informa);
        jpPanel2.add(jbtGrMysql);
        jpPanel2.add(jbtGrDB4o);
        jpPanel2.add(jbtSalir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 200));

        //añadimos el jpPanel al JFrame
        this.setLayout(new FlowLayout());
        add(jpPanel1);
        add(jpPanel2);

        lbl_informa.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setResizable(true);
        setLocationRelativeTo(null); //centrar en pantalla
        pack();
    }

}


