/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Logica.Crupier;
import Logica.Jugador;
import Presentacion.A_Inicio;
import Servicios.Fachada;

/**
 *
 * @author lucas
 */
public class ObligatorioDDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            cargarDatosBase();
            new A_Inicio().setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
     private static void cargarDatosBase() {
        Fachada f = Fachada.getInstancia();

        // JUGADORES---------------------------------------------
        Jugador j1 = new Jugador("201", "aaa");
        j1.setSaldo(1000);
        j1.setNombreCompleto("Walter White");
        
        Jugador j2 = new Jugador("202", "bbb");
        j2.setSaldo(500);
        j2.setNombreCompleto("Jessie Pinkman");
        
        Jugador j3 = new Jugador("203", "ccc");
        j3.setSaldo(100);
        j3.setNombreCompleto("Gustavo Fring");
        
        f.agregar(j1);
        f.agregar(j2);
        f.agregar(j3);
        
        //CRUPIERS-------------------------------------------------
        Crupier c1= new Crupier("101", "aaa");
        //c1.setMesa();
        c1.setNombreCompleto("Saul Goodman");
        
        Crupier c2= new Crupier("102", "bbb");
        //c2.setMesa();
        c2.setNombreCompleto("Hank Shrader");
        
        Crupier c3= new Crupier("103", "ccc");
        //c3.setMesa();
        c3.setNombreCompleto("Mike Ehrmantraut");
        
        f.agregar(c1);
        f.agregar(c2);
        f.agregar(c3);
     }
}
