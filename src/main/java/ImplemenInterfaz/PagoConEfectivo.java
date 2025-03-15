/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazPago;

/**
 *
 * @author Elizabeth
 */
public class PagoConEfectivo implements IInterfazPago<String>{

    @Override
    public String procesarPago(Double Cantidad) {
        return "Pago procesado por medio de efectivo: $"+ Cantidad; 
    }
    
    
    
}
