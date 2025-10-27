/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accesorios;

import Carro.Carro;

/**
 *
 * @author Estudiantes
 */
public class AlarmaMatrix extends AccesorioDecorator{
    Carro carro;
    public AlarmaMatrix(Carro carro){
        this.carro = carro;
    }

    @Override
    public String getDescripcion() {
        return carro.getDescripcion() + ", Alarma de matrix"; 
    }

    @Override
    public double getPrecio() {
        return .98000 + carro.getPrecio(); 
    }


}
