package es.ceed.controller;

/**
 * Created by carlos on 5/4/16.
 */

import es.ceed.vista.VistaPersona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller1 implements ActionListener {
    private VistaPersona vista;

    public Controller1() {
        vista = new VistaPersona();

        inicializaBotones();
        visualizar();

    }

    public void visualizar() {
        this.vista.setVisible(true);
    }

    private void inicializaBotones() {
        /*
        Debemos asignar una acción/etiqueta a cada boton, para luego poder identificarlo
        y discriminar la acción en el Listener o método que se ejecuta cuando se pulsa uno de ambos botones (entrar o salir)
        */
        //completar

        /*
        Debemos asociar una acción al evento de pulsación de los botones, eso se hace mediante el
        método addActionListener que se encuentra en la propia clase (this)
        */
        //completar


    }

    public void actionPerformed(ActionEvent ae) {
        //completar con un switch dependiendo del valor que tome ae.getActionCommand()

    }

    private void entrar() {
        JOptionPane.showMessageDialog(vista,
                "Has de implementar este método",
                "Inane error",
                JOptionPane.ERROR_MESSAGE);




    }

    private void salir() {
        vista.dispose();

    }


}
