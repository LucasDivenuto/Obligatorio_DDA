/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author lucas
 */
public abstract class TipoApuesta {
    private int factorDePago;
    private String nombre;

    public TipoApuesta(int factorDePago, String nombre) {
        this.factorDePago = factorDePago;
        this.nombre = nombre;
    }
    
    
}
