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
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setResizable(true);
        setLocationRelativeTo(null); //centrar en pantalla
        pack();
    }

}


