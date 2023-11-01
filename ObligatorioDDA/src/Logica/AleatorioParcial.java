/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class AleatorioParcial extends Efecto{

    @Override
    public int sortear() {
        
        List<Integer> ultimosNumeros =  this.ultimosTresNumerosSorteados();
        
        Random nRandom = new Random();
        int numero = nRandom.nextInt(37);
        
        while(this.estaContenido(numero, ultimosNumeros)){
            numero =  nRandom.nextInt(37);
        }
        return numero;
        
    }
    private boolean estaContenido(int numero, List<Integer> numeros){
        return numeros.contains(numero);
    }
            
    private List<Integer> ultimosTresNumerosSorteados(){
        int validarNumerosEnLista = this.getRondas().size() -3;
        List<Ronda> ultimosElementos = new ArrayList();
        
        if (validarNumerosEnLista >= 0) {
            ultimosElementos = this.getRondas().subList(this.getRondas().size() - 3, this.getRondas().size());
        }else if(validarNumerosEnLista == -1){
            ultimosElementos = this.getRondas().subList(this.getRondas().size() - 2, this.getRondas().size());
        }else{
            ultimosElementos = this.getRondas().subList(this.getRondas().size() - 1, this.getRondas().size());
        }
        List<Integer> ultimosTresNumeros = new ArrayList();
        
        for(Ronda numero: ultimosElementos){
            ultimosTresNumeros.add(numero.getNumeroSorteado());
        }
        return ultimosTresNumeros;
    }
    
}
