/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.List;

/**
 *
 * @author lucas
 */
public class Mesa {
    
    private Crupier crupier; //ES NECESARIO QUE CONOZCA AL CRUPIER?
    private List<Jugador> jugadores;
   // private List<Casillero> casilleros; // o conoce casilleros o conoce tipo de apuesta
    private List<TipoApuesta> tiposApuestas; //

    public Mesa() {
       
    }

    
    
    public Crupier getCrupier() {
        return crupier;
    }

    public void setCrupier(Crupier crupier) {
        this.crupier = crupier;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

   

    public List<TipoApuesta> getTiposApuestas() {
        return tiposApuestas;
    }

    public void setTiposApuestas(List<TipoApuesta> tiposApuestas) {
        this.tiposApuestas = tiposApuestas;
    }
    
}
