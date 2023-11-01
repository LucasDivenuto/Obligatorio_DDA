/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Logica.Casillero;
import Logica.Crupier;
import Logica.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sofia
 */
public class ServicioCasilleros {
    
    List<Casillero> casilleros;

    public ServicioCasilleros() {
        casilleros = new ArrayList();
    }

    public void agregar(Casillero casillero) {
        casilleros.add(casillero);
    }

    
}
