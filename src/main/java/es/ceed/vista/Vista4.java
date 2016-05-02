/**
 * Created by carlos on 4/21/16.
 */

package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

public class Vista4 extends JFrame {

    JTextField op1;
    JTextField op2;
    JTextField res;
    JButton suma;

    public Vista4() {
        super("ex31gui");
        init();
    }

    private void init() {

        // 1. inicializa componentes

        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        setResizable(true);
        setLocationRelativeTo(null); //centrar en pantalla
        pack();
    }

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {
        ObtenerSuma();
    }

    public void ObtenerSuma() throws NumberFormatException {
        // 2. Caluclar la suma y actualizar el JTextField res

    }
}

