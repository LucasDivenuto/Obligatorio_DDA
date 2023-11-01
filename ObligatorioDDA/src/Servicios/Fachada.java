/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Logica.Crupier;
import Logica.Jugador;

/**
 *
 * @author sofia
 */
public class Fachada {
    
    private ServicioUsuarios sUsuarios;
    //private ServicioTipos sTipos;

    private static Fachada instancia;
    
    private Fachada() {
        sUsuarios = new ServicioUsuarios();
        //sTipos = new ServicioTipos();
    }

    public static Fachada getInstancia() {
        if(instancia == null)
            instancia = new Fachada();
        
        return instancia;
    }

    public void agregar(Jugador jugador) {
        sUsuarios.agregar(jugador);
       
    }

    public void agregar(Crupier crupier) {
        sUsuarios.agregar(crupier);
    }

    public Jugador loginJugador(String cedula, String password) {
        return sUsuarios.loginJugador(cedula, password);
    }

    public Crupier loginCrupier(String cedula, String password) {
        return sUsuarios.loginCrupier(cedula, password);
    }
    
    
    
}
