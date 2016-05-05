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

        Departamento d1 = new Departamento("d1","inf");
        personas.addAll(asList(new Persona("p1","admin","123",d1),new Persona("p2","paco","123",d1)));


    }


     public void checkIn() {
         Scanner sc = new Scanner(System.in);

         while (true) {
             System.out.print("Introduce Nombre (exit para salir): ");
             String nombre = sc.nextLine();
             if (nombre.equalsIgnoreCase("exit")) break;

             System.out.print("Introduce contraseña: ");
             String contraseña = sc.nextLine();

            Persona p = new Persona(null,nombre,contraseña,null);

             if (personas.contains(p)) {
                 System.out.format("El usuario : %s ya existe\n", p.getUsuario());
             } else {
                 personas.add(p);
                 System.out.println("=== Listado de personas ===");
                 listPersonas();
             }

         }
     }

    private void listPersonas() {
        for (Persona p: personas) {
            System.out.println(p);
        }
    }


}


