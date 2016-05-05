package es.ceed.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import es.ceed.modelo.Departamento;
import es.ceed.modelo.Persona;

import static java.util.Arrays.asList;

/**
 * Created by carlos on 5/4/16.
 */
public class PlayPerson {

    ArrayList<Persona> personas = new ArrayList();

    public PlayPerson() {
        initialize();
        checkIn();
    }

    private void initialize() {
        /* Completa el arrayList personas con los siguientes elementos, sera necesario crear el departamento 1
        D1(d1,"inf")
        P1(p1,"admin","123",d1)
        P2(p1,"paco","123",d1)
         */



    }


     public void checkIn() {
         //Solicitaremos por consola el nombre y contraseña de usuario. Finalizaremos la entrada de datos cuando
         //introduzcamos "exit" como valor de nombre de usuario.
         //Haciendo uso del método contains de la colección comprobaremos que el usuario no existe en nuestra lista
         //En caso de que no exista, lo introduciremos volcando a contincuación el listado de usuarios. (usar foreach)

         Scanner sc = new Scanner(System.in);

         while (true) {
             //solicitamos nombre, en caso de introducir exit saldremos daremos por finalizada la entrada de datos

             //solictamos contraseña

             //Instanciamos un nuevo objeto de clase persona con los datos introducidos


             //si la persona ya esta en la lista, notificar con mensaje de error
             //sino, añadirlo a la lista y llamar a la función listaPersonas() para volcar el contendido de la lista

         }
     }

    private void listPersonas() {
        //Hacer uso de (for) para mostrar los usuarios de la lista por consola
    }


}


