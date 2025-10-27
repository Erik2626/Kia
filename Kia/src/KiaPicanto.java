
import Accesorios.AlarmaMatrix;

import Accesorios.PernosSeguridad;

import Carro.Carro;
import Carro.GTlineAT;

import Carro.ZenithMT;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class KiaPicanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new GTlineAT();
        System.out.println(carro.getDescripcion()+"$"+carro.getPrecio());
        
        Carro carro3 = new ZenithMT();
        carro3 = new AlarmaMatrix(carro3);
        carro3 = new PernosSeguridad(carro3);
        System.out.println(carro3.getDescripcion()+"$"+carro3.getPrecio());
    }
    
}
