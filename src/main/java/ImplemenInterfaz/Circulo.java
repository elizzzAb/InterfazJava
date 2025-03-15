/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazFiguraGeometrica;

/**
 *
 * @author Elizabeth
 */
public class Circulo implements IInterfazFiguraGeometrica<Double>{
    /**
    private double radio;
    // + constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public Double Area() {
        return Math.PI * radio * radio; // Área = π * r²
    }

    @Override
    public Double Perimetro() {
        return 2 * Math.PI * radio; // Perímetro = 2 * π * r
    }
    
}
