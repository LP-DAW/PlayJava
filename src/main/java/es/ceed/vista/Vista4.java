/**
 * Created by carlos on 4/21/16.
 */

package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

public class Vista4 extends JFrame {
    public Vista4() {
        super("ex31gui");
        init();
    }

    private void init() {
        this.setLayout(new GridLayout(3,2));
        this.add(new JLabel("Operando1"));
        this.add(new JTextField("5",10));

        this.add(new JLabel("Operando2"));
        this.add(new JTextField("3",10));

        this.add(new JButton("Sumar"));
        this.add(new JTextField("5",10));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setResizable(true);
        setLocationRelativeTo(null); //centrar en pantalla
        pack();
    }



}


