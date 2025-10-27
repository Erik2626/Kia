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
public class MallaCarga extends AccesorioDecorator{
    Carro carro;
    public MallaCarga(Carro carro){
        this.carro = carro;
    }
    @Override
    public String getDescripcion() {
        return carro.getDescripcion() + ", Malla de carga";
    }

    @Override
    public double getPrecio() {
       return .2000 + carro.getPrecio();
    }
}
