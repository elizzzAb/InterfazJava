/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazVehiculo;

/**
 *
 * @author Elizabeth
 */
public class Coche implements IInterfazVehiculo<String>{

    @Override
    public String arrancar() {
        return "El conductor gira la llave y el carro arranca.";
    }

    @Override
    public String detener() {
        return "El conductor presiona el freno y el carro se detiene.";
    }
    
    
}
