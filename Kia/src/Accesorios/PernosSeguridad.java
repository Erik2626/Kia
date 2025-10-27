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
public class PernosSeguridad extends AccesorioDecorator{
    Carro carro;
    public PernosSeguridad(Carro carro){
        this.carro = carro;
    }

    @Override
    public String getDescripcion() {
       return carro.getDescripcion() + ",´Pernos de seguridad";
    }

    @Override
    public double getPrecio() {
          return .25000 + carro.getPrecio();
    }
}
