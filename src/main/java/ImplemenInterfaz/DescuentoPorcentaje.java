/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazCalcDescuento;

/**
 *
 * @author Elizabeth
 */
public class DescuentoPorcentaje implements IInterfazCalcDescuento<Double>{
    private double porcentaje;
 
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
     }

    @Override
    public Double calcularDescuento(double precio) {
        return precio * (porcentaje / 100);
    }
    
}
