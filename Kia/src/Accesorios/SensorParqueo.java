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
public class SensorParqueo extends AccesorioDecorator{
    Carro carro;
    public SensorParqueo(Carro carro){
        this.carro = carro;
    }
    @Override
    public String getDescripcion() {
       return carro.getDescripcion() + ", Sensort de parqueo";
    }

    @Override
    public double getPrecio() {
         return .28000 + carro.getPrecio();
    }
}
