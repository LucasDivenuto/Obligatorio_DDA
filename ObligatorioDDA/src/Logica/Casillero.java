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
    private int codUniversal;
    private int[] numerosAsociados;
    private TipoApuesta tipo;

    public Casillero(int codUniversal, int[] numerosAsociados, TipoApuesta tipo) {
        this.codUniversal = codUniversal;
        this.numerosAsociados = numerosAsociados;
        this.tipo=tipo;
    }
    
    public boolean contieneValor(int x){
        for(int i=0;i<this.numerosAsociados.length; i++){
            if(numerosAsociados[i]==x){
            return true;
            }
        }
        return false;
    }

    public int getCodUniversal() {
        return codUniversal;
    }

    public void setCodUniversal(int codUniversal) {
        this.codUniversal = codUniversal;
    }

    public int[] getNumerosAsociados() {
        return numerosAsociados;
    }

    public void setNumerosAsociados(int[] numerosAsociados) {
        this.numerosAsociados = numerosAsociados;
    }
    
    
    
    
    
    
    
    
    
    private Mesa mesa; // por qué casillero conocería a mesa?
    private TipoApuesta tipoDeApuesta; 
    private List<Apuesta> apuestas; // por qué habría una lista de apuestas?

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
