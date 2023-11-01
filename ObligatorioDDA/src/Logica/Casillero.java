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
public class Casillero {
    private Mesa mesa;
    private TipoApuesta tipoDeApuesta;
    private List<Apuesta> apuestas;

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public TipoApuesta getTipoDeApuesta() {
        return tipoDeApuesta;
    }

    public void setTipoDeApuesta(TipoApuesta tipoDeApuesta) {
        this.tipoDeApuesta = tipoDeApuesta;
    }

    public List<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(List<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }
    
}
