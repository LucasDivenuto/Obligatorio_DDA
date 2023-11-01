/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class AleatorioCompleto extends Efecto{

    @Override
    public int sortear() {
        Random nRandom = new Random();
        return nRandom.nextInt(37);
    }
    
}
