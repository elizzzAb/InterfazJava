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
public class Rectangulo implements IInterfazFiguraGeometrica<Double>{
/**
    private double ancho;
    private double alto;
    // + constructor para inicializar
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public Double Area() {
        return ancho * alto; // Área = ancho * alto
    }

    @Override
    public Double Perimetro() {
        return 2 * (ancho + alto); // Perímetro = 2 * (ancho + alto)
    }
    
}
