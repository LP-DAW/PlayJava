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
        vista.getBtn_entrar().setActionCommand("entrar");
        vista.getBtn_salir().setActionCommand("salir");

        /*
        Debemos asociar una acción al evento de pulsación de los botones, eso se hace mediante el
        método addActionListener que se encuentra en la propia clase (this)
        */

        vista.getBtn_entrar().addActionListener(this);
        vista.getBtn_salir().addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch(comando) {
            case "entrar":
                entrar();
                break;
            case "salir":
                salir();
                break;
        }

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
